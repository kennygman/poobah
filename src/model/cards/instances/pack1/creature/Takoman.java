package model.cards.instances.pack1.creature;
import model.cards.Creature;


public class Takoman implements Creature
{
    private static final String cardId = "C1";
    
    public Takoman()
    {
        
    }

    @Override
    public String getName() {
        return "Takoman";
    }

    @Override
    public String getId() {
        return cardId;
    }

    @Override
    public int getMagnitudePoints() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String getDescription() {
        return "A squid like man with a very small brain, but powerful instincts";
    }
    
    @Override
    public String getSpecialEffectDiscription() {
        return "Sticky Hands: when Takoman draws, he draws 3 cards instead of 1";
    }
}
