package dz;
//Задача №1
//Дан массив:
//int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//необходимо вывести все нечетные числа из массива.
public class DzTascs4 {
    public static void main(String[] args) {
        int[] array = {9,2,6,4,5,12,7,8,6};

        for (int i = 0; i < array.length ; i++) {
            if(array [i] % 2 != 0){
            }
            System.out.println(array[i]);
        }
    }
}
