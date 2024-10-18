class person{

	int age=21;
	int weight=56;
	String color="light";

	void eat()
	{
		System.out.println("I am eating");
	}
	void sleep()
	{
		System.out.println("i am sleeping");
	}
	void running()
	{
		System.out.println("i am runing 12 km per day it is my strength");
	}

	public static void main(String args[]){
	person p=new person(); 
	System.out.println(p.age);
	System.out.println(p.weight);
	System.out.printl(p.color);
	p.eat(); p.sleep(); p.running();		
	}
	}
}