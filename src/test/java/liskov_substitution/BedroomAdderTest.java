package liskov_substitution; /**
 * Created by prashant on 1/10/16.
 */
import liskov_substitution.BedroomAdder;
import liskov_substitution.PenthouseSuite;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomAdderTest {
    @Test
    public void testAddsBedroomToPenthouse() {
        PenthouseSuite penthouse = new PenthouseSuite();
        BedroomAdder adder = new BedroomAdder();
        adder.addBedroom(penthouse);

        assertEquals(5, penthouse.numberOfBedrooms);
    }
}
