package java_basics;

public class StringDemo {
	public static void main(String[] args) {
		String s1="Hello";
		String s2=new String("Hello");
		String s3="Hello";
		
		System.out.println(s1==s2); //== compares references
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		s1=s1+"World";
		System.out.println(s1);
		
		String name="Niranjan";
		String nameregex="[A-Z]{1}[a-z]{2,}";
		
		System.out.println("Valid name " + name.matches(nameregex));
		
		String cell="8329957610";
		
		String cellphoneregex="[6-9]{1}[0-9]{9}";
		System.out.println("Valid cellphone ="+ cell.matches(cellphoneregex));
		
		String email="niranjanborse16@gmail.com";
		String emailregex="^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
		System.out.println("Valid email "+ email.matches(emailregex));
		
	}
}
