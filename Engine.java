package com.demo.springcore;
import org.springframework.stereotype.Component;

//Annotation
@Component

public class Engine {
	
	 private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Engine(String brand) {
		super();
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Engine [brand=" + brand + "]";
	}

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

}
