package liskov_substitution;

/**
 * Created by prashant on 1/10/16.
 */
public class Studio {
    int squareFootage;
    int numberOfRooms;

    public Studio() {
        this.numberOfRooms = 0;
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }
}
