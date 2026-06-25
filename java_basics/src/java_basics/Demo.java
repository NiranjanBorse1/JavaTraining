package java_basics;


public class Demo<T> {
	
	private T data;
	public Demo(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
		
	}
	public static void main(String[] args) {
		Demo<String> d1=new Demo<String>("Hola");//Generic (Tightly typed restricted to specific type)
		//d1.setData(100);   //Loosely Typed (with any type no restriction so we are using generic)
		System.out.println(d1.getData());
		
		Demo<Double> d2=new Demo<Double>(3.14);
		System.out.println(d2.getData());
		
		//Demo d3=new Demo(new Person("Kim",22));
		//System.out.println(d3.getData());
		
		
		
	}
}
