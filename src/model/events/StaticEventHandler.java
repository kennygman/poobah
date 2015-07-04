package model.events;

import model.events.EventListener;
import model.events.Event;
import java.util.List;

public class StaticEventHandler
{
    private static List<EventListener> listeners;
    
    public static void processEvent(Event event)
    {
        event.checkPrerequesites();
        for(EventListener listener : listeners)
        {
            listener.checkEvent(event);
        }
        event.execute();
    }
    
    public static void addEventListener(EventListener listener)
    {
        listeners.add(listener);
    }
    
    private void removeEventListener(EventListener listener)
    {
        listeners.remove(listener);
    }
}
