public class Card {
    public enum SUIT{
        DIAMOND,
        CLUB,
        HEART,
        SPADE
    };

    public enum RANK{
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING

    };
    SUIT suit;
    RANK rank;
    public Card(SUIT suit , RANK rank)
    {
        this.suit = suit;
        this.rank = rank;
    }
    SUIT GetSuit(){return suit;}
    RANK GetRank(){return rank;}
    int GetValue(){return rank.ordinal() + 1;}
    void ToString()
    {
        System.out.println(suit + " " + rank);
    }

}
