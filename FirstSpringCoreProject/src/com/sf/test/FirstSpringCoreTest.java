package com.sf.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sf.bean.IMessageConverter;
import com.sf.bean.MessageWriter;

public class FirstSpringCoreTest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com\\sf\\common\\application-context.xml"));
		MessageWriter messageWriter = (MessageWriter) beanFactory.getBean("messageWriter");
		IMessageConverter messageConverter = (IMessageConverter)beanFactory.getBean("pdfMessageConverter");
		messageWriter.setMessageConverter(messageConverter);
		messageWriter.writeMessage("Welcome to Spring");		
	}
}
