package java_basics;

public class Car {
	
	private String model;
	private String[] features;
	
	public Car(String model, String...features) {  //Variable arguments var-args:can be the last argument of the method
		super();
		this.model = model;
		this.features = features;
	}
	
	
	public void specs()
	{
		System.out.println("Features of "+ model);
		
		for(String f:features)
				System.out.println(f);
	}
	
	public static void main(String[] args) {
		Car c1 = new Car("Nexon","Airbags","Keyless entry","ADAS");
		c1.specs();
	}
}
