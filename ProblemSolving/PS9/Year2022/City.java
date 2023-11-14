package PS9.Year2022;

public class City {
    private String name;
    private int population;
    private Location location;

    public City(String name, int population, Location location) {
       setName(name);
       setPopulation(population);
       setLocation(location);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {return name;}
    public int getPopulation() {return population;}
    public Location getLocation() {return location;}


    public String toString() {
        return "\nName: "+getName()+" Population: "+getPopulation()+
                " Location: "+getLocation();
    }

    public double getDistanceBetween(City city1, City city2){


        return
    }
}

