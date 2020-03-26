package com.hashanr.microservices;

public class LimitConfiguration {
	
	private int maximum;
	int minimum;
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int inimum) {
		this.minimum = inimum;
	}
	public LimitConfiguration(int maximum, int inimum) {
		super();
		this.maximum = maximum;
		this.minimum = inimum;
	}
	
	
	 protected LimitConfiguration() {
		 
	 }

}
