import java.util.*;

public class Fraction implements INumber<Fraction>  {
  int numerator;
  int denominator;
  
  
  
  public Fraction(int n, int d) {
	  numerator = n;
	  denominator = d;
  }
  
 
//Ethan Gilles
 public void print() {
	 System.out.println(this.numerator + "/" + this.denominator);
}


//Ethan Gilles
public Fraction plus(Fraction input) {
	int commonDenominator = lcm(this.denominator, input.denominator);
	
	//finds the sum of the numerator using the common denominator
    int sumNumerator = (this.numerator * (commonDenominator / this.denominator)) + (input.numerator * (commonDenominator / input.denominator));
    
    //simplifies using GCD
    int gcd = gcd(sumNumerator, commonDenominator);
    int sNumerator = sumNumerator / gcd;
    int sDenominator = commonDenominator / gcd;

    return new Fraction(sNumerator, sDenominator);
	
}


//Coby Andersen
	/**
     * Subtracts another fraction from this fraction and returns the result as a new fraction.
     * @param input The fraction to subtract from this fraction.
     * @return A new fraction representing the result of the subtraction.
     */
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


/**
 * Nathaniel Serrano
 * Implements multiply() method:
 * Multiplies Fractions by multiplying numerators together to
 * create a new numerator and muliplying denominators together 
 * to create a new denominator and creates a new fraction
 * with the new numerator and denominator.
 * @param input - a Fraction object
 * @return result - a Fraction object equal to the product
 * of the input and the instantiated Fraction.
 */
@Override
public Fraction multiply(Fraction input) {
	int newNumerator = this.numerator * input.numerator;
	int newDenominator = this.denominator * input.denominator;
	Fraction result = new Fraction(newNumerator, newDenominator);
	return result;
}

//Ethan Gilles -- calculates greatest common divisor
public static int gcd(int a, int b) {
    if (b == 0) {
        return a;
    } else {
        return gcd(b, a % b);
    }
}
//Ethan Gilles -- Calculates least common multiple
public static int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
}

//Ethan Gilles
	public boolean hasSameValue(Fraction input) {
		// cross multiply
        int cP1 = this.numerator * input.denominator;
        int cP2 = input.numerator * this.denominator;

        // fractions are equal if their cross products are the same
        return cP1 == cP2;
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
// Coby Andersen
	/**
     * Finds the most frequently occurring fraction in an array of fractions.
     *
     * @param input An array of fractions to search for the most frequent fraction.
     * @return The most frequent fraction in the array. If multiple fractions have the same highest frequency,
     *         the first one encountered in the array is returned.
     */
public static Fraction findFrequent(Fraction[] input) {
        Map<Fraction, Integer> frequencyMap = new HashMap<>();
        Fraction mostFrequent = null;
        int maxFrequency = 0;

        for (Fraction fraction : input) {
            int frequency = frequencyMap.getOrDefault(fraction, 0) + 1;
            frequencyMap.put(fraction, frequency);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequent = fraction;
            }
        }

        return mostFrequent;
}
/**
 * Nathaniel Serrano
 * Implements printReverse method:
 * Prints last Fraction in array then creates a 
 * new array that is a copy of the input minus the 
 * last item. This new array is then used as the input
 * for the method's recursive call on itself.
 * @param inputArray - An array of Fractions
 */
public static void printReverse(Fraction[] inputArray) {
	int indexOfLast = inputArray.length-1;
	if (indexOfLast<0)
		return;
	System.out.print(inputArray[indexOfLast] + " ");
	Fraction[] newArray = new Fraction[inputArray.length-1];
	for (int i=0; i<inputArray.length-1;i++) {
		newArray[i] = inputArray[i];
	}	
	printReverse(newArray);
}
}
