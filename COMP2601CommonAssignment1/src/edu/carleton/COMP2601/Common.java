package edu.carleton.COMP2601;

public class Common {
	public static int PORT = 7001;
	public static String IP_ADDRESS= "192.168.0.106";
	public final static String ESC_QUOTE = "\"";
	

	
	public static String escapedStr(String s) {
		return ESC_QUOTE + s + ESC_QUOTE;
	}
	
}
