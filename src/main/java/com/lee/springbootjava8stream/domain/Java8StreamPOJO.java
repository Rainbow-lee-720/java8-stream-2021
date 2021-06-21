package com.lee.springbootjava8stream.domain;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Java8StreamPOJO implements Serializable {

    private String name;
    private Integer salary;
    private Integer age;
    private String sex;
    private String area;

}
