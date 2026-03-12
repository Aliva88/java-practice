class A
{
	int a= 30;
	String b = "Hari";
	static double sd= 30.33;
}
public class B
{
	public static void main(String []args)
	{
		A obj1 = new A();
		A obj2 = new A();
		A obj3 = new A();
		A obj4 = new A();
		System.out.println(obj1.a);
		System.out.println(obj2.b);
		System.out.println(obj3.sd);
		obj1.a= 40;
		obj2.b= "Hello";
		obj3.sd= 40.14;
		System.out.println(obj1.a+" "+obj1.b+" "+obj1.sd);
		System.out.println(obj2.a+" "+obj2.b+" "+obj2.sd);
		System.out.println(obj3.a+" "+obj3.b+" "+obj3.sd);
		System.out.println(obj4.a+" "+obj4.b+" "+obj4.sd);
		
	}
}