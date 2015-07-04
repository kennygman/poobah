package model.events;

public abstract class Event 
{
    public abstract String[] /*or EventType[]?*/ getEventTypes();
    
    public abstract void checkPrerequesites();
    
    public abstract void execute();
}
