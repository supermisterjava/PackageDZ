package dz;

//Задача №2
//Необходимо вывести все положительные степени числа 5
// которые меньше 10000, вывести результат возведения в степень.
public class DzTasc3_22 {
    public static void main(String[] args) {
        int number = 5;
        int power = 1;
        int result = number;

        System.out.println("Положительные степени числа 5, меньше 10000:");

        while (result < 10000) {
            System.out.println("5^" + power + " = " + result);
            power++;
            result = (int) Math.pow(number, power);
        }

    }
}

