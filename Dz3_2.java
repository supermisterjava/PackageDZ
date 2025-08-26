package dz;

//Задача №2
//Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и
// вывести следующие строки:
//maybe a and b are even - если сумма переменных четная
//some variable is odd - если сумма переменных нечет
public class Dz3_2 {
    public static boolean isEven(int a, int b) {
        int sum = a + b;
        boolean result = (sum % 2 == 0);
        if (sum % 2 == 0) {
            System.out.println("maybe a and b are even - если сумма переменных четная");
        } else {
            System.out.println("some variable is odd - если сумма переменных нечет");

        }
        return result;
    }

    public static void main(String[] args) {
        isEven(100, 100);
    }
}



