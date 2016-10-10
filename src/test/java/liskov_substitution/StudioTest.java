package liskov_substitution;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by prashant on 1/10/16.
 */
public class StudioTest {
    @Test
    public void testInitilizitionOfBedroom(){
        Studio studio = new Studio();
        assertEquals(0,studio.numberOfRooms);
    }

    @Test
    public void testSquareFootage(){
        Studio studio = new Studio();
        studio.setSquareFootage(500);
        assertEquals(500, studio.squareFootage);
    }


}
