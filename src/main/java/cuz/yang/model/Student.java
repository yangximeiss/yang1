package cuz.yang.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String sid;
    private String name;
    private String gender;
    private double age;
}
