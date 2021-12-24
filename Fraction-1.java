public class Fraction {
private int  numerator;
private int denominator;

public Fraction(int numerator)
{
	this.numerator= numerator;
	this.denominator=1;
	 
	
}
public Fraction(int numerator, int denominator)
{

	int divisor = gcd(numerator, denominator);
	this.numerator = numerator / divisor;
	this.denominator = denominator / divisor;

}
public Fraction add(Fraction right)
{
	
	int commonDenominator=this.denominator*right.denominator;
	int num1=(this.numerator*right.denominator);
	int num2=(right.numerator*this.denominator);
	int sum=num1+num2;
	return new Fraction(sum,commonDenominator);
	
}
public Fraction sub(Fraction right)
{
	int commonDenominator=this.denominator*right.denominator;
	int num1=(this.numerator*right.denominator);
	int num2=(right.numerator*this.denominator);
	int dif=num1-num2;
	return  new Fraction(dif,commonDenominator);
	
}
public Fraction mult(Fraction right)
{
	return  new Fraction(this.numerator*right.numerator, this.denominator*right.denominator);
	
}
public Fraction div(Fraction right)
{
	int num=(this.numerator*right.denominator);
	int den=right.denominator*this.denominator;
	//System.out.println(den);
	//System.out.println(num);
	return  new Fraction(num,den);
	
}
public String toString()
{
	return this.numerator+"/"+this.denominator;
	
}
public boolean equals(Object other)
{
	return false;
	
}

//Euclid's Algorithm for finding the greatest common divisor
private int gcd(int u, int v)
{
	u = (u < 0) ? -u : u;		// make u non-negative
	v = (v < 0) ? -v : v;		// make v non-negative

	while (u > 0)
	{
		if (u < v)
		{
			int t = u;	// swap u and v
			u = v;
			v = t;
		}

		u -= v;
	}

	return v; // the GCD of u and v
	
}


}