package cuz.yang.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Scores {
    String sid;
    String name;
    int java;
    int english;
    int mathematics;
    int game;
    int algebra;
    int military;
    int modeling;

    public Scores() {
    }
}
