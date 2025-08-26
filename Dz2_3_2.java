package dz;
/// /Создать программу дележа добычи на пиратском корабле. По обычаю, половина добычи идет владельцу корабля,
/// / половина оставшегося — капитану, остальное делится поровну между всеми членами команды, включая капитана.
/// /Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.
/// /Вывести на экран кому сколько пиастров полагается Сколько получит капитан (Джек Воробей, естественно), если он утверждает,
/// / что корабль принадлежит ему?
public class Dz2_3_2 {
    public static void main(String[] args) {
        int totalLoot = 4233;
        int noOfPirates = 37;

        int remainder = totalLoot;
        int ownerShare = remainder / 2;
        remainder = remainder - ownerShare;
        int captainShare = remainder / 2;
        remainder = remainder - captainShare;
        int pirateShare = remainder / (noOfPirates + 1);
        remainder = remainder - pirateShare * (noOfPirates + 1);

        System.out.println(ownerShare + " " + "ownerShare");
        System.out.println(captainShare + " " + "captainShare");
        System.out.println(pirateShare + " " + "pirateShare");
        System.out.println(totalLoot + " " + "totalLoot");
        System.out.println(noOfPirates + " " + "noOfPirates");
        System.out.println(remainder + " " + "remainder");
        System.out.println(ownerShare + captainShare + (pirateShare * (noOfPirates + 1)) + remainder == totalLoot);
    }
}