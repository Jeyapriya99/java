package day_7;

import java.util.*;

public class AnyMatch {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);

		boolean answer = list.stream().anyMatch(n -> (n * (n + 1)) / 4 == 5);

		System.out.println(answer);
	}

}
