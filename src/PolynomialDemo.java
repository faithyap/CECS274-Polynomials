import java.util.*;
public class PolynomialDemo {
	public static void main(String[] args){
		
		/*********** TEST 1: USUAL CONSTRUCTOR *********************************/
		System.out.println("********************** TEST 1 *************************");
		Polynomial fPoly = new Polynomial(); //constructing a polynomial
		ArrayList<Double> fCoeffs = new ArrayList<Double>(); 
                fCoeffs.add(1.0);
                fCoeffs.add(-1.0);
                fCoeffs.add(1.0);
                fCoeffs.add(1.0);
                fCoeffs.add(0.0);
                fCoeffs.add(-1.0);

		//Method 3(a)  setting the coefficients
		fPoly.setAllCoeff(fCoeffs);	
		
		//Method 2(d) getting string representation of polynomial
		System.out.println(fPoly.getPolyExpr());	
		System.out.println("Expected: x^5 - x^4 + x^3 + x^2 - 1 \n");
		
		//Method 2(a) getting the degree of the polynomial
		System.out.println("Degree of Polynomial: " + fPoly.getPolyDeg() );	//Printing degree
		System.out.println("Expected: 5 \n");
		
		//Method 3(d) inserting a term
		fPoly.insertDeg(7, -9); //Inserting a term of degree 7 with coeff -9
		fPoly.insertDeg(6, 2);  //Inserting a term of degree 6 with coeff 2
		
		System.out.println(fPoly.getPolyExpr());  
		System.out.println("Expected: -9.0x^7 + 2.0x^6+ x^5 - x^4 + x^3 + x^2 - 1 \n");
		
		System.out.println("Degree of Polynomial: " + fPoly.getPolyDeg() );	
		System.out.println("Expected: 7 \n");
		
		//Method 2(b) get the coefficient of term with a given degree 
		System.out.println("Coefficient of term with degree 4: " + fPoly.getCoeff(4) ); 
		System.out.println("Expected: -1.0 \n");
		
		//Method 2(c) getting all the coefficients
		System.out.println(fPoly.getAllCoeff());
		System.out.println("Expected: [-9.0, 2.0, 1.0, -1.0, 1.0, 1.0, 0.0, -1.0] \n");
		
		//Method 3(b) editing the coefficient of a term with given degree
		fPoly.setCoeff(4, 3.2);	//setting coefficient of term with degree 4 to 3
		
		//Method 3(c) removing a term
		fPoly.removeDeg(2);	 //removing the term with degree 2
		
		System.out.println(fPoly.getPolyExpr());
		System.out.println("Expected: -9.0x^7 + 2x^6+ x^5 + 3.2x^4 + x^3 - 1 \n");
		
		//Method 2(c) getting all the coefficients
		System.out.println(fPoly.getAllCoeff());
		System.out.println("Expected: [-9.0, 2.0, 1.0, 3.2, 1.0, 0.0, 0.0, -1.0] \n");
		
		//Method 2(e) evaluate at a given value
		System.out.println("The value of the polynomial at -2.3 is " + fPoly.eval(-2.3));
		System.out.println("Expected: 3372.43337 \n");
		
		/*********** TEST 2: OVERLOADED CONSTRUCTOR *********************************/
		System.out.println("********************** TEST 2 *************************");
                ArrayList<Double> gCoeffs = new ArrayList<Double>();
                gCoeffs.add(2.0);
                gCoeffs.add(-3.0);
                gCoeffs.add(4.0);
                gCoeffs.add(0.0);
                gCoeffs.add(0.0);
		Polynomial gPoly = new Polynomial(gCoeffs); //invoking overloaded constructor
		
		//Method 2(d) getting string representation of polynomial
		System.out.println(gPoly.getPolyExpr());	
		System.out.println("Expected: 2.0x^4 - 3.0x^3 + 4x^2 \n");
		
		//Method 2(a) getting the degree of the polynomial
		System.out.println("Degree of Polynomial: " + gPoly.getPolyDeg() );	//Printing degree
		System.out.println("Expected: 4 \n");
		
		//Method 3(d) inserting a term
		gPoly.insertDeg(6, -14); //Inserting a term of degree 6 with coeff -14
		gPoly.insertDeg(0, 10.5); //Inserting a term of degree 6 with coeff -14
		
		System.out.println(gPoly.getPolyExpr());  
		System.out.println("Expected: -14.0x^6 + 2.0x^4 - 3.0x^3 + 4.0x^2 + 10.5\n");
		
		System.out.println("Degree of Polynomial: " + gPoly.getPolyDeg() );	
		System.out.println("Expected: 6 \n");
		
		//Method 2(b) get the coefficient of term with a given degree 
		System.out.println("Coefficient of term with degree 1: " + gPoly.getCoeff(1) ); 
		System.out.println("Expected: 0.0 \n");
		
		//Method 2(c) getting all the coefficients
		System.out.println(gPoly.getAllCoeff());
		System.out.println("Expected: [-14.0, 0.0, 2.0, -3.0, 4.0, 0.0, 10.5] \n");
		
		//Method 3(b) editing the coefficient of a term with given degree
		gPoly.setCoeff(3, -7);	//setting coefficient of term with degree 3 to -7
		
		//Method 3(c) removing a term
		gPoly.removeDeg(4);	 //removing the term with degree 4
		
		System.out.println(gPoly.getPolyExpr());
		System.out.println("Expected: -14.0x^6 - 7.0x^3 + 4.0x^2 + 10.5 \n");
		
		//Method 2(c) getting all the coefficients
		System.out.println(gPoly.getAllCoeff());
		System.out.println("Expected:[-14.0, 0.0, 0.0, -7.0, 4.0, 0.0, 10.5] \n");
		
		//Method 2(e) evaluate at a given value
		System.out.println("The value of the polynomial at -2.3 is " + gPoly.eval(-2.3));
		System.out.println("Expected:-1955.673446 \n");
		
		/*********** TEST 3: UNDEFINED COEFFICIENTS *********************************/
		System.out.println("********************** TEST 3 *************************");
		Polynomial hPoly = new Polynomial(); //constructing a polynomial
			
		//Method 2(d) getting string representation of polynomial
		System.out.println(hPoly.getPolyExpr());	
		System.out.println("Expected: Coefficients have not been set");
	}
}