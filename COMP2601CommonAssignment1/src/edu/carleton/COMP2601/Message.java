package edu.carleton.COMP2601;

import java.io.Serializable;

public class Message implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2048077991813912135L;
	Header header;
	Body body;
	
	public Message(String s) {
		header = new Header(s);
		body = new Body();
	}

	public Header getHeader() {
		return header;
	}

	public Body getBody() {
		return body;
	}
	
	public String toString() {
		return header.toString()+":"+body.toString();
	}
}
