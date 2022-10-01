package com.Assignment;

public class RefactorGenericMethod<T extends Comparable<T>> {

	public static <T extends Comparable> T getMax(T first, T second, T third) {
		if (first.compareTo(second) > 0 && first.compareTo(third) > 0) {
			return first;
		} else if (second.compareTo(first) > 0 && second.compareTo(third) > 0) {
			return second;
		} else {
			return third;
		}
	}

	public static void main(String[] args) {
		Integer firstInt = 1, secondInt = 2, thirdInt = 3;
		Float firstFloat = 1.2f, secondFloat = 8.2f, thirdFloat = 60.2f;
		String firstString = "Tejal", secondString = "Aakanksha", thirdString = "Mrunali";

		System.out.println(getMax(firstInt, secondInt, thirdInt));
		System.out.println(getMax(firstFloat, secondFloat, thirdFloat));
		System.out.println(getMax(firstString, secondString, thirdString));
	}
}
