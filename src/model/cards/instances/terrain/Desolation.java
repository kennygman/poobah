package model.cards.instances.terrain;

import model.events.Event;
import model.events.EventListener;
import model.events.StaticEventHandler;
import model.cards.Terrain;


public class Desolation implements Terrain {
    
    public Desolation()
    {
        Event effect = new Event() {

            @Override
            public String[] getEventTypes() {
                String[] types = new String[2];
                types[0] = "Terrain";
                types[1] = "Activation";
                types[2] = "Health cost";
                return types;
            }

            @Override
            public void checkPrerequesites() {
                //none
            }

            @Override
            public void execute() {
                StaticEventHandler.addEventListener(new EventListener() {

                    @Override
                    public Event checkEvent(Event event) {
                        if(false) //event.getEventTypes().contains("Energy cost"))
                        {
                            return new Event() {

                                @Override
                                public String[] getEventTypes() {
                                    return event.getEventTypes(); // + effect.getEventTypes() - "Activation";
                                }

                                @Override
                                public void checkPrerequesites() {
                                    event.checkPrerequesites();
                                }

                                @Override
                                public void execute() {
                                    //Health cost
                                    event.execute();
                                }
                            };
                        }
                        else
                        {
                            return event;
                        }
                    }
                });
            }
        };
        
        StaticEventHandler.processEvent(effect);
    }
    
    public String getDescription()
    {
        return "TODO: description";
    }
}
