
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		MethodsDemo1 d1 = new MethodsDemo1();
		d1.getUserData();
		getData1();
	}

	public String getData() {
		System.out.println("Hello World");
		return "rahul shetty";
	}

	public static String getData1() {
		System.out.println("Hello World");
		return "rahul shetty";
	}

}
