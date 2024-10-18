class Private
{
	int a; double b; String c;
	private Private()
	{
		a=10; b=30.36; c="Ankit";
		System.out.println(a+" "+b+" "+c);	
	}
	public static void main(String arg[])
	{
		Private sc=new Private();

	}
}