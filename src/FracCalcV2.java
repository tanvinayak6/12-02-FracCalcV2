// Complete the main class FracCalcV2 to create two instances of RationalNumber and use the methods

// in your main method...
//   create two instances of RationalNumber frac1 and frac2 with values 3/6 and 2/8
//   print each RationalNumber using the toString() method
//   - add frac2 to frac1, i.e. frac1.add(frac2);
//     -- print frac1 using toString()
//   - subtract frac2 from frac1
//     -- print frac1
//   - multiply frac1 by frac2
//     -- print frac1
//   - divide frac1 by frac2
//     -- print frac1
// Complete the main class FracCalcV2 to create two instances of RationalNumber and use the methods

// in your main method...
//   create two instances of RationalNumber frac1 and frac2 with values 3/6 and 2/8
//   print each RationalNumber using the toString() method
//   - add frac2 to frac1, i.e. frac1.add(frac2);
//     -- print frac1 using toString()
//   - subtract frac2 from frac1
//     -- print frac1
//   - multiply frac1 by frac2
//     -- print frac1
//   - divide frac1 by frac2
//     -- print frac1
public class FracCalcV2
{
  public static void main(String[] args)
  {
    RationalNumber frac= new RationalNumber(3,6);
    RationalNumber frac2=new RationalNumber(2,8);
    System.out.println("frac1: " +frac.toString());
    System.out.println("frac2: " +frac2.toString());
    frac.add(frac2);
    System.out.println("frac1 + frac2: " +frac.toString());
    frac.subtract(frac2);
    System.out.println("frac1 - frac2: "+frac.toString());
    frac.multiply(frac2);
    System.out.println("frac1 * frac2: "+frac.toString());
    frac.divide(frac2);
    System.out.println("frac1 / frac2: "+frac.toString());
  }
}
   
    
    
