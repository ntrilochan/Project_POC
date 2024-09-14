package tests;

public class ClassA 
{
	public void meth1()
	{
		System.out.println("meth 1 called");
	}
	public void meth2()
	{
		System.out.println("meth 2 called");
	}
	public static void main(String[] args) 
	{
		ClassA obj=new ClassA();
		obj.meth1();
		obj.meth2();
	}
}
