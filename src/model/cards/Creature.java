package model.cards;

/**
 *
 * @author Drew Harker
 */
public abstract class Creature implements Card 
{
    private int maxHealth;
    private int currentHealth;
    private int maxEnergy;
    private int currentEnergy;
    
    private int drawCost;
    private int attackCost;
    private int actionCost;
    private int equipCost;
    private int addSkillCost;
    private int summonAllyCost;
    private int commandAllyCost;
    
    private String discription;
    private String specialDiscription;

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public void setMaxEnergy(int maxEnergy) {
        this.maxEnergy = maxEnergy;
    }

    public int getCurrentEnergy() {
        return currentEnergy;
    }

    public void setCurrentEnergy(int currentEnergy) {
        this.currentEnergy = currentEnergy;
    }

    public int getDrawCost() {
        return drawCost;
    }

    public void setDrawCost(int drawCost) {
        this.drawCost = drawCost;
    }

    public int getAttackCost() {
        return attackCost;
    }

    public void setAttackCost(int attackCost) {
        this.attackCost = attackCost;
    }

    public int getActionCost() {
        return actionCost;
    }

    public void setActionCost(int actionCost) {
        this.actionCost = actionCost;
    }

    public int getEquipCost() {
        return equipCost;
    }

    public void setEquipCost(int equipCost) {
        this.equipCost = equipCost;
    }

    public int getAddSkillCost() {
        return addSkillCost;
    }

    public void setAddSkillCost(int addSkillCost) {
        this.addSkillCost = addSkillCost;
    }

    public int getSummonAllyCost() {
        return summonAllyCost;
    }

    public void setSummonAllyCost(int summonAllyCost) {
        this.summonAllyCost = summonAllyCost;
    }

    public int getCommandAllyCost() {
        return commandAllyCost;
    }

    public void setCommandAllyCost(int commandAllyCost) {
        this.commandAllyCost = commandAllyCost;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getSpecialDiscription() {
        return specialDiscription;
    }

    public void setSpecialDiscription(String specialDiscription) {
        this.specialDiscription = specialDiscription;
    }
}
