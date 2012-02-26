package edu.carleton.COMP2601;

import java.io.Serializable;

public class Header implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5476715863008481311L;
	private String source;
	private String dest;
	private String type;
	private int id;
	private int sequence;
	public static String TEST = "TEST";
	
	Header(String s, String d, String type, int id, int sequence) {
		this.source = s;
		this.dest = d;
		this.id = id;
		this.sequence = sequence;
	}
	
	Header(String s) {
		this.source = s;
		this.dest = s;
		this.setType(TEST);
		this.id = 0;
		this.sequence = 0;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return source+":"+dest+":"+type+"("+id+","+sequence+")";
	}
}
