import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Film extends Movie {
    private int peak;
    private static ArrayList<Film> allFilms = new ArrayList<Film>();

    public Film(int rank, String title, long revenue, LocalDate releaseDate, int peak) {
        super(rank, title, revenue, releaseDate);
        this.peak = peak;
    }

    public int getPeak() {
        return peak;
    }

    public void setPeak(int peak) {
        this.peak = peak;
    }

    public static ArrayList<Film> getAllFilms() {
        return allFilms;
    }

    public static void setAllFilms(ArrayList<Film> allFilms) {
        Film.allFilms = allFilms;
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
        // Scan the whole data file LINE-by-LINE \n (1 row at at time)
        textScanner.useDelimiter("\n");
        // Repeat scanning while there is another line (another row)
        while (textScanner.hasNext()) {
            // Extract individual line/row for scanning
            String fullRow = textScanner.nextLine();
            Scanner rowScanner = new Scanner(fullRow);
            // Each row has data chunks separated by tabs \t
            rowScanner.useDelimiter("\t");

            // Now turn each next chunk of data into your object's values

            //1	1	Avatar	$2,923,706,026	2009	[# 1][# 2]
            // Data chunk 1: "1"
            int data1 = rowScanner.nextInt();
            System.out.println("data1: " + data1);

            // Data chunk 2: "1"
            String data2String = rowScanner.next();
            data2String = data2String.replace("R","");
            data2String = data2String.replace("K","");
            data2String = data2String.replace("T","");
            data2String = data2String.replace("S","");
            int data2 = Integer.parseInt(data2String);
            System.out.println("data2: " + data2);

            // Data chunk 3: "Avatar"
            String data3 = rowScanner.next();
            System.out.println("data3: " + data3);

            // Data chunk 4: "$2,923,706,026"
            String data4String = rowScanner.next();
            data4String = data4String.substring(data4String.indexOf("$")+1, data4String.length());
            data4String = data4String.replaceAll(",", "");
            long data4 = Long.parseLong(data4String);
            System.out.println("data4: " + data4);

            // Data chunk 5: "2009"
            String data5 = rowScanner.next();
            int year = Integer.parseInt(data5);
            LocalDate newDate = LocalDate.of(year, 1,1);
            System.out.println("data5: " + newDate);

            // Data chunk 6: "[# 1][# 2]"
            String data6 = rowScanner.next();
            System.out.println("IGNORE data6: " + data6);

            int rank = data1;
            String title = data3;
            long revenue = data4;
            LocalDate releaseDate = newDate;
            int peak = data2;
            Film newFilm = new Film(rank, title, revenue, releaseDate, peak);
            allFilms.add(newFilm);
        }
    }

    static void describeAllFilms() {
        for (Film eachFilm: allFilms) {
            System.out.println(eachFilm);
        }
    }
}
