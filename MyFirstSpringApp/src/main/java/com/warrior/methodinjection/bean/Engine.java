package com.warrior.methodinjection.bean;

import org.springframework.context.annotation.Bean;

public class Engine {
	private int capacity;
	private String type;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", type=" + type + "]";
	}
	
}
