package testAreas;

public class Rectarea {
	//using static class member to see how they work
		//this variable keeps count of number of rectangles objects declared
		static public int numOfRectangles = 0;

		private double length;
		private double width;

		public Rectarea(){
			length = 0;
			width = 0;
			numOfRectangles++;		
		}//Rectarea() constructor ends here
		//**********************************************

		public void setDimensions(String l, String w){
			if(checkIfDouble(l,w)){
				length = Double.parseDouble(l);
				width = Double.parseDouble(w);
			}
			else{
				System.out.println("The dimenstions you've entered are invalid");
			}//if/else ends here

		}//setDimensions() ends here

		//Utility method to check if string is a double
		private boolean checkIfDouble(String l, String w) {
			DecimalFormat decFormat = new DecimalFormat();

			try{
				@SuppressWarnings("unused")
				double dimension1 = decFormat.parse(l).doubleValue();
				@SuppressWarnings("unused")
				double dimension2 = decFormat.parse(w).doubleValue();
				return true;
			}catch(Exception e){
				return false;
			}

		}//checkIfDouble() ends here.
		//**********************************************

		public double getLengthDimension(){
			return length;
		}//getLengthDimension() ends here
		//**********************************************

		public double getWidthDimension(){
			return width;
		}//getWidthDimension()
		//**********************************************

		public double calculateArea(){
			return length * width;
		}//calculateAread ends here
		//**********************************************

		public void printArea(){
			double area = length * width;
			System.out.println(area);
		}//firstRectangle() ends here

		public void printNumOfRectangles(){
			System.out.println(numOfRectangles);
		}//getNumOfRectangles() ends here
		//**********************************************

		public void printRectLength(){
			System.out.println(length);
		}//printRectLength() end here
		//**********************************************

		public void printRectWidth(){
			System.out.println(width);
		}//printRectWidth() end here
		//**********************************************

		public void printRectDimensions(){
			System.out.println(length + " " + width);
		}//printRectDimensions() end here
		//**********************************************

}//Rectarea ends here.
