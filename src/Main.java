public class Main {
    public static void main(String[] args) {
        int ticketAmount = 10_000;
        int amountForOneBonus = 20;
        int bonusMiles;
        bonusMiles = ticketAmount / amountForOneBonus;
        System.out.println("Ваш бонус составил: " + bonusMiles);
    }
}