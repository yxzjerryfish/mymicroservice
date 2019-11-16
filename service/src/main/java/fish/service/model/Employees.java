package fish.service.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description = "职员模型")
public class Employees {

    @ApiModelProperty("职员编号")
    private Integer empNo;

    @ApiModelProperty("生日")
    private Date birthDate;

    @ApiModelProperty("FirstName")
    private String firstName;
    
    @ApiModelProperty("LastName")
    private String lastName;

    @ApiModelProperty("性别")
    private String gender;

    @ApiModelProperty("入职日期")
    private String hirDate;
}
