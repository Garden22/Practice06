package com.javaex.ex03;

public class Shape {
	
	protected String fillColor; // private는 자식 class도 접근 불가
	protected String lineColor;
	
	public Shape() {
		
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
}

