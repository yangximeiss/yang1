package cuz.yang.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String id;
    private String name;
    private String gender;
    private int age;

}
