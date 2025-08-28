package dz;
//Задача №5
//
//Дана строка:
//String s = “Перевыборы выбранного президента”;
//необходимо подсчитать количество букв “е” в строке.
//Для указанной строки ответ будет 4.
public class DzTasc4_5 {
    public static void main(String[] args) {

        String s =" Перевыборы выбранного президента";

        for (int i = 0; i < s.length() ; i++) {
            int count  = 0;
            if (i == 'e') {

              count =count + count;
                System.out.println(count);
            }

        }
    }
}
