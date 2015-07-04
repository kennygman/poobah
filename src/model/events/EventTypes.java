package model.events;

public enum EventTypes {
    BEGIN_ATTACK_PHASE, END_ATTACK_PHASE, BEGIN_TURN, END_TURN, //Turn states
    
    ACTIVATION, DESTRUCTION, DISCARD, RETURN_TO_HAND,//types of card states
    
    ACTION, CREATURE, EQUIPMENT, SKILL, TERRAIN, //types of cards
    
    ENERGY_COST, HEALTH_COST, SPECIFIC_CARD_REQUEST//types of effects
}
