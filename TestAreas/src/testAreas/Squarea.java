package testAreas;

public class Squarea extends Rectarea{
	//using static class member to see how they work
	//this variable keeps count of number of rectangles objects declared
	public static int numOfSquares = 0;
		
	public Squarea(){
		this.length = 0;
		this.width = 0;
		numOfSquares++;
	}//Squarea constructor ends here
	//**********************************************
	
	public Squarea(String l, String w){
	
		if(Rectarea.checkIfDouble(l,w)){
			this.length = Double.parseDouble(l); 
			this.width = Double.parseDouble(w);
			numOfSquares++;
			}
		else{
			System.out.println("The dimenstions you've entered are invalid");
		}//if/else ends here

	}//Squarea(String l, String w) ends here
	//**********************************************
		
}//Squarea class ends here