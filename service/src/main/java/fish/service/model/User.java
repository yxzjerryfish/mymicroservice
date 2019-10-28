package fish.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 用户
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/10/28 21:00
 */
@Data
@AllArgsConstructor
public class User {
    String name;
    Integer age;
}
