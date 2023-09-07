
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


//Coby Andersen
@Override
public Fraction minus(Fraction input) {
	int commonDenominator = this.denominator * input.denominator;
        int newNumerator = (this.numerator * input.denominator) - (input.numerator * this.denominator);
        return new Fraction(newNumerator, commonDenominator);
    }



@Override
public Fraction divide(Fraction input) {
	// TODO Auto-generated method stub
	return null;
}


//Nathaniel Serrano
@Override
public Fraction multiply(Fraction input) {
	int newNumerator = this.numerator * input.numerator;
	int newDenominator = this.denominator * input.denominator;
	Fraction result = new Fraction(newNumerator, newDenominator);
	return result;
}
  
  	}
