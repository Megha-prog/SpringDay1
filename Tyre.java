package com.demo.springcore;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
//Annotation
@Component("TyreBean")

public class Tyre {
    
    public Tyre(String brand) {
		super();
		this.brand = brand;
	}
//@Autowired(required=true)
	private String brand;

   
    public String getBrand() {
        return brand;
    }
@Autowired(required=true)
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Tyre [brand=" + brand + "]";
    }

	public Tyre() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
