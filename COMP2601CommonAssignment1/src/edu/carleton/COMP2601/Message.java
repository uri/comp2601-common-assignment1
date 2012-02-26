package edu.carleton.COMP2601;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;



public class Message implements Serializable, Event{
	private String type;
	private HashMap<String, Object> body;
	
	
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
	
	private static  Gson gson = new GsonBuilder().create();;
	

	
	public Message(String type, HashMap<String, Object> body) {
		this.type = type;
		this.body = body;
	}
	
	public Message(String jsonMessage) {
		System.out.println("Message::making new message with JSON string=" + jsonMessage);
		HashMap<String, Object> reply = gson.fromJson(jsonMessage, HashMap.class);
		
		this.type = (String)reply.remove(KEY_TYPE);
		this.body = new HashMap<String, Object>(reply);
	}
	
	
	public String getType() {
		return type;
	}


	public HashMap<String, Object> getBody() {
		return body;
	}

	
	/** Returns a Json string of the body
	 * @return
	 */
	public String toJSONStr() {
		String ret = "";
		
		// Insert the type
		body.put(KEY_TYPE, type);
		
		ret += gson.toJson(body);
		
		return ret;
	}
	
	public static String jsonTypeMessage(String s) {
		String jsonStr = "";
		jsonStr += "{ ";
		jsonStr += Common.escapedStr(KEY_TYPE);
		
		jsonStr += ":";
		
		jsonStr += Common.escapedStr(s);
		jsonStr += " }";
		
		return jsonStr;
		
	}

}
