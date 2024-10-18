class constructor
{
	int a;
	String b;
	constructor()
	{
		a=100;
		b="Learncoding";
		System.out.println(a+" "+b);
	}
	constructor(constructor ref)
	{
		a=ref.a;
		b=ref.b;
		System.out.println(a+" "+b);
	}
}
class copy
{
	public static void main(String args[])
	{
	constructor r=new constructor();
	constructor r2=new constructor(r);
	}
}