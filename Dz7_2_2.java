package dz;

//Тимми и Сара думают, что влюблены,
// но в их местности они узнают об этом
// только после того, как сорвут по
// одному цветку. Если у одного цветка
// четное количество лепестков, а у
// другого — нечетное, это значит
// , что они влюблены.
//Напишите функцию, которая будет
// принимать количество лепестков
// каждого цветка и возвращать true,
// если они влюблены, и false, если нет.
public class Dz7_2_2 {
    public static void main(String[] args) {
        System.out.println(isLove(1, 4)); // true (одно четное, другое нечетное)
        System.out.println(isLove(2, 2)); // false (оба четные)
        System.out.println(isLove(3, 3)); // false (оба нечетные)
        System.out.println(isLove(4, 5)); // true (одно четное, другое нечетное)
    }

    public static boolean isLove(final int flower1, final int flower2) {
        return flower1 % 2 != flower2 % 2;

    }
}


