package day_7;

import java.util.*;

public class FindFirst {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Jeyapriya", "Asha", "Kalai", "sri","Bhavi");

		Optional<String> answer = list.stream().findFirst();

		if (answer.isPresent()) {
			System.out.println(answer.get());
		} else {
			System.out.println("no value");
		}
	}

}
