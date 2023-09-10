package com.mendonca;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Conssumer2 {

	public static void main(String[] args) throws JMSException {
	
		String password ="admin";
		String userName ="admin";
		String url = "tcp://localhost:61616";
		
		
		ConnectionFactory factory = new ActiveMQConnectionFactory(userName,password,url);
		
		Connection connection = factory.createConnection();
		connection.start();
		
		Session session = connection.createSession(false,Session.CLIENT_ACKNOWLEDGE);
		Destination destination = session.createQueue("demo");
		
		MessageConsumer consumer = session.createConsumer(destination);
		
		
		consumer.setMessageListener(new MessageListener() {
			
			@Override
			public void onMessage(Message message) {
				
				try {
					TextMessage textMessage = (TextMessage) message;
					String text = textMessage.getText();
					
					JSONObject json = new JSONObject(text);
					System.out.println(json.get("name"));
					
					textMessage.acknowledge();
				} catch (JMSException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		

		
	}

}
