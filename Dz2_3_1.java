package dz;

public class Dz2_3_1 {
    //new metod
    public static void main(String[] args) {
        int loot = 4233;//Размер добычи (например, в пиастрах) — переменная loot
        int pirates = 36; //Количество пиратов на корабле (включая капитана) — переменная pirates
        int ownerChare = loot / 2;
        int captainShare; //Капитан — Джек Воробей, корабль принадлежит ему.
        int remainingAfterOwner = loot - ownerChare;//Оставшаяся после части добычи:
        captainShare = remainingAfterOwner / 2;//Доля капитана:Половина от оставшейся части добычи
        int remainingForCrew = remainingAfterOwner - captainShare;//Оставшаяся добыча для команды:
        int sharePerPirate = remainingForCrew / pirates;//Доля одного члена команды:
        int captain_total = captainShare + sharePerPirate;//Суммируемая доля капитана и его часть из равного распределения:
        System.out.println("Долю владельца корабля (Джека Воробья) —owner + \n" + ownerChare +
                "\n" +
                "Долю капитана (как капитана и как члена команды) —\n" + captain_total +
                "\n" +
                "Долю каждого члена команды (обычного пирата) —\n" + sharePerPirate +
                "\n" +
                "Общее кол денег и количество пиратов\n" + loot + " " + pirates +
                "\n");
    }
}
