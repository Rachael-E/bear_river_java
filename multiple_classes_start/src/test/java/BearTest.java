import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear1;
    Salmon salmon1;
    River river1;

    @Before
    public void before(){
        bear1 = new Bear("Baloo");
        salmon1 = new Salmon();
        river1 = new River();
        river1.addFish(salmon1);
    }

    @Test
    public void bellyStartsEmpty(){
        assertEquals(0, bear1.foodCount());
    }

    @Test
    public void canEatSalmon(){
        bear1.eatFishFromRiver(river1);
        assertEquals(1, bear1.foodCount());
        assertEquals(0, river1.fishCount());
    }

    @Test
    public void shouldEmptyBellyAfterSleeping(){
        bear1.eatFishFromRiver(river1);
        assertEquals(bear1.foodCount(), 1);
        bear1.sleep();
        assertEquals(bear1.foodCount(), 0);
    }
}
