package com.mendonca;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.json.JSONObject;

import netscape.javascript.JSObject;

public class RealTimeExemple {

	public static void main(String[] args) throws JMSException {
		
		String password ="admin";
		String userName ="admin";
		String url = "tcp://localhost:61616";
		
		
		ConnectionFactory factory = new ActiveMQConnectionFactory(userName,password,url);
		Connection connection = factory.createConnection();
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		Destination destination = session.createQueue("demo");
		
		JSONObject json = new JSONObject();
		json.put("from_date","01-Jan-2019");
		json.put("email","abc@aaa.com");
		json.put("name","Gabriel");
		
		TextMessage textMessage = session.createTextMessage(json.toString());
		MessageProducer producer = session.createProducer(destination);
		producer.send(textMessage);
		
		session.close();
		connection.close();
		
	}

}
