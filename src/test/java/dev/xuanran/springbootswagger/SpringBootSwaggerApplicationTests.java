package dev.xuanran.springbootswagger;

import dev.xuanran.springbootswagger.mapper.StudentMapper;
import dev.xuanran.springbootswagger.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootSwaggerApplicationTests {
    @Autowired
    private StudentMapper studentMapper;
    @Test
    public void testData(){
        Student student = studentMapper.getStudentById(1);
        System.out.println(student);
    }
}
