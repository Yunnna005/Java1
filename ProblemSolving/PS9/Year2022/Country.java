package PS9.Year2022;

import java.util.Arrays;

public class Country {
    private  String name;
    private  String capital;
    private int population;
    private int area;
    private City[] cities;
    private  String currency;
    private  String language;

    public Country(String name, String capital, int population, int area, City[] cities, String currency, String language) {
        setName(name);
        setCapital(capital);
        setPopulation(population);
        setArea(area);
        setCities(cities);
        setCurrency(currency);
        setLanguage(language);
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public void setArea(int area) {
        this.area = area;
    }
    public void setCities(City[] cities) {
        this.cities = cities;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {return capital;}
    public int getPopulation() {return population;}
    public int getArea() {return area;}
    public City[] getCities() {return cities;}
    public String getCurrency() {return currency;}
    public String getLanguage() {return language;}


    public String toString() {
        String output = "Name: " + getName() + "\nCapital: " + getCapital() + "\nPoputation: " + getPopulation() +
                "\nArea: " + getArea() + "\nCities:\n";

        for (int i = 0; i< getCities().length; i++){
            output += getCities()[i];
        }

        output += "\n\n\nCurrency: "+getCurrency()+"\nLanguage: "+getLanguage();
        return output;

    }
}
