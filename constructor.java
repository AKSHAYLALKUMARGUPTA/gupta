class defaultconstructor
{
	int a; String b; boolean c;
	defaultconstructor()
	{
		a=100;
		b="Akshay";
		c=true;
	}
	void disp()
	{
		System.out.println(a+"  "+b+"  "+c);
	}

}
class constructor
{
	public static void main(String args[])
	{
	defaultconstructor sc=new defaultconstructor();
	{
		sc.disp();	
	}
	}
}