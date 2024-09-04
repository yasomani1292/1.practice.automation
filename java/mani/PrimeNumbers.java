package mani;

import java.util.stream.IntStream;

public class PrimeNumbers {

	public static boolean isPrime1(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i < num; i++)
			if (num % i == 0)
				return false;
		return true;
	}

	public static boolean isPrime2(int num) {
		return num > 1 && IntStream.range(2, num).noneMatch(i -> (num % i) == 0);
	}

	public static int getNextPrime1(int num) {
		while (true)
			if (isPrime1(++num))
				return num;
	}

	public static int getNextPrime2(int num) {
		if (isPrime1(num + 1))
			return num + 1;
		else
			return getNextPrime2(num + 1);
	}

	public static void main(String[] args) {

		int num = 7;
		System.out.println(isPrime1(num));
		System.out.println(isPrime2(num));

		System.out.println(getNextPrime1(num));
		System.out.println(getNextPrime2(num));

	}

}
