package model;

import exception.CardNotFoundException;
import java.util.LinkedList;
import java.util.List;
import model.cards.Card;


public final class Deck 
{
    private final List<Card> cards;
    private final int FRONT = 0;
    
    public Deck(List<Card> cards)
    {
        this.cards = new LinkedList<>();
        addAll(cards);
        shuffle();
    }
    
    public void addCardToBottom(Card card)
    {
        cards.add(card);
    }
    
    public void addCardToTop(Card card)
    {
        cards.add(FRONT, card);
    }
    
    public void addAll(List<Card> cards)
    {
        this.cards.addAll(cards);
    }
    
    public Card draw() 
    {
        return cards.remove(FRONT);
    }
    
    public Card find(String requestedCardId) throws CardNotFoundException 
    {
        Card requestedCard = null;
        for(int i = 0; i < cards.size(); i++)
        {
            String currentCardId = cards.get(i).getId();
            if(currentCardId.equals(requestedCardId))
            {
                requestedCard = cards.remove(i);
                break;
            }
        }
        
        if(requestedCard == null)
        {
            throw new CardNotFoundException();
        }
        return requestedCard;
    }
    
    public void shuffle()
    { 
        boolean addToTop = true;
        for(int i = 0; i < (cards.size() * 2); i++)
        {
            int randomIndex = (int)(Math.random() * (cards.size() - 1));
            Card randomCard = cards.remove(randomIndex);
            if(addToTop)
            {
                addCardToTop(randomCard);
                addToTop = false;
            }
            else
            {
                addCardToBottom(randomCard);
                addToTop = true;
            }
        }
    }
     
    public boolean isEmpty()
    {
        return cards.isEmpty();
    }
    
    public boolean contains(Card card)
    {
        boolean exists = false;
        for(Card currentCard : cards)
        {
            if(currentCard.getId().equals(card.getId()))
            {
                exists = true;
                break;
            }
        }
        return exists;
    }
    
    public List<Card> listAllCards()
    {
        return cards;
    }
}
