
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d = new MethodsDemo();
		String name= d.getData();
		System.out.println(name);
		getData2();
		MethodsDemo2 d1= new MethodsDemo2();
		System .out.println(d1.getUserData());
	}
	public String getData()
	{
		System.out.println("good morning");
		return "Manoj";
	}
	public static String getData2()
	{
		System.out.println("hi how are u");
		return "hey where are u";
	}
}
