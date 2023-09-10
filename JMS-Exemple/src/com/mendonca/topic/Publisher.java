package com.mendonca.topic;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class Publisher {

	public static void main(String[] args) throws JMSException {
		
		String password ="gabriel";
		String userName ="gabriel";
		String url = "tcp://localhost:61616";
		
		ConnectionFactory factory = new ActiveMQConnectionFactory(userName,password,url);
		
		Connection connection = factory.createConnection();
		
		Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
         Destination destination = session.createTopic("demo-topic");
         
         MessageProducer producer = session.createProducer(destination);
         TextMessage textMessage = session.createTextMessage("Message for Topic 1 e 2 mendonca");
         
         producer.send(textMessage);
         System.out.println("message to the topic");
		  session.close();
		  connection.close();
         
         
	}

}
