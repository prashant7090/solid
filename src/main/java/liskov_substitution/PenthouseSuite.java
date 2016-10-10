package liskov_substitution;

/**
 * Created by prashant on 1/10/16.
 */
public class PenthouseSuite {
    int squareFootage;
    int numberOfBedrooms;

    public PenthouseSuite() {
        this.numberOfBedrooms = 4;
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }
}
