package model;

import entities.Shape;
import enums.Color;

public class Rectangle extends Shape {

	private Double width;
	private Double weight;

	public Rectangle() {
		super();
	}

	public Rectangle(Color color, Double width, Double weight) {
		super(color);
		this.width = width;
		this.weight = weight;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getWidth() {
		return width;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getWeight() {
		return weight;
	}

	@Override
	public Double area() {
		return width * weight;
	}

}
