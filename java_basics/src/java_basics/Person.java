package java_basics;

public class Person implements Cloneable {
	private String name;
	private int age;
	
	public Person()
	{
		//name="Anonymous";
		//age=-1;
		
		this("Anonymous",-1); //Constructor Chaining 
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void print()
	{
		System.out.println("Name :"+ name + ", Age "+ age);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Person) {
			Person p=(Person) obj;
			
			if(this.age==p.age && name.equals(p.name))
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1=new Person("Niranjan",21);
		p1.print();
		Person p2=new Person();
		p2.print();
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1); // Implicitly calls toString() on object	
		
		System.out.println(p1.equals(p2)); //Compares hashcode by default
		
		Person pc=(Person) p1.clone();
		System.out.println(pc); 
	}
	
	
}
