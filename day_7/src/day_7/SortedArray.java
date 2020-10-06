package day_7;

import java.util.Arrays;
import java.util.List;

public class SortedArray {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

		System.out.println("The sorted stream is : ");

		list.stream().sorted().forEach(System.out::println);
	}

}
