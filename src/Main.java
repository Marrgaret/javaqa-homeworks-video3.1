public class Main {
    /**
     * За каждые 20 рублей, потраченные на билет, начисляется 1 миля. Дробные мили не начисляются.
     * ticketPrice - цена билета.
     * perMiles - количество рублей за 1 милю.
     */
    public static void main(String[] args) {

        int ticketPrice = 9860;
        int perMiles = 20;

        int bonusMiles = ticketPrice / perMiles;

        System.out.println("Начислено: " + bonusMiles + " бонусных миль");
    }
}
