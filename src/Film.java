import java.util.Date;

public class Film extends Movie {
    private int peak;

    public Film(int rank, String title, long revenue, Date releaseDate, int peak) {
        super(rank, title, revenue, releaseDate);
        this.peak = peak;
    }

    public int getPeak() {
        return peak;
    }

    public void setPeak(int peak) {
        this.peak = peak;
    }

    public String toString() {
        return "Film #" + getRank() + " is " + getTitle() + " (released on: " + getReleaseDate() + ") earning $" + getRevenue() + " and peaking at #" + peak;
    }
    String newest() {
        return null;
    }
    int averageRevenue() {
        return 0;
    }
}
