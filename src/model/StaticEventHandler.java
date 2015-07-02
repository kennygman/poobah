package model;

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
    
    private void addEventListener(EventListener listener)
    {
        listeners.add(listener);
    }
    
    private void removeEventListener(EventListener listener)
    {
        listeners.remove(listener);
    }
}
