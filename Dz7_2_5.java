package dz;

//Если задано неотрицательное целое число,
// 3 например, верните строку с шепотом:
// "1 sheep...2 sheep...3 sheep...". Входные
// данные всегда будут допустимыми, то есть
// не будут содержать отрицательных целых чисел.
public class Dz7_2_5 {

    public static String countingSheep(int num) {
        String result = "";
        for (int i = 1; i <= num; i++) {
            result = result + i + "sheep";
        }
        return result;
    }

}
