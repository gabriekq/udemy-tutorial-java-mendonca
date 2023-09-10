package com.mendonca;

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

		String password ="admin";
		String userName ="admin";
		String url = "tcp://localhost:61616";
		
      ConnectionFactory factory = new ActiveMQConnectionFactory(userName,password,url);
		
      Connection connection = factory.createConnection();
		
      Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
      Destination destination = session.createQueue("demo");
      
      String[] menssages = {"First Menssage","Second Menssage","Thrid Menssage","4 menssag"};
      MessageProducer producer = session.createProducer(destination);
      for(String message : menssages) {
    	TextMessage textMessage = session.createTextMessage(message);
        producer.send(textMessage);  
      }

      System.out.println("menssage sent");
      connection.close();

	}

}
