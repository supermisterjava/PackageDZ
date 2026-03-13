package lection.lections.lec10;

public class Main {
    public static void main(String[] args) {

        //    main();
        System.out.println(circuference(5));
    }

    public static void main() {
        double radius = 2;
        double square = Utils.squareCircle(radius);
        System.out.println(square);
    }

    public static double circuference(double radius) {
        return 2 * 3.14 * radius;

    }
}


