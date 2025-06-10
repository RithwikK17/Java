package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
	public static void main(String[] args) {
		// Stream:
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> stream = list.stream();

		Stream<Integer> stream2 = Stream.of(21, 22, 23, 24);

		// Intermediate operations: filter(), map(), flatMap(), sorted(), distinct(),
		// peek(), limit(), skip()

		Stream<Integer> data = stream.filter(x -> x % 2 == 0).map(x -> x * x);

//		List<List<Integer>> asList = Arrays.asList(Arrays.asList(11, 12, 13));
//		Stream<List<Integer>> stream3 = asList.stream();
//		List<Object> collect = stream3.flatMap(null).collect(Collectors.toList());

		// Terminal Orerations: forEach, collect, anyMatch, allMatch, reduce, count,
		// min, max

		data.forEach(x -> System.out.println(x));

		Stream<Integer> of = Stream.of(21, 22, 23, 24);
		
		List<Integer> collect = of.filter(x -> x % 2 == 1).collect(Collectors.toList());
		System.out.println(collect);

	}
}
