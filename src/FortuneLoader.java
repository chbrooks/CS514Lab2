import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FortuneLoader {

    public List<Fortune> loadFromFile(String filename) {
        List<Fortune> fortuneList = new ArrayList<Fortune>();
        Scanner inputScanner;
        StringBuilder sb;
        String buf;

        try {
            inputScanner = new Scanner(filename);

            // what goes here?


        } catch(IOException e) {
            System.out.println("Unable to read in fortunes." + e);
        }
        return fortuneList;
    }

}
