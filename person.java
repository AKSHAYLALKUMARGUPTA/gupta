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
		System.out.println("I am sleeping");
	}
	public static void main(String args[]){
	person p=new person();
	System.out.println(p.age);
	System.out.println("p.sleep");
	
	p.eat(); p.sleep();
	}
	
}