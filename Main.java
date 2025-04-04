public class Main {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();

        // Pick 5 random cards
        for (int i = 0; i < 5; i++) {
            dealer.pickRandomCard();
        }
    }
}