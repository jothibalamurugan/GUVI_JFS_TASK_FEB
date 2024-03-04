package com.JSFTask5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.*;


public class T3StudentIntefaceList {
    public static void main(String[] args) {
       List<String> studentNames= Arrays.asList("Jothi","Archana","Adithiya","Adhvik","balamurugan","Krish");
       List<String> studentNamesStartWithA= studentNames.stream().filter(name ->name.startsWith("A")).collect(Collectors.toList());
       studentNamesStartWithA.forEach(System.out::println);
    }
}
