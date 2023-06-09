package com.java8.Loops;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Hexadecimals {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("hello", "java", "python");
		Stream<String> stream = Stream.of("hello", "java", "python");
		Consumer<String> printTextInHexConsumer = (String s) -> {
			StringBuilder sb = new StringBuilder();
			for (char c : s.toCharArray()) {
				String hex = Integer.toHexString(c);
				sb.append(hex);
			}
			System.out.print(String.format("%n%-10s:%s", s, sb.toString()));

		};
		// pass a Consumer
		list.forEach(printTextInHexConsumer);

		stream.forEach(printTextInHexConsumer);

	}

}
