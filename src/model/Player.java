package Model;

import java.util.List;
import java.util.LinkedList;
import model.cards.Card;
import model.cards.Creature;


public class Player 
{
    private List<Card> hand; //LinkedList
    private Deck deck;
    private List<Card> discardPile; //LinkedList
    private Creature commander;
    private Creature ally1;
    private Creature ally2;
        
}
