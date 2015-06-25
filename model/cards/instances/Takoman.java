package model.cards.instances;

import model.StaticEventQueue;
import model.cards.Creature;

/**
 * 
 * @author Drew Harker
 */
public class Takoman extends Creature
{
    private static final String cardId = "C1";
    
    public Takoman()
    {
        setMaxHealth(100);
        setCurrentHealth(getMaxHealth());
        setMaxEnergy(20);
        setCurrentEnergy(getMaxEnergy());
    
        setDrawCost(20);
        setAttackCost(1);
        setActionCost(4);
        setEquipCost(4);
        setAddSkillCost(10);
        setSummonAllyCost(1);
        setCommandAllyCost(6);
        setDiscription("A squid like man with a very small brain, but powerful instincts");
        setSpecialDiscription("Sticky Hands: when Takoman draws, he draws 5 cards instead of 1");
    }
    
    
    //@Override
    public void draw() 
    {
        StaticEventQueue.addEvent(null);//pay cost
        StaticEventQueue.addEvent(null);//move 5 cards from deck to hand
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
