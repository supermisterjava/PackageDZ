package dz;
//Задача №4
//
//Дана строка:
//String s = “Перестановочный алгоритм быстрого действия”;
//необходимо вывести все буквы “о” из этой строки.
//Для указанной строки ответ будет “ооооо” (или в столбик)
public class DzTascs4_4 {
    public static void main(String[] args) {

        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i <s.length() ; i++) {
           if (s.charAt(i) == 'о'){
//               System.out.println(s.charAt(i));
//               System.out.println(s.charAt(i) + " ");
               System.out.print(s.charAt(i));
        }


        }
    }
}
