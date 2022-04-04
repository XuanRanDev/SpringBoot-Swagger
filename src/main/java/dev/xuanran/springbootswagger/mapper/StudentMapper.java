package dev.xuanran.springbootswagger.mapper;

import dev.xuanran.springbootswagger.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {
    /**
     * 获取所有的学生
     * @return
     */
    List<StudentMapper> getAllStudent();

    /**
     * 通过ID查找学生
     * @param id
     * @return
     */
    Student getStudentById(int id);

    /**
     * 添加学生到数据库中
     * @param student 数据对象
     */
    int addStudent(Student student);

}
