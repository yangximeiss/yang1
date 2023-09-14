package cuz.yang.controller;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.google.gson.Gson;
import cuz.yang.mapper.ScoreMapper;
import cuz.yang.model.Scores;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")

@RestController
public class ScoreController {
    @Autowired
    private ScoreMapper scoresMapper;
    private Gson gson = new Gson();

    public ScoreController() {
    }

    @GetMapping({"/scores"})
    public String getScoreList() {
        List<Scores> scoresList = this.scoresMapper.selectList((Wrapper)null);
        return this.gson.toJson(scoresList);
    }
}
