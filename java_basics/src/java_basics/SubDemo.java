package java_basics;

public class SubDemo<T,P> extends Demo<T> {
	private P temp;
	public SubDemo(T data, P temp) {
		super(data);
		this.temp = temp;
	}
	public P getTemp() {
		return temp;
	}
	public void setTemp(P temp) {
		this.temp = temp;
	}
   public static void main(String[] args) {
	SubDemo<String,Integer>sd=new SubDemo<String,Integer>("Jim",90);
	
	System.out.println(sd.getData()+ "\t"+ sd.getTemp());
	
	
}
	
}
