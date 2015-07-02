package model;

public abstract class Event 
{
    //private EventType[] types;
    
    public abstract void checkPrerequesites();
    
    public abstract void execute();
}
