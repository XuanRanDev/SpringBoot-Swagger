package dev.xuanran.springbootswagger.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@ApiModel("Student学生类")
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @ApiModelProperty("学生ID")
    private Integer id;
    @ApiModelProperty("学生姓名")
    private String name;
    @ApiModelProperty("学生年龄")
    private Integer age;
}
