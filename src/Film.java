import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Film extends Movie {
    private int peak;
    static ArrayList<Film> allFilms = new ArrayList<Film>();

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
        String movieString = super.toString();
        return "Film "+ movieString + " and peaking at #" + peak;
    }
    static String newest() {
        return null;
    }
    int averageRevenue() {
        return 0;
    }

    static void readAllData() throws Exception {
        File dataFile = new File("FilmsDataFromWikipedia");
        Scanner textScanner = new Scanner(dataFile);
        int data1 = textScanner.nextInt();
        System.out.println(data1);
        int data2 = textScanner.nextInt();
        System.out.println(data2);
        String data3 = textScanner.next();
        System.out.println(data3);
        //  $2,923,706,026
        String data4String = textScanner.next();
        data4String = data4String.substring(1);
        data4String = data4String.replaceAll(",","");
        long data4 = Long.parseLong(data4String);
        //Long data4
        System.out.println(data4String);
        String data5 = textScanner.next();
        long year = Long.parseLong(data5);
        Date newDate = new Date(year);
        System.out.println(data5);
        String data6 = textScanner.next();
        System.out.println(data6);

        int rank = data1;
        String title = data3;
        long revenue = data4;
        Date releaseDate = newDate;
        int peak = data2;

        //1	1	Avatar	$2,923,706,026	2009	[# 1][# 2]

        Film newFilm = new Film(rank,title,revenue,releaseDate,peak);
        allFilms.add(newFilm);
    }

}
