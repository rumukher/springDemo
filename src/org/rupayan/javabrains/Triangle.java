package org.rupayan.javabrains;

public class Triangle {
	private String type;
	private int height;

	public Triangle(String type) {
		this.type = type;
	}

	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}

	public Triangle(int height) {
		this.height = height;
	}

	public String getType() {
		return type;
	}

	/*public void setType(String type) {
		this.type = type;
	}*/

	public int getHeight() {
		return height;
	}

	public void draw(){
		System.out.println(type + " Triangle drawn of height " + height);
	}

}
