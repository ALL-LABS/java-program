import java.util.Scanner;

class Rational{
	 int numerator;
	 int denominator;

	Rational(int n, int d) {
		numerator = n;
		denominator = d;
		if (denominator == 0) {
			throw new RuntimeException("Denominator is zero");
		}
	}

	void findExperiment10() {
		int g = gcd(numerator, denominator);
		if (g == 1) {
			System.out.println("No Common Divisor for Numerator and Denominator");
		} else {
			numerator = numerator / g;
			denominator = denominator / g;
		}
	}

	int gcd(int m, int n) {
		int d;
		while (m % n != 0) {
			d = m % n;
			m = n;
			n = d;
		}
		return n;
	}




	public String toString() {
		return numerator + "/" + denominator;
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Numerator : ");
		int numerator = scanner.nextInt();
		System.out.print("Enter Denominator : ");
		int denominator = scanner.nextInt();
		Rational r = new Rational(numerator, denominator);
		r.findExperiment10();
		System.out.println("The Rational number :" + r.toString());
	}
}
