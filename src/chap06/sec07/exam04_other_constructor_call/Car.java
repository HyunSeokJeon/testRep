package chap06.sec07.exam04_other_constructor_call;

public class Car {
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxspeed;
	
	//������
	Car(){
		
	}
	// this(): �ڽ��� �ٸ� �����ڸ� ȣ���Ѵ�.
	Car(String model){
		this(model, null, 0);
	}
	Car(String model, String color){
		this(model, color, 0);
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxspeed = maxSpeed;
	}
	
	
	
	
}