package packPractice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Child extends Parent { 
	Child() { 
		System.out.println("Bike is created."); 
	}

Child(String brand)
{
	//this();
	 
    //super(); // it calls Vehicle(), the parent class
             // constructor of class Bike
    
    System.out.println("Bike brand is " + brand);
   
}

public void cmethod() {
	
}

public static void main(String args[])
{
    Child bike = new Child("Honda");
    
    
}
}
