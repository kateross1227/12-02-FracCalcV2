// Write a class called RationalNumber that represents a fraction with an integer numerator and denominator
// Write a class called RationalNumber that represents a fraction with an integer numerator and denominator

import java.util.*;

public class RationalNumber {
  int num;
  int denom;
  
  public RationalNumber() {
    num = 0;
    denom = 1;
  }
  
  public RationalNumber(int numerator, int denominator) {
    denom = denominator;
    num = numerator;
    if (denominator == 0) {
      denominator = 1;
    }    
    if (denominator < 0) {
      denominator *= -1;
      numerator *= -1;
    }
  }
  
  public int getDenominator() {
    return denom;
  }
  
  public int getNumerator() {
    return num;
  }
  
  public int GCD(int first, int second) {
    int temp;
    while (second != 0) {
      temp = second;
      second = first % second;
      first = temp;
    }        
    return first;
  }
  
  public String toString() {
    String s;
    if (denom == 1) {
      s = " " + num;
    }
    else {
      s = (num / GCD(num, denom)) + "/" + (denom / GCD(num, denom));
    }
    return s;
  }
  
  public void add(RationalNumber frac) {
    int denom2 = frac.getDenominator();
    int num2 = frac.getNumerator();
    num = (num * denom2) + (num2 * denom);
    denom *= denom2;
  }
  
  public void subtract(RationalNumber frac) {
    int denom2 = frac.getDenominator();
    int num2 = frac.getNumerator();
    num = (num * denom2) - (num2 * denom);
    denom *= denom2;
  }
  
  public void multiply(RationalNumber frac) {
    int denom2 = frac.getDenominator();
    int num2 = frac.getNumerator();
    num *= num2;
    denom *= denom2;
  }
  
  public void divide(RationalNumber frac) {
    int denom2 = frac.getDenominator();
    int num2 = frac.getNumerator();
    num *= denom2;
    denom *= num2;
  }
}
