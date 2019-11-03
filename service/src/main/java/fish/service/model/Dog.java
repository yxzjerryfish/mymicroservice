package fish.service.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 刚看到函数式接口想到的东西
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/11/3 20:22
 */
@Data
@NoArgsConstructor
public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void eat(String meat){
        System.out.println(name + "eat" + meat);
    }
}
