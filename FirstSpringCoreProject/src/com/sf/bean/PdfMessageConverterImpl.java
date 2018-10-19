package com.sf.bean;

public class PdfMessageConverterImpl implements IMessageConverter {

	/* (non-Javadoc)
	 * @see com.sf.bean.IMessageConverter#convert(java.lang.String)
	 */
	@Override
	public String convert(String message) {
		// TODO Auto-generated method stub
		return "<pdf> "+message +"</pdf>";
	}

}
