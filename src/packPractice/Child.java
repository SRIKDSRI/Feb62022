package packPractice;

public class Child extends Parent { 
	Child() { 
		System.out.println("Bike is created."); 
	}

Child(String brand)
{
	//this();
	 
    //super(); // it calls Vehicle(), the parent class
             // constructor of class Bike
    
    System.out.println("I have made a change in practice project");
   
}

public void cmethod() {
	
}

public static void main(String args[])
{
    Child bike = new Child("Honda");
    
    
}
}
