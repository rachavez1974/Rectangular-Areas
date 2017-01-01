package testAreas;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingWithTestNG {

	@BeforeTest
	public void testMembersForRetangle1(){
		System.out.println("declaring a object of type Rectarea and using its default constructor values");
		Rectarea rect1 = new Rectarea();
		System.out.println("using the return function to print length");
		System.out.println(rect1.getLengthDimension());
		System.out.println("using print function to print length");
		rect1.printLength();		
		System.out.println("using the return function to print width");
		System.out.println(rect1.getWidthDimension());
		System.out.println("using print function to print width");
		rect1.printWidth();
		System.out.println("using the print function to print all dimenstions");
		rect1.printDimensions();
		System.out.println("Printing area with return funciton: "+rect1.calculateArea());
		System.out.println("Printing area with print function");
		rect1.printArea();
		System.out.println("All output at this time should be zeros");
		System.out.print("Printing number of rectangles with static member using class name");
		System.out.println("Number of rectangles created: " + Rectarea.numOfRectangles);
		System.out.println("***************************************************************************************************\n\n");
		
	}//testMembersForRetangle1() ends here
	
		@Test
		public void testMembersForRetangle2(){
		System.out.println("declaring an object of type Rectarea and using its paremeterized overloaded constructor values");
		Rectarea rect2 = new Rectarea("2.23","3.58");		
		System.out.println("using the return function to print length");
		System.out.println(rect2.getLengthDimension());
		System.out.println("using print function to print length");
		rect2.printLength();		
		System.out.println("using the return function to print width");
		System.out.println(rect2.getWidthDimension());
		System.out.println("using print function to print width");
		rect2.printWidth();
		System.out.println("using the print function to print all dimenstions");
		rect2.printDimensions();
		System.out.println("Printing area with return funciton: "+rect2.calculateArea());
		System.out.println("Printing area with print function");
		rect2.printArea();
		System.out.println("The output should be length = 2.23 and width = 3.58 and area = 7.98");
		System.out.println("Number of rectangles created: " + Rectarea.numOfRectangles);
		System.out.println("***************************************************************************************************\n\n");
		}//public void testMembersForRetangle2() ends here
		
		@AfterTest
		public void TestingForMohRect(){
			System.out.println("declaring another object of type Rectarea and using its paremeterized overloaded constructor values");
			Rectarea rect3 = new Rectarea("5.23", "6.5");			
			System.out.println("using the return function to print length");
			System.out.println(rect3.getLengthDimension());
			System.out.println("using print function to print length");
			rect3.printLength();		
			System.out.println("using the return function to print width");
			System.out.println(rect3.getWidthDimension());
			System.out.println("using print function to print width");
			rect3.printWidth();
			System.out.println("using the print function to print all dimenstions");
			rect3.printDimensions();
			System.out.println("Printing area with return funciton: "+rect3.calculateArea());
			System.out.println("Printing area with print function");
			rect3.printArea();
			System.out.println("The output should be length = 5.23 and width = 6.5 and area = 34.00");
			System.out.println("Number of rectangles created: " + Rectarea.numOfRectangles);
			System.out.println("***************************************************************************************************\n\n");
			
			System.out.println("declaring another object of type Rectarea and using its paremeterized overloaded constructor values");
			Rectarea rect4 = new Rectarea();
			System.out.println("using the return function to print length");
			System.out.println(rect4.getLengthDimension());
			System.out.println("using print function to print length");
			rect4.printLength();		
			System.out.println("using the return function to print width");
			System.out.println(rect4.getWidthDimension());
			System.out.println("using print function to print width");
			rect4.printWidth();
			System.out.println("using the print function to print all dimenstions");
			rect4.printDimensions();
			System.out.println("Printing area with return funciton: "+rect4.calculateArea());
			System.out.println("Printing area with print function");
			rect4.printArea();
			System.out.println("All output at this time should be zeros again");
			System.out.print("Printing number of rectangles with static member using class name");
			System.out.println("Number of rectangles created: " + Rectarea.numOfRectangles);
			System.out.println("***************************************************************************************************\n\n");
			
					}//TestingForMohRect() ends here
	
}//TestingWithTestNG() ends here
