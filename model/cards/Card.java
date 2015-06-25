package model.cards;

/**
 *
 * @author Drew Harker
 */
public interface Card 
{
    public String getId();
    
    public String getName();
    public CardType getType();
}
