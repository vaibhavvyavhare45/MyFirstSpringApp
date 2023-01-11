package com.prowings.beans;

import java.util.Properties;

public class Prop {
	Properties p;

	public Prop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Prop(Properties p) {
		super();
		this.p = p;
	}

	public Properties getP() {
		return p;
	}

	public void setP(Properties p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Prop [p=" + p + "]";
	}
	
	

}
