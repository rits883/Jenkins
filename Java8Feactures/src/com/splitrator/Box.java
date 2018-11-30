package com.splitrator;

public class Box {

	private float lenght ;
	private float hight;
	private float weight;
	
	public Box(float lenght ,float hight ,float weight) {
	this.lenght = lenght;
	this.hight = hight;
	this.weight = weight;
	}

	public float getLenght() {
		return lenght;
	}

	public void setLenght(float lenght) {
		this.lenght = lenght;
	}

	public float getHight() {
		return hight;
	}

	public void setHight(float hight) {
		this.hight = hight;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
	
}
