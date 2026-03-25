import java.util.Arrays;

public class ArrayCompressor {
    //  если входной массив null или пуст, возвращается пустой массив

    public static int[] compressNumbers(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new int[0];
        }
        // Подсчёт размера результирующего массива
        int resultSize = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1]) {
                resultSize++;
            }
        }
        int[] result = new int[resultSize];
        result[0] = numbers[0];

        int index = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1]) {
                result[index++] = numbers[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 2, 3, 1, 2, 3, 0, 0, 1, 1, 0, 0, 1, 0};
        System.out.println(Arrays.toString(compressNumbers(numbers)));
    }
}

