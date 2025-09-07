public class AmusementParkRide {
    private String name;
    private int minimumHeight;
    private int visitors;
    private ArrayList<Person> riding;

    // ..

    public double averageHeightOfPeopleOnRide() {
        if (riding.isEmpty()) {
            return -1;
        }

        int sumOfHeights = 0;
        for (Person per: riding) {
            sumOfHeights += per.getHeight();
        }

        return 1.0 * sumOfHeights / riding.size();
    }

    // ..
}
