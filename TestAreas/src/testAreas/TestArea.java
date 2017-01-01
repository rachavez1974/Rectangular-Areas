package testAreas;

import org.testng.annotations.Test;

public class TestArea {
	
	@Test
	public void firstRectangle(){
	System.out.println("Declaring a new object of type Rectarea and printing its default values");
	Rectarea rect1 = new Rectarea();
	rect1.printRectDimensions();
	System.out.println("Printing length with return getfunction: "+rect1.getLengthDimension());
	System.out.println("Printing width with return getfunction: "+rect1.getWidthDimension());
	System.out.println("Printing length with printfucntion()");
	rect1.printRectLength();
	System.out.println("Printing width with printfucntion()");
	rect1.printRectWidth();
	System.out.println("Printing area with return calculateArea(): "+ rect1.calculateArea());
	System.out.println("Printing area with printfunction()");
	rect1.printArea();
	System.out.println("Printing number of rectangles declared with static member using class name.");
	System.out.println(Rectarea.numOfRectangles);
	System.out.println("Printing number of rectangles declared with nonstatic function member");
	rect1.printNumOfRectangles();
		
	}//firstRectangle() ends here

}//TestArea class ends here
