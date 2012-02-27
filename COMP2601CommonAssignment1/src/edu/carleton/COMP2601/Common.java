package edu.carleton.COMP2601;

public class Common {
	public static int PORT = 7001;
	public static String IP_ADDRESS= "10.0.2.2";
	public final static String ESC_QUOTE = "\"";
	
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
	
	public static String escapedStr(String s) {
		return ESC_QUOTE + s + ESC_QUOTE;
	}
	
}
