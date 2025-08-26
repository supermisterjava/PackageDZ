package dz;

//Задача №1
//Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш выбор и вывести
// результаты следующих операций с этими переменными: сложение, умножение, вычитание, деление и
// остаток от деления. Также сделать проверку на четность этих переменных и вывести результат.
public class Dz2_1 {
    public static void main(String[] args) {
        int a = 110;
        int b = 21;
        System.out.println(a);
        System.out.println(b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("double a / b = " + (a * 1.0 / b));
        if( a % 2 == 0) {
                System.out.println("Is a Even? true");
        }else System.out.println("Is a Even? false");
        if( b % 2 == 0) {
            System.out.println("Is b Even? true");
        }else System.out.println("Is b Even? false");
    }
}