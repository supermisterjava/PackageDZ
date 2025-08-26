package dz;

//Задача №3(NO CORRECT)
//Создать программу дележа добычи на пиратском корабле. По обычаю, половина добычи идет владельцу корабля,
// половина оставшегося — капитану, остальное делится поровну между всеми членами команды, включая капитана.
//Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.
//Вывести на экран кому сколько пиастров полагается Сколько получит капитан (Джек Воробей, естественно), если он утверждает,
// что корабль принадлежит ему?
public class Dz2_3 {
    public static void main(String[] args) {
        int ownerShip = 4233;
        int captain = 25;
        int pirates = 9 + 1;//captains
        int pirateProduction = 25 / pirates;
        System.out.println("Premotion pirateProduction = " + " " + pirateProduction + " " + "Piastr");
        System.out.println("Premotion captain = " + " " + " " + captain + " + " + pirateProduction + " " +"Piastr");
        System.out.println("Premotion ownerShip = " + " " + ownerShip + " " + "+" + " " + captain + " " + "+" + " " + pirateProduction + " " + "Piastr");
    }
}
