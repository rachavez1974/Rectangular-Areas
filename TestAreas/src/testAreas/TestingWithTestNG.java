package testAreas;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingWithTestNG{

	@BeforeTest
	public void testMembersForRetangle1(){
		System.out.println("Declaring a object of type Rectarea and using its default constructor values");
		Rectarea rect1 = new Rectarea();
		System.out.println("Using the return function to print length");
		System.out.println(rect1.getLengthDimension());
		System.out.println("Using print function to print length");
		rect1.printLength();		
		System.out.println("Using the return function to print width");
		System.out.println(rect1.getWidthDimension());
		System.out.println("Using print function to print width");
		rect1.printWidth();
		System.out.println("Using the print function to print all dimenstions");
		rect1.printDimensions();
		System.out.println("Printing area with return funciton: "+rect1.calculateArea());
		System.out.println("Printing area with print function");
		rect1.printArea();
		System.out.println("All output at this time should be zeros");
		System.out.print("Printing number of rectangles with static member using class name");
		System.out.println("Number of rectangles created: " + Rectarea.numOfRectangles);
		System.out.println("***************************************************************************************************\n\n");

		System.out.println("Declaring an object of type Rectarea and using its paremeterized overloaded constructor values");
		Rectarea rect2 = new Rectarea("2.23","3.58");		
		System.out.println("Using the return function to print length");
		System.out.println(rect2.getLengthDimension());
		System.out.println("Using print function to print length");
		rect2.printLength();		
		System.out.println("Using the return function to print width");
		System.out.println(rect2.getWidthDimension());
		System.out.println("Using print function to print width");
		rect2.printWidth();
		System.out.println("Using the print function to print all dimenstions");
		rect2.printDimensions();
		System.out.println("Printing area with return funciton: "+rect2.calculateArea());
		System.out.println("Printing area with print function");
		rect2.printArea();
		System.out.println("The output should be length = 2.23 and width = 3.58 and area = 7.98");
		System.out.println("Number of rectangles created: " + Rectarea.numOfRectangles);
		System.out.println("***************************************************************************************************\n\n");
	}//testMembersForRetangle1() ends here

	@Test
	public void testMembersForRetangle2(){
		System.out.println("Declaring another object of type Rectarea and using its paremeterized overloaded constructor values");
		Rectarea rect3 = new Rectarea("5.23", "6.5");			
		System.out.println("Using the return function to print length");
		System.out.println(rect3.getLengthDimension());
		System.out.println("Using print function to print length");
		rect3.printLength();		
		System.out.println("Using the return function to print width");
		System.out.println(rect3.getWidthDimension());
		System.out.println("Using print function to print width");
		rect3.printWidth();
		System.out.println("Using the print function to print all dimenstions");
		rect3.printDimensions();
		System.out.println("Printing area with return funciton: "+rect3.calculateArea());
		System.out.println("Printing area with print function");
		rect3.printArea();
		System.out.println("The output should be length = 5.23 and width = 6.5 and area = 34.00");
		System.out.println("Number of rectangles created: " + Rectarea.numOfRectangles);
		System.out.println("***************************************************************************************************\n\n");

		System.out.println("Declaring another object of type Rectarea and using its paremeterized overloaded constructor values");
		Rectarea rect4 = new Rectarea();
		System.out.println("Using the return function to print length");
		System.out.println(rect4.getLengthDimension());
		System.out.println("Using print function to print length");
		rect4.printLength();		
		System.out.println("Using the return function to print width");
		System.out.println(rect4.getWidthDimension());
		System.out.println("Using print function to print width");
		rect4.printWidth();
		System.out.println("Using the print function to print all dimenstions");
		rect4.printDimensions();
		System.out.println("Printing area with return funciton: "+rect4.calculateArea());
		System.out.println("Printing area with print function");
		rect4.printArea();
		System.out.println("All output at this time should be zeros again");
		System.out.print("Printing number of rectangles with static member using class name");
		System.out.println("Number of rectangles created: " + Rectarea.numOfRectangles);
		System.out.println("***************************************************************************************************\n\n");
		
		System.out.println("Declaring a object of type Squarea and using its default constructor values");
		Squarea sq1 = new Squarea();
		System.out.println("Using the return function to print length");
		System.out.println(sq1.getLengthDimension());
		System.out.println("Using print function to print length");
		sq1.printLength();		
		System.out.println("Using the return function to print width");
		System.out.println(sq1.getWidthDimension());
		System.out.println("Using print function to print width");
		sq1.printWidth();
		System.out.println("Using the print function to print all dimenstions");
		sq1.printDimensions();
		System.out.println("Printing area with return funciton: "+sq1.calculateArea());
		System.out.println("Printing area with print function");
		sq1.printArea();
		System.out.println("All output at this time should be zeros");
		System.out.print("Printing number of rectangles with static member using class name");
		System.out.println("Number of rectangles created: " + Squarea.numOfSquares);
		System.out.println("***************************************************************************************************\n\n");

		System.out.println("Declaring an object of type Squarea and using its paremeterized overloaded constructor values");
		Rectarea sq2 = new Squarea("4.4","4.00");		
		System.out.println("Using the return function to print length");
		System.out.println(sq2.getLengthDimension());
		System.out.println("Using print function to print length");
		sq2.printLength();		
		System.out.println("Using the return function to print width");
		System.out.println(sq2.getWidthDimension());
		System.out.println("Using print function to print width");
		sq2.printWidth();
		System.out.println("Using the print function to print all dimenstions");
		sq2.printDimensions();
		System.out.println("Printing area with return funciton: "+sq2.calculateArea());
		System.out.println("Printing area with print function");
		sq2.printArea();
		System.out.println("The output should be length = 4.4 and width = 4.00 and area = 17.6");
		System.out.println("Number of squares created: " + Squarea.numOfSquares);
		System.out.println("***************************************************************************************************\n\n");


	}//public void testMembersForRetangle2() ends here

	@AfterTest
	public void TestingForSquares(){
		
	}//TestingForMohRect() ends here

}//TestingWithTestNG() ends here
