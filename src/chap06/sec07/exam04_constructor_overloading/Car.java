package chap06.sec07.exam04_constructor_overloading;

public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxspeed;
	
	//생성자
	Car(){
		
	}
	Car(String model){
		this.model = model;
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxspeed = maxSpeed;
	}
	
	
	
	
}
