package cuz.yang.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Course {
    private String cname;
    private String cid;
    private double credit;

}
