package java_basics;

@FunctionalInterface
interface Hello
{
	String greet();
	
	default void demo()  //full
	{
		System.out.println("Hello Demo"+temp());
	}
	
	static void test()
	{
		System.out.println("Hello Test");
	}
	
	private String temp()
	{
		return "Hello Temp";
	}
	
}
interface Printer 
{
	void print(String name);
}
public class LambdaDemo {
	
	public static void main(String[] args) {
		Hello h1 = () ->"Hello Lambda";
		System.out.println(h1.greet());
		
		h1.demo();
		Hello h2= ()->{
			String msg="Bonjour Lambda";
			return msg;
			
		};
		System.out.println(h2.greet());
		
		Printer p1=(name)->System.out.println(name);
		
		p1.print("Niranjan");
		
		Printer p2=System.out::println;
		p2.print("Amazing");
		
		Hello.test();
		

	}
	
}
