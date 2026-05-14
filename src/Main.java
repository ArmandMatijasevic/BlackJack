import java.util.Scanner;
public class Main {

    public Card [] deck;

    public Main(){
        Player player = new Player(1, false);
      //  Player dealer = new Player(2, true);


        deck = new Card [52];
        for(int i=0; i < deck.length; i++){
            if (i<13) {
                deck[i] = new Card((i), "Spades", false);
            }
            else if (i<26) {
                deck[i] = new Card((i%13), "Diamonds", false);
            }
            else if (i<39) {
                deck[i] = new Card((i%13), "Hearts", false);
            }
            else if (i<52) {
                deck[i] = new Card((i%13), "Clubs", false);
            }

        }

        shuffle();
        printDeck();
        for (int q=0; q<2; q++){
            player.addCard(deck[q]);
        }
        player.cardSum();
        player.printHand();
     //   dealer.cardSum();
      //  dealer.printHand();
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        if (input.equals("h")){
            System.out.println("Player " + player.numPlayer+ " hits");
            player.numCards +=1;
            player.cardSum();
        }
        if (input.equals("s")){
            System.out.println("Player " + player.numPlayer+ " stays with a value of "+player.cardSum);
        }

    }

    public static void main(String[] args) {
        Main blackjack = new Main();
        //Card myapp = new Card(3, "spades",true);

    }

    public void printDeck(){

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

