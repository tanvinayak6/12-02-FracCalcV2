// Write a class called RationalNumber that represents a fraction with an integer numerator and denominator
public class RationalNumber
{
  int num;
  int denom;
  public RationalNumber()
  {
    num=0;
    denom=1;
  }
  public RationalNumber(int numerator, int denominator)
  {
    int gcd=GreatestCommonDivisor(numerator, denominator);
    num=numerator/gcd;
    denom=denominator/gcd;
    if(num==0)
    {
      denom=1;
    }
    if(denom<0)
    {
      num=-num;
      denom=-denom;
    }
  }
  public int GreatestCommonDivisor(int first, int second) {
    int temp;
    while (second != 0) 
    {
        temp = second;
        second = first % second;
        first = temp;
    }        
    return first;
  }  
  public int LeastCommonMultiple(int first, int second)
  {
    int lcm=(first*second)/(GreatestCommonDivisor(first, second));
    return lcm;
  }
  public int getDenominator()
  {
    return denom;
  }
  public int getNumerator()
  {
    return num;
  }
  public String toString()
  {
    String s=num+"/"+denom;
    if(denom==1)
    {
      s=Integer.toString(num);
    }
    return s;
  }
  public void add(RationalNumber frac)
  {
    int num1= frac.getNumerator();
    int den1= frac.getDenominator();
    int num2= den1 * num;
    int num3= denom * num1;
    int newnum= num2 + num3;
    int newden= den1*denom;
    int gcd=GreatestCommonDivisor(newnum, newden);
    num=newnum/gcd;
    denom=newden/gcd;
    if(num==0)
    {
      denom=1;
    }
    if(denom<0)
    {
      num=-num;
      denom=-denom;
    }
  }
  public void subtract(RationalNumber frac)
  {
    int num1= frac.getNumerator();
    int den1= frac.getDenominator();
    int num2= den1 * num;
    int num3= denom * num1;
    int newnum= num2- num3;
    int newden= den1*denom;
    int gcd=GreatestCommonDivisor(newnum, newden);
    num=newnum/gcd;
    denom=newden/gcd;
    if(num==0)
    {
      denom=1;
    }
    if(denom<0)
    {
      num=-num;
      denom=-denom;
    }
  }
  public void multiply(RationalNumber frac)
  {
    int num1=frac.getNumerator();
    int den1= frac.getDenominator();
    int newnum= num1*num;
    int newden=denom*den1;
    int gcd=GreatestCommonDivisor(newnum, newden);
    num=newnum/gcd;
    denom=newden/gcd;
    if(num==0)
    {
      denom=1;
    }
    if(denom<0)
    {
      num=-num;
      denom=-denom;
    }
  }
  public void divide(RationalNumber frac)
  {
    int num1=frac.getNumerator();
    int den1= frac.getDenominator();
    int newnum=num/num1;
    int newden=denom/den1;
    int gcd=GreatestCommonDivisor(newnum, newden);
    num=newnum/gcd;
    denom=newden/gcd;
    if(num==0)
    {
      denom=1;
    }
    if(denom<0)
    {
      num=-num;
      denom=-denom;
    }
  }
  
}
    
  
    
