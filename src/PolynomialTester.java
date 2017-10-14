import java.util.ArrayList;
public class PolynomialTester {
		public static void main(String[] args){
			
/*************** TEST 1: USUAL CONSTRUCTOR *********************************/			
			System.out.println("********************** TEST 1 *************************");
                        ArrayList<Double> gCoeffs = new ArrayList<Double>();
                        gCoeffs.add(-5.5);  gCoeffs.add(7.23);
                        gCoeffs.add(-4.9);  gCoeffs.add(0.0);   gCoeffs.add(1.0);
			//Polynomial gPoly = new Polynomial();
			//gPoly.setAllCoeff(gCoeffs);
		
/*************** TEST 2: OVERLOADED CONSTRUCTOR *********************************/
			System.out.println("********************** TEST 2 *************************");		
			Polynomial gPoly = new Polynomial(gCoeffs); //invoking overloaded constructor
			
			//Method 2(d) getting string representation of polynomial
			System.out.println(gPoly.getPolyExpr());	
			System.out.println("Expected: -5.5x^4 + 7.23x^3 - 4.9x^2 + 1.0\n");
			
			//Method 2(a) getting the degree of the polynomial
			System.out.println("Degree of Polynomial: " + gPoly.getPolyDeg() );	//Printing degree
			System.out.println("Expected: 4 \n");
			
			//Method 3(d) inserting a term
			gPoly.insertDeg(7, -2.1); //Inserting a term of degree 7 with coeff -2.1
			gPoly.insertDeg(1, 10.5); //Inserting a term of degree 1 with coeff 10.5
			
			System.out.println(gPoly.getPolyExpr());  
			System.out.println("Expected: -2.1x^7 - 5.5x^4 + 7.23x^3 - 4.9x^2 + 10.5x + 1.0\n");
			
			System.out.println("Degree of Polynomial: " + gPoly.getPolyDeg() );	
			System.out.println("Expected: 7 \n");
			
			//Method 2(b) get the coefficient of term with a given degree 
			System.out.println("Coefficient of term with degree 5: " + gPoly.getCoeff(5) ); 
			System.out.println("Expected: 0.0 \n");
			
			//Method 2(c) getting all the coefficients
			System.out.println(gPoly.getAllCoeff());
			System.out.println("Expected: [-2.1, 0.0, 0.0, -5.5, 7.23, -4.9, 10.5, 1.0] \n");
			
			//Method 3(b) editing the coefficient of a term with given degree
			gPoly.setCoeff(5, -17);	//setting coefficient of term with degree 5 to -17
			
			//Method 3(c) removing a term
			gPoly.removeDeg(3);	 //removing the term with degree 3
			
			System.out.println(gPoly.getPolyExpr());
			System.out.println("Expected: -2.1x^7 - 17.0x^5 - 5.5x^4 - 4.9x^2 + 10.5x + 1.0\n");
			
			//Method 2(c) getting all the coefficients
			System.out.println(gPoly.getAllCoeff());
			System.out.println("Expected: [-2.1, 0.0, -17.0, 5.5, 0.0, -4.9, 10.5, 1.0] \n");
			
			//Method 2(e) evaluate at a given value
			System.out.println("The value of the polynomial at 1.0 is " + gPoly.eval(1.0));
			System.out.println("Expected:-18.0 \n");
			
/*********** TEST 3: UNDEFINED COEFFICIENTS *********************************/
			System.out.println("********************** TEST 3 *************************");
			Polynomial hPoly = new Polynomial(); //constructing a polynomial
				
			//Method 2(d) getting string representation of polynomial
			System.out.println(hPoly.getPolyExpr());	
			System.out.println("Expected: Coefficients have not been set");	
		}
}
