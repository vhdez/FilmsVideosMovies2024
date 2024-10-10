import java.util.Date;

public class Movie {
    private int rank;
    private String title;
    private long revenue;
    private Date releaseDate;

    public Movie(int rank, String title, long revenue, Date releaseDate) {
        this.rank = rank;
        this.title = title;
        this.revenue = revenue;
        this.releaseDate = releaseDate;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getRevenue() {
        return revenue;
    }

    public void setRevenue(long revenue) {
        this.revenue = revenue;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String toString() {
        return "Movie #" + rank + " is " + title + " (released on: " + releaseDate + ") earning $" + revenue;
    }
    String newest() {
        return null;
    }
    int averageRevenue() {
        return 0;
    }

}
