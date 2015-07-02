package test;

import java.util.ArrayList;
import java.util.List;
import model.Deck;
import model.cards.Card;


public class TestDeck {
    private List<Card> smallList;
    private List<Card> largeList;
    
    //@BeforeClass
    public void setup()
    {
        smallList = new ArrayList();
        largeList = new ArrayList();
        
        populateSmallList("A");
        
        populateLargeList("A");
        populateLargeList("B");
        populateLargeList("C");
        populateLargeList("D");
        populateLargeList("E");
        populateLargeList("F");
        populateLargeList("G");
        populateLargeList("H");
        populateLargeList("I");
        populateLargeList("J");
    }
    
    private void populateLargeList(String prefix)
    {
        for(int i = 0; i < 10; i++)
        {
            largeList.add(new TestCard(prefix + i));
        }
    }
    
    private void populateSmallList(String prefix)
    {
        for(int i = 0; i < 10; i++)
        {
            smallList.add(new TestCard(prefix + i));
        }
    }
    
    //@Test
    public void testShuffle()
    {
        Deck smallDeck = new Deck(smallList);
        smallDeck.shuffle();
        System.out.println("Small deck:");
        while(!smallDeck.isEmpty())
        {
            System.out.print(smallDeck.draw().getName() + " ");
        }
        System.out.println();
        
        
        Deck largeDeck = new Deck(largeList);
        largeDeck.shuffle();
        System.out.println("Large deck:");
        int count = 0;
        while(!largeDeck.isEmpty())
        {
            count++;
            System.out.print(largeDeck.draw().getName() + " ");
            if(count == 10)
            {
                count = 0;
                System.out.println();
            }
        }
    }
    
    //TODO: test other methods
    
    
    private class TestCard implements Card
    {
        private final String name;
        
        public TestCard(String name)
        {
            this.name = name;
        }
        
        @Override
        public String getName()
        {
            return name;
        }
        
        @Override
        public String getId()
        {
            return "testId";
        }
    }
    
    public static void main(String[] args)
    {
        TestDeck test = new TestDeck();
        test.setup();
        test.testShuffle();
    }
}
