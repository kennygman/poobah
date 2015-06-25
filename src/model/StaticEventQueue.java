package model;

import java.util.List;
import java.util.Queue;

public class StaticEventQueue 
{
    private static Queue<Event> eventQueue; //TODO: Implement the queue
    private static List<EventListener> listeners;
    
    public static void addEvent(Event event)
    {
        boolean addEvent = true;
        for(EventListener listener : listeners)
        {
            if(listener.checkEvent(event))
            {
                addEvent = false;
                break;
            }
        }
        if(addEvent)
        {
            eventQueue.add(event);
        }
    }
    
    //removeEvent()//??? No, a chain can break if the preconditions are not met, but an event cannot be removed from the queue
    
    private void addEventListener(EventListener listener)
    {
        listeners.add(listener);
    }
    
    private void removeEventListener(EventListener listener)
    {
        listeners.remove(listener);
    }
    
    public static void nextEvent()
    {
        EventProcessor.process(eventQueue.remove());
    }
    
    private static class EventProcessor //TODO: Should the events manage themselves? Or should we implement this event processor?
    //if events manage themselves, events themselves have access to everything.
    //if we bottle the access by implementing this class, we have to put every case of events here.
    {
        static void process(Event event)
        {
            
        }
    }
}
