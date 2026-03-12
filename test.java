class test
{
	static int a = 10;
	int b = 20;
	
	public void m1()
	{
		a+=10;
		b+=10;
	}
	public static void main(String[] args)
	{
		System.out.println(a+" "+b);
		test t= new test();
		test.a+=10;
		t.b+=10;
		System.out.println(a+" "+b);
	}
}
