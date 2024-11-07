import model.Card;
import model.Client;
import operation.CardOperation;



public class ApplicationRunner {
    public static void main(String[] args) {
        Client client = new Client("Bogdan");

        Card[] cards = {
                new Card("3463456", 643, 92.78), // -
                new Card("2524545", 245, 105.91), // +
                new Card("2524545", 245, 63.61),// -
                new Card("3456344", 643, 145.97), // +
                new Card("4534533", 893, 809.13), // -
                new Card("2524545", 245, 100.01), //+
                new Card("5634325", 453, 56.87), // +
                new Card("2524545", 245, 39.45), //+
                new Card("2352451", 153, 325.84), // -
        };




        client.setCards(cards);
        int count = CardOperation.getDuplicateCard(cards);

        System.out.println(count);

    }
}