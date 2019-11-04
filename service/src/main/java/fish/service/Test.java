package fish.service;

import fish.service.model.Dog;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * 给包一个main方法
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/10/24 21:37
 */
public class Test {
    public static void main(String[] args) {
        Function<String,Dog> function = Dog::new;
        BiConsumer<Dog,String> biConsumer = Dog::eat;
        Dog dog = function.apply("旺财");
        biConsumer.accept(dog,"猪肉");

        Function<Integer,Function<Integer,Function<Integer,Integer>>> fun = x->y->z->x+y+z;

        System.out.println(fun.apply(3).apply(4).apply(5));

        int []a ={3,2,1,4,5};
        Arrays.stream(a).filter(n->n%2==0).forEach(System.out::println);

        IntStream.range(2,5).forEach(System.out::println);

        IntStream.of(a).filter(n->n%2 != 0).map(n -> n*2).sorted().forEach(System.out::println);
    }
}
