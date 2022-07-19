package com.demo.springcore;

import org.springframework.stereotype.Component;


@Component()
public class Car implements Vehichle {

	public void drive() {
		System.out.println("Driving Car");
	}
}






