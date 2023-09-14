package cuz.yang.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.gson.Gson;
import cuz.yang.mapper.CourseMapper;
import cuz.yang.mapper.ScoreMapper;
import cuz.yang.mapper.StudentMapper;
import cuz.yang.model.Scores;
import cuz.yang.model.Student;
import cuz.yang.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
public class GpaController {
    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private CourseMapper  courseMapper;

    @Autowired
    private ScoreMapper scoresMapper;

    private Gson gson = new Gson();

    /*@GetMapping("/gpa")
    public String getGpaList(){
        List<Student> studentList = studentMapper.selectList(null);
        for (Student s: studentList) {
            String sid = s.getId();

            QueryWrapper<Scores> scoreQueryWrapper = new QueryWrapper<>();
            scoreQueryWrapper.eq("sid",sid);
            List<Scores> scoreList = scoresMapper.selectList(scoreQueryWrapper);

            double sumCredit = 0;
            double sumPoint = 0;

            for (Scores sc : scoreList) {
                //获得课程号
                String cid = sc.getCid();
                Course c = courseMapper.selectById(cid);
                double credit = c.getCredit();

                double score = sc.getScore();
                double point = score/10-5.0;
                if(score < 60){
                    point = 0;
                }
                sumPoint += point * credit;
                sumCredit += credit;

            }
            double gpa = sumPoint/sumCredit;

            studentMapper.updateById(s);


        }
        return gson.toJson(studentList);
    }*/
}
