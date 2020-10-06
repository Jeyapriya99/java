package day_7;

import java.util.*;

public class Peek {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(0, 2, 4, 6, 8, 10);

		list.stream().peek(System.out::println).count();
	}
}
