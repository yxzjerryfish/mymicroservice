package fish.service.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/10/28 21:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "用户模型")
public class User {

    @ApiModelProperty("姓名")
    String name;

    @ApiModelProperty("年龄")
    Integer age;

    @ApiModelProperty("描述")
    String desc;
}
