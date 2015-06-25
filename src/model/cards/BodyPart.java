package model.cards;

/**
 *
 * @author Drew Harker
 */
 public class BodyPart
{
    public final BodyPartType type;
    private Equipment equippedItem;

    public BodyPart(BodyPartType type)
    {
        this.type = type;
        equippedItem = null;
    }

    public void equipItem(Equipment item) throws Exception
    {
        if(canEquip())
        {
            equippedItem = item;
        }
        else 
        {
            throw new Exception(); //AlreadyEquippedException
        }
    }

    public Equipment getEquippedItem()
    {
        return equippedItem;
    }

    public boolean canEquip()
    {
        return (equippedItem == null);
    }
    
    
    
    
    public enum BodyPartType
    {
        HEAD, NECK, TORSO, WAIST, ARM, HAND, LEG, FOOT;
    }
}

