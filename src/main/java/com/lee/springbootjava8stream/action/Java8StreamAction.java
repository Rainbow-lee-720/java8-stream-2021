package com.lee.springbootjava8stream.action;

import com.lee.springbootjava8stream.domain.Java8StreamPOJO;
import com.lee.springbootjava8stream.utils.Java8StreamUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamAction {

    @Autowired
    private Java8StreamUtils java8StreamUtils;

    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 3, 2, 9, 43, 23);
//        Stream<Integer> newListStream = list.stream().filter(x -> x > 15).collect(Collectors.toList()).stream();
//        newListStream.forEach(System.out::println);
//        list.stream().filter(x -> x < 8).forEach(System.out::println);
//        Optional<Integer> one = list.stream().filter(x -> x > 5).findFirst();
//        System.out.println(one.get());
//        Optional<Integer> any = list.parallelStream().filter(x -> x > 5).findAny();
//        System.out.println(any.get());
//        Boolean b = list.stream().anyMatch(x -> x > 88);
//        System.out.println(b);
        List<Java8StreamPOJO> list2 = Java8StreamUtils.java8StreamDomain();
//        List<Java8StreamPOJO> list3 = list2.stream().filter(x -> x.getSalary() > 8000).collect(Collectors.toList());
//        list3.forEach(y -> {
//            System.out.println(y.getName());
//        });
//        String[] str = new String[5];
//        str[0] = "adnm";
//        str[1] = "admmt";
//        str[2] = "pot";
//        str[3] = "xbangd";
//        str[4] = "weoujgsd";
//        List<String> list = Arrays.asList(str);
//        Optional<String> op = list.stream().max(Comparator.comparing(String::length));
//        System.out.println(op.get());

//        List<Integer> list = Arrays.asList(1,2,4,44,22,13,433);
//        Integer l = list.stream().max(Integer::compareTo).get();
//        System.out.println(l);
//        Integer l = list.stream().max(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        }).get();
//        System.out.println(l);

//        Integer l = list2.stream().max(Comparator.comparingInt(Java8StreamPOJO::getSalary)).get().getSalary();
//        System.out.println(l);
//        Long s = list.stream().filter(x -> x > 7).count();
//        System.out.println(s);
//        List<String> listR = list.stream().map(String::toUpperCase).collect(Collectors.toList());
//        System.out.println(listR);


//       List<Integer> listRS = list.stream().map(x -> x + 4).collect(Collectors.toList());
//       System.out.println(listRS);

//        List<Integer> listG = list2.stream().map(x -> x.getSalary() + 1000).collect(Collectors.toList());
//        System.err.println(listG);

//        List<Java8StreamPOJO> newList = list2.stream().map(x -> {
//            Java8StreamPOJO java8StreamPOJO = Java8StreamPOJO.builder()
//                    .name(x.getName())
//                    .sex(null)
//                    .salary(x.getSalary() + 2000)
//                    .area(null)
//                    .age(null)
//                    .build();
//            return java8StreamPOJO;
//        }).collect(Collectors.toList());
//        newList.forEach(y -> {
//            System.out.println("name=" + y.getName() + "," + "salary=" + y.getSalary());
//        });

//        List<String> list = Arrays.asList("m,l,f,g", "1,2,5,3");
//        List<String> listR = list.stream().flatMap(x -> {
//            String[] xList = x.split(",");
//            Stream<String> list1 = Arrays.asList(xList).stream();
//            return list1;
//        }).collect(Collectors.toList());
//        listR.forEach(k -> {
//            System.out.print(k);
//        });

//        List<Integer> list = Arrays.asList(1,3,5,23,8,12,54);
//        Optional<Integer> list2 = list.stream().reduce((x, y) -> x + y);
//
//
//        Optional<Integer> list3 = list.stream().reduce(Integer::sum);
//
//        Optional<Integer> list4 = list.stream().reduce((x, y) -> x * y);
//        System.out.println(list4.get());


//        Optional<Integer> list3 = list2.stream().map(Java8StreamPOJO::getSalary).reduce(Integer::sum);
//        System.out.println(list3.get());

//        Map<?, Object> map = list2.stream().filter(x -> x.getSalary() > 8000).collect(Collectors.
//                toMap(Java8StreamPOJO::getName, x -> x.getSalary()));
//        System.out.println(map);
//
//        Long s = list2.stream().collect(Collectors.counting());
//        System.out.println(s);

//        Double d = list2.stream().collect(Collectors.averagingDouble(Java8StreamPOJO::getSalary));
//        System.out.println(d);

//        Optional<Integer> max = list2.stream().map(Java8StreamPOJO::getSalary).collect(Collectors.maxBy(Integer::compare));
//        System.out.println(max.get());

//        Integer l = list2.stream().collect(Collectors.summingInt(Java8StreamPOJO::getSalary));
//        System.out.println(l);

//        IntSummaryStatistics lo = list2.stream().collect(Collectors.summarizingInt(Java8StreamPOJO::getSalary));
//        System.out.println(lo);

//        Map<Boolean, List<Java8StreamPOJO>> map = list2.stream().collect(Collectors.partitioningBy(x -> x.getSalary() > 8000));
//        System.out.println(map);

//        Map<String, List<Java8StreamPOJO>> map = list2.stream().collect(Collectors.groupingBy(Java8StreamPOJO::getSex));
//        System.out.println(map);

//        Map<String, Map<String, List<Java8StreamPOJO>>> map = list2.stream().collect(Collectors.
//                groupingBy(Java8StreamPOJO::getSex, Collectors.groupingBy(Java8StreamPOJO::getArea)));
//        System.err.println(map);

//        List<String> list = list2.stream().sorted(Comparator.comparing(Java8StreamPOJO::getSalary)).map(Java8StreamPOJO::getName)
//                .collect(Collectors.toList());
//        System.out.println(list);

//        List<String> list = list2.stream().sorted(Comparator.comparing(Java8StreamPOJO::getSalary)
//                .thenComparing(Java8StreamPOJO::getAge))
//                .map(Java8StreamPOJO::getName)
//                .collect(Collectors.toList());
//        System.out.println(list);

        List<String> list = list2.stream().sorted((o1, o2) -> {
            if (o1.getSalary() == o2.getSalary()) {
                return o2.getAge() - o1.getAge();
            } else {
                return o2.getSalary() - o1.getSalary();
            }
        }).map(Java8StreamPOJO::getName).collect(Collectors.toList());
        System.out.println(list);

    }



}
