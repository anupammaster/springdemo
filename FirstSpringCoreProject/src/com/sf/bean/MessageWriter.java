package com.sf.bean;

public class MessageWriter {
	private IMessageConverter messageConverter;
	
	public void writeMessage(String message) {
		String cMessage = null;
		//messageConverter = new HtmlMessageConverterImpl();
		cMessage = messageConverter.convert(message);
		System.out.println(cMessage);		
	}
	/**
	 * @param messageConverter the messageConverter to set
	 */
	public void setMessageConverter(IMessageConverter messageConverter) {
		this.messageConverter = messageConverter;
	}
}
