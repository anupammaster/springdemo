package com.sf.bean;

public class HtmlMessageConverterImpl implements IMessageConverter {

	/* (non-Javadoc)
	 * @see com.sf.bean.IMessageConverter#convert(java.lang.String)
	 */
	@Override
	public String convert(String message) {
		// TODO Auto-generated method stub
		return "<html><body> "+message +" </body></html>";
	}

}
