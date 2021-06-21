package com.lee.springbootjava8stream.utils;

import com.lee.springbootjava8stream.domain.Java8StreamPOJO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Java8StreamUtils {

    private static List<Java8StreamPOJO> java8POJOlist = new ArrayList<>();

    public static List<Java8StreamPOJO> java8StreamDomain () {
        Java8StreamPOJO pojo1 = Java8StreamPOJO.builder()
                .age(21)
                .area("New York")
                .name("Tom")
                .salary(8900)
                .sex("male")
                .build();
        Java8StreamPOJO pojo2 = Java8StreamPOJO.builder()
                .age(15)
                .area("Washington")
                .name("Jack")
                .salary(7000)
                .sex("male")
                .build();
        Java8StreamPOJO pojo3 = Java8StreamPOJO.builder()
                .age(12)
                .area("Washington")
                .name("Lily")
                .salary(7800)
                .sex("female")
                .build();
        Java8StreamPOJO pojo4 = Java8StreamPOJO.builder()
                .age(16)
                .area("New York")
                .name("Anni")
                .salary(8200)
                .sex("female")
                .build();
        Java8StreamPOJO pojo5 = Java8StreamPOJO.builder()
                .age(5)
                .area("New York")
                .name("Owen")
                .salary(9500)
                .sex("male")
                .build();
        Java8StreamPOJO pojo6 = Java8StreamPOJO.builder()
                .age(32)
                .area("New York")
                .name("Alisa")
                .salary(7900)
                .sex("female")
                .build();
        java8POJOlist.add(pojo1);
        java8POJOlist.add(pojo2);
        java8POJOlist.add(pojo3);
        java8POJOlist.add(pojo4);
        java8POJOlist.add(pojo5);
        java8POJOlist.add(pojo6);
        return java8POJOlist;
    }
}
