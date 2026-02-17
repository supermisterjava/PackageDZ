package dz;

//Задача №5
//
//Дана строка:
//String s = “Перевыборы выбранного президента”;
//необходимо подсчитать количество букв “е” в строке.
//Для указанной строки ответ будет 4.
public class Dz5_5 {
    public static void main(String[] args) {
//        String s = "Перевыборы выбранного президента";
//        int count = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'е') {
//                System.out.println(s.charAt(i));
//                count++;
//            }
//        }
//        System.out.println("\nНайденно ; " + count + " Букв е");
    //____________
//        String s = "Перевыборы выбранного президента";
//
//        for (int i = 0; i < s.length() ; i++) {
//            if(s.charAt(i) == 'е') {
//                System.out.println(s.charAt(i));
//            }
//        }
        //__________
        String s = "Перевыборы выбранного президента";
        String result = " ";

        for (int i = 0; i < s.length() ; i++) {
            if(s.charAt(i) == 'е') {
                result += s.charAt(i);
            }
        }
        System.out.println(result);
    }
}
