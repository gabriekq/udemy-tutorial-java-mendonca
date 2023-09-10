package com.mendonca.topic;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;

public class Consumer {

	public static void main(String[] args) throws JMSException {
		
		
		String password ="gabriel";
		String userName ="gabriel";
		String url = "tcp://localhost:61616";
		
		ConnectionFactory factory = new ActiveMQConnectionFactory(userName,password,url);
		
		Connection connection = factory.createConnection();
		connection.setClientID("1");
		connection.start();
		
		Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
     
		
         Topic topic = session.createTopic("demo-topic");
         
         MessageConsumer consumer = session.createDurableSubscriber(topic, "Consumer-1");
         
         consumer.setMessageListener(new MessageListener() {
			
			@Override
			public void onMessage(Message message) {
			  TextMessage textMessage = (TextMessage) message;
			  try {
				System.out.println(textMessage.getText());
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			}
		});
		
		

	}

}
