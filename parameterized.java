class constructor
{
	int x,y;
	constructor(int a,int b)
	{
		x=a; y=b;
	}
	constructor(int a, String name)
	{
		System.out.println(a+" "+name);
	}
	void show()
	{
		System.out.println(x+" "+y);
	}
}
class parameterized
{
	public static void main(String args[]){
	constructor s=new constructor(100,200);
	
	
	constructor sc=new constructor(500, "Akshaylal");
	s.show();
	
}	
}
