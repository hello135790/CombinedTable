public class SingleTable {
    private int seats;
    private double viewQuality;
    private int height;
    /**
     * Returns the number of seats at this table. The value is always greater than
     * or equal to 4.
     */
    public SingleTable(int s, double v, int h) {
        seats = s;
        viewQuality = v;
        height = h;

    }
    public int getNumSeats() {
        return seats;
        /* implementation not shown */ }


    /** Returns the height of this table in centimeters. */
    public int getHeight() {
        return height;
        /* implementation not shown */ }


    /** Returns the quality of the view from this table. */
    public double getViewQuality() {
        return viewQuality;
        /* implementation not shown */ }


    /** Sets the quality of the view from this table to value . */
    public void setViewQuality(double value) {
        viewQuality = value;
        /* implementation not shown */ }
    // There may be instance variables, constructors, and methods that are not
    // shown.
}

