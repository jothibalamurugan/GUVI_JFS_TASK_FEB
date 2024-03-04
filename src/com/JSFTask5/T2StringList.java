package com.JSFTask5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class T2StringList {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");


        List<String> nonEmptyStrings = stringList.stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList());

        System.out.println("List of non-empty stringList:");
        System.out.println(nonEmptyStrings);
    }
}
