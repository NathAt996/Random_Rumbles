package Historical_Documents;

import java.util.ArrayList;
import java.util.List;

public class Archive {

    public static void main(String[] args) {

        List<HistoricalDocument> archives = new ArrayList<>();

        archives.add(new Treaty("Peace of Westphalia", "Emperor Ferdinand III and allies", 1648));
        archives.add(new Flag("Betsy Ross Flag", "Elizabeth Griscom Ross", 1870));
        archives.add(new Manuscripts("Papyrus of Ani", "Ani the Scribe", -1500));

        System.out.println("--- ARCHIVES ---");

        for(HistoricalDocument d : archives) {
            d.Interpret();
            System.out.println();
        }
    }
}
