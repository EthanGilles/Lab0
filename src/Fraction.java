
public class Fraction implements INumber<Fraction>  {
  int numerator;
  int denominator;
  
  public Fraction(int n, int d) {
	  numerator = n;
	  denominator = d;
  }
  
 
// ETHAN
 public void print() {
	 System.out.println(this.numerator + "/" + this.denominator);
}


@Override
public Fraction plus(Fraction input) {
	// TODO Auto-generated method stub
	return null;
}



@Override
public Fraction minus(Fraction input) {
	// TODO Auto-generated method stub
	return null;
}



@Override
public Fraction divide(Fraction input) {
	// TODO Auto-generated method stub
	return null;
}



@Override
public Fraction multiply(Fraction input) {
	// TODO Auto-generated method stub
	return null;
}
  
  	}
