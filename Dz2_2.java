package dz;

//Задача №2
//
//Необходимо создать целочисленные переменные a и b, присвоить им произвольные значения, а потом поменять значения
// местами (значение переменной a должно оказаться в переменной b и наоборот).
public class Dz2_2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int temp = a;
        a = b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("vice versa");
        int temp1 = b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = temp1;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
