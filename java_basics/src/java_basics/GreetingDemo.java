package java_basics;

interface Greeting
{
	void sayHello();
}
public class GreetingDemo {
	class GreetingInnerImpl implements Greeting
	{
		@Override
		public void sayHello()
		{
			System.out.println("Greeting inner impl");
		}
	}
	
	
	public static void main(String[] args) {
		GreetingDemo demo =new GreetingDemo();
		Greeting g1=demo.new GreetingInnerImpl();
		
		g1.sayHello();
		
		//Anonymous inner class
		Greeting g =new Greeting() {
			@Override
			public void sayHello()
			{
				System.out.println("Greeting from anonymous inner class");
			}
		};
		g.sayHello();
		
		//Lambda Expression No seperate .class file
		Greeting greet = ()->System.out.println("Greeeting from Lambda");
		greet.sayHello();
	}
}
