
public class Main {

    public Card [] deck;

    public Main(){
        deck = new Card [52];
        for(int i=0; i < deck.length; i++){
            if (i<13) {
                deck[i] = new Card(i, "Spades", false);
            }
            else if (i<26) {
                deck[i] = new Card(i%13, "Diamonds", false);
            }
            else if (i<39) {
                deck[i] = new Card(i%13, "Hearts", false);
            }
            else if (i<52) {
                deck[i] = new Card(i%13, "Clubs", false);
            }
        }
        shuffle();
        printDeck();
    }

    public static void main(String[] args) {
        Main blackjack = new Main();
        Card myapp = new Card(0, "spades",true);

    }

    public void printDeck(){
        System.out.println("This deck: ");
        for (int i=0; i < deck.length; i++){
            deck[i].printCard();

        }
    }
    public void shuffle(){
        for (int i=0; i<deck.length; i ++){
            int randnum = (int)(Math.random()*52);
            Card cardholder = deck[randnum];
            deck[randnum]= deck[i];
            deck[i]=cardholder;

        }
    }
}

