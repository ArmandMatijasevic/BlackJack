public class Player {

    public boolean isDealer = false;
    public Card[] hand;
    public int numPlayer;
    public int numCards;
    int cardSum;

    public Player(int pnumPlayer, boolean pisDealer){
        numPlayer = pnumPlayer;
        hand = new Card[11];
        numCards=0;
        isDealer = pisDealer;
    }

    public void printHand(){
        for(int i=0; i<numCards; i++){
            hand[i].printCard();
        }
    }

    public void addCard(Card newCard){
        hand[numCards] = newCard;
        numCards++;
    }

    public void cardSum(){
        cardSum=0;
        for(int i=0; i<numCards; i++){
            cardSum=cardSum+hand[i].value;
        }
        System.out.println("Player " + numPlayer + " is at " + cardSum + " with the cards ");

    }
}
