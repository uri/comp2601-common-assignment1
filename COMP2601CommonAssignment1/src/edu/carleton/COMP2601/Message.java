package edu.carleton.COMP2601;

import java.io.Serializable;

public class Message implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2048077991813912135L;
	
	
	public static final String KEY_FILE_LIST = "key_file_list";
	public static final String KEY_FILE = "key_file";
	public static final String KEY_CONTENT = "key_content";
	public static final String KEY_IMAGE = "key_image";
	public static final String KEY_TYPE = "key_type";
	
	public static final String REQ_LIST_FILES=  "list_files_req";
	public static final String REPLY_LIST_FILES= "list_file_reply";
	
	public static final String REQ_LOGIN= "login_req";
	public static final String REPLY_LOGIN= "login_reply";
	
	public static final String REQ_FILE= "file_req";
	public static final String REPLY_FILE= "file_reply";
	
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
