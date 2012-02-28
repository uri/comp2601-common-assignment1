package edu.carleton.COMP2601;


import java.util.HashMap;

public class Event {
	String type;
	HashMap<String,Object> map;

	public Event(String type, HashMap<String, Object> map) {
		this.type = type;
		this.map = map;
	}
	
	public Event(Message m) {
		this.type = m.getHeader().getType();
		this.map = m.getBody().map;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public HashMap<String, Object> getMap() {
		return map;
	}

	public void setMap(HashMap<String, Object> map) {
		this.map = map;
	}

	public Object get(String key) {
		return map.get(key);
	}
	
	public void put(String key, Object value) {
		map.put(key, value);
	}
}

