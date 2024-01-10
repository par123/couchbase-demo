package com.parmar.couchbase.couchbasedemo.controller;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {



    public static void main(String[] args) throws IOException {

//        String multilineString = "Baeldung helps \n \n developers \n explore Java.";
//        List<String> lines = multilineString.lines()
//                .filter(line -> !line.isBlank())
//                .map(String::strip)
//                .toList();
//        String tempDir = "";
//        Path filePath = Files.writeString(Files.createTempFile(Path.of(tempDir), "demo", ".txt"),
//                "Sample text");
//        String fileContent = Files.readString(filePath);
//        System.out.println("hey its working");
//
//        List<Employee> employeeList = Arrays.asList(new Employee("Dolly", "SE", 1.0),
//                                                    new Employee("parmar", "SSE", 1.0),
//                                                    new Employee("Roushan", "Manager", 1.0),
//                                                    new Employee("Rohan", "Manager", 1.0));
//        Map<String, List<Employee>> resultMap = new HashMap<>();
//        for (Employee employee : employeeList) {
//            var list = resultMap.getOrDefault(employee.title(), new ArrayList<Employee>());
//            list.add(employee);
//            resultMap.put(employee.title(), list);
//        }
//        Map<String, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::title));
//        Map<String, Double> collect1 = employeeList.stream().collect(Collectors.groupingBy(Employee::title,
//                                                            Collectors.averagingDouble(Employee::salary)));
//
//        for(var emp : resultMap.values()){
//            System.out.println("------------------------");
//            emp.forEach(e -> {
//                System.out.println("name: "+e.name()+"  ,  title: "+e.title());
//            });
//        }
        AtomicInteger index = new AtomicInteger();
        Supplier<Integer> s = index::getAndIncrement;
        List<Integer> a = Arrays.asList(1, 3, 5, 7);



        int res = fact(10);
        System.out.println(res);
    }

    public static int fact(int n){

        if(n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
    public void print(){
        var result = IntStream.range(1, 40).sum();
        List<Integer> integers = Arrays.asList(1, 3);
        var sum = integers.stream().mapToInt(Integer::intValue).sum();
    }

    public void sumMultipleOfThreeAndFive(){
        var sum = IntStream.range(1, 50)
                    .filter(v -> v % 3 == 0)
                    .filter(v -> v % 5 == 0)
                    .sum();

    }
    public void firstOccurrence(int n){
        int[] a = {1, 2, 3};
        Arrays.stream(a).forEach(System.out::println);
    }
    record Employee(String name, String title, Double salary){}

}
