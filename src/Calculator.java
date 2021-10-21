import java.util.function.*;
import java.util.function.Supplier;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> {
        if(y == 0){
            System.out.println("На ноль делить нельзя!");
        }
        return x/y;
    };
// Все математические операции работали кроме деления, при значении у=0.
// Добавляем условие в лямбда-выражение и говорим пользователю что на 0 делить нельзя.
// Так же можно было сделать с помощью тернарного оператора, но я придумал только так,
// что при делении на 0 программа отдавала бы x или y:
// BinaryOperator<Integer> devide = (x, y) -> (y != 0) ? x / y : x;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> (x > 0) ? x : (x * -1);

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}