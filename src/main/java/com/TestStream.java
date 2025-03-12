package com;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        List<String> test = Arrays.asList("bfsj", "asdfdv", "sdvsvfsdvdvsdvsdv", "usdv", "sksk", "dcw", "eee");
//       long res = test.stream()
//                .count();
//        System.out.println(res);
//         test.stream()
//                 .sorted()
//                 .forEach(System.out::println);
        List<Integer> result = test.stream()
                .map(String::length)
                .distinct()
                .toList();
        System.out.println(result);
//
//        result.stream()
//                .sorted()
//
//                .forEach(System.out::println);
//
       String re = test.stream()
                .collect(Collectors.joining());
        System.out.println(re);
     Optional<Integer> ress = result.stream()
                .reduce((a,b) -> a+b );

        System.out.println(ress);
  Optional<Integer> r =  result.stream()
                .sorted()
                .filter(n -> n > 3)
                .findFirst();
        System.out.println(r.get());
        boolean str = result.stream()
                .allMatch(n -> n > 10);
        System.out.println(str);
//        result.stream()
//                .takeWhile(n -> n < 10)
//                .forEach(System.out::println);

    }
}
