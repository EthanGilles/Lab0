
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
// Mandy Ho
    public Fraction divide(Fraction input) {
        int newNumerator = this.numerator * input.denominator;
        int newDenominator = this.denominator * input.numerator;
        Fraction result = new Fraction(newNumerator, newDenominator);
        return result;
    }


//Nathaniel Serrano
@Override
public Fraction multiply(Fraction input) {
	int newNumerator = this.numerator * input.numerator;
	int newDenominator = this.denominator * input.denominator;
	Fraction result = new Fraction(newNumerator, newDenominator);
	return result;
}
// Mandy Ho	
    public void insertionSort(Fraction[] input) {
        for (int i = 1; i < input.length; i++) {
            Fraction current = input[i];
            int j = i - 1;
            while (j >= 0 && input[j].hasSameValue(current)) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = current;
        }
    }
  	}
