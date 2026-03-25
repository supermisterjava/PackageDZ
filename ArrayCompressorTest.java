import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayCompressorTest {

        @Test
        @DisplayName("Базовый случай: дубликаты подряд")
        void shouldRemoveConsecutiveDuplicates () {
            int[] input = {1, 1, 2, 2, 3};
            int[] expected = {1, 2, 3};
            Assertions.assertArrayEquals(expected, ArrayCompressor.compressNumbers(input));
        }

        @Test
        @DisplayName("Дубликаты в середине и начале")
        void shouldHandleDuplicatesInMiddleAndStart () {
            int[] input = {0, 0, 1, 1, 0};
            int[] expected = {0, 1, 0};
            assertArrayEquals(expected, ArrayCompressor.compressNumbers(input));
        }

        @Test
        @DisplayName("Массив без дубликатов")
        void shouldReturnSameArrayWhenNoDuplicates () {
            int[] input = {1, 2, 3, 4};
            int[] expected = {1, 2, 3, 4};
            assertArrayEquals(expected, ArrayCompressor.compressNumbers(input));
        }

        @Test
        @DisplayName("Все элементы одинаковые")
        void shouldReturnSingleElementWhenAllSame () {
            int[] input = {5, 5, 5, 5, 5};
            int[] expected = {5};
            assertArrayEquals(expected, ArrayCompressor.compressNumbers(input));
        }

        @Test
        @DisplayName("Пустой массив")
        void shouldReturnEmptyArrayWhenInputEmpty () {
            int[] input = {};
            int[] expected = {};
            assertArrayEquals(expected, ArrayCompressor.compressNumbers(input));
        }

        @Test
        @DisplayName("Массив из одного элемента")
        void shouldReturnSameArrayWhenSingleElement () {
            int[] input = {42};
            int[] expected = {42};
            assertArrayEquals(expected, ArrayCompressor.compressNumbers(input));
        }

        @Test
        @DisplayName("Null вместо массива")
        void shouldReturnEmptyArrayWhenInputNull () {
            int[] expected = {};
            assertArrayEquals(expected, ArrayCompressor.compressNumbers(null));
        }

        @Test
        @DisplayName("Отрицательные числа и нули")
        void shouldHandleNegativeNumbersAndZeros () {
            int[] input = {-1, -1, 0, 0, -2, -2, -1};
            int[] expected = {-1, 0, -2, -1};
            assertArrayEquals(expected, ArrayCompressor.compressNumbers(input));
        }

        @Test
        @DisplayName("Сложный случай с чередующимися дубликатами")
        void shouldHandleAlternatingDuplicates () {
            int[] input = {1, 1, 2, 2, 1, 1, 3, 3};
            int[] expected = {1, 2, 1, 3};
            assertArrayEquals(expected, ArrayCompressor.compressNumbers(input));
        }
    }

