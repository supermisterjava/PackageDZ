package dz;

//Дана последовательность целых чисел. Ваше
// решение должно найти наименьшее целое число.
//Учитывая [34, 15, 88, 2]ваше решение, вы
// получите ответ.2
//Учитывая [34, -345, -1, 100]ваше решение,
// вы получите ответ.-345
public class Dz7_2_4 {

        public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < args.length; i++) {
            min = Math.min(min, args[i]);
        }
        return min;
    }
}
