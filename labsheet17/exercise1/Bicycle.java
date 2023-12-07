package labsheet17.exercise1;

//Bicycle.java
/*This instantiable class models a bicycle and will be used in the GUI application BicycleShopApp*/

import java.io.Serializable;

public class Bicycle implements Serializable{
	
	private String owner;
	private double price;
	private String make;
	
	public  Bicycle(String owner, double price, String make){
		setOwner(owner);
		setPrice(price);
		setMake(make);
	}
	
	public  Bicycle(){
		this("Not Assigned", 0, "Not Assigned");
	}

	
	public void setOwner(String owner){
		this.owner = owner;
	}
	
	public void setMake(String make){
		this.make = make;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public String getOwner(){
	  return owner;	
	}
	
	public String getMake(){
	  return make;	
	}
	
	public double getPrice(){
	  return price;
	}
	
	public String toString() {
		return "Owner: " + getOwner() + " Make: " + getMake() + " Price: €" + String.format("%.2f",getPrice());
	}
}