package dz;
//Нам нужна функция, которая может преобразовывать
// число (целое число) в строку.
//Какие способы достижения этой цели вам
// известны?
//Примеры (вход --> выход):
public class Dz7_2_3 {
    public static void main(String[] args) {
        System.out.println(numberToString(123));
    }
    public static String numberToString(int num) {
        return String.valueOf(num); // Return a string of the number here!
    }
}

