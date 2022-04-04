package dev.xuanran.springbootswagger.controller;

import dev.xuanran.springbootswagger.mapper.StudentMapper;
import dev.xuanran.springbootswagger.pojo.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Api("学生信息接口")
@RestController("/stu")
public class HelloController {

    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("findById/{id}")
    @ApiOperation("通过ID获取学生信息")
    public String findStuById(@ApiParam("学生信息") @PathVariable("id") Integer id) {
        return studentMapper.getStudentById(id).toString();
    }

    @GetMapping("addStu")
    @ApiOperation("添加学生")
    public String addNewStu(@ApiParam("学生信息") Student stu) {
        int i = studentMapper.addStudent(stu);
        return "OK" + i;
    }

}
