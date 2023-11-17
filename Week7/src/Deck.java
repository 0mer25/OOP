public class Deck {
    Card[] cardDeck = new Card[52];
    public Deck()
    {
        int x = 0;
        for(int i = 0 ; i < 4 ; i++)
        {
            for(int j = 0 ; j < 13 ; j++)
            {
                cardDeck[x] = new Card(Card.SUIT.values()[i] , Card.RANK.values()[j]);
                x++;
            }
        }
    }

    public void PrintAll()
    {
        int x = 0;
        for(int i = 0 ; i < 4 ; i++)
        {
            for(int j = 0 ; j < 13 ; j++)
            {
                System.out.println((x+1) + " - " + cardDeck[x].GetSuit() + " " + cardDeck[x].GetRank());
                x++;
            }
        }
    }
}
