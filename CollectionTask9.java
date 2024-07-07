//Write a program to store year and population in that year.
import java.util.ArrayList;
import java.util.List;

class PopulationData {
    private int year;
    private long population;

    public PopulationData(int year, long population) {
        this.year = year;
        this.population = population;
    }

    public int getYear() {
        return year;
    }

    public long getPopulation() {
        return population;
    }
}

public class CollectionTask9{
    public static void main(String[] args) {
        // Create a list to store population data
        List<PopulationData> populationDataList = new ArrayList<>();

        // Adding population data for different years
        populationDataList.add(new PopulationData(2000, 6000000000L));
        populationDataList.add(new PopulationData(2010, 7000000000L));
        populationDataList.add(new PopulationData(2020, 8000000000L));

        // Printing the population data
        System.out.println("Year \t Population");
        for (PopulationData data : populationDataList) {
            System.out.println(data.getYear() + "\t" + data.getPopulation());
        }
    }
}
