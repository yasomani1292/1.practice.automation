package javaPractice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperatorsMathDemo {

	public static void main(String[] args) {
		  
		int i =10;
		int i2 = -10;
		int i3 = ++i;
		int i4 = i++;
		int i5 = --i;
		int i6 = i--;
		System.out.println("i= "+i);
		System.out.println("i2="+i2);
		System.out.println("i3=++i ->"+i3);
		System.out.println("i4=i++ ->"+i4);
		System.out.println("i5=--i ->"+i5);
		System.out.println("i6=i-- ->"+i6);
		
//		Binary operator
		
		System.out.println(5%4);
		System.out.println(4%5);
		
		
//		USing big decimal
		
		BigDecimal rideFee = BigDecimal.valueOf(20).setScale(4);
		BigDecimal peopleCount = BigDecimal.valueOf(3);
		BigDecimal feePerPeople = rideFee.divide(peopleCount, RoundingMode.HALF_UP);
		System.out.println(feePerPeople);
		
		BigDecimal b1 = BigDecimal.valueOf(20.1).setScale(4);
		BigDecimal b2 = BigDecimal.valueOf(3.2).setScale(4);
		System.out.println(b1.subtract(b2));
		
		System.out.println(Math.PI);
		System.out.println(Math.max(2, 3));
		
		
		System.out.println(Math.PI);		// 3.141592653589793
		System.out.println(Math.max(3, 5)); // 5
		System.out.println(Math.min(3, 5));	// 3
		System.out.println(Math.sqrt(4));	// 2.0
		int absoluteValue = Math.abs(-5);
		System.out.println(absoluteValue);	// 5
		
		System.out.println(Math.sqrt(-1));	// NaN(Not a Number)
		System.out.println(0 / 0.0);		// NaN
		System.out.println((0 / 0.0) + 5);	// NaN
		
		System.out.println(5 / 0.0);		// Infinity
		System.out.println(-5 / 0.0);		// -Infinity
		
		System.out.println(Math.round(20.0 / 3.0));						// 7
		System.out.println(Math.round( 20.0 * 100.0 / 3.0) / 100.0);	// 6.67
		
	}
}
