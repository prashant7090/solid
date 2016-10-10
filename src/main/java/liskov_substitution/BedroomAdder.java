package liskov_substitution;

/**
 * Created by prashant on 1/10/16.
 */
public class BedroomAdder {
    public void addBedroom(PenthouseSuite penthouse) {
        penthouse.numberOfBedrooms += 1;
    }
}
