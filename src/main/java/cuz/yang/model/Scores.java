package cuz.yang.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Scores {
    private String sid;
    private String cid;
    private double score;
}
