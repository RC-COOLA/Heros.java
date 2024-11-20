public class Hero {
    private String name;
    private int powerLevel;
    private Affiliation affiliation;
    private String superpower;
    private String originCity;

// this is where the names are given values
public Hero(String name, int powerLevel, Affiliation affiliation, String superpower, String originCity) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.affiliation = affiliation;
        this.superpower = superpower;
        this.originCity = originCity;
    }

// These are the getter calls
public String getName() {
        return name;
    }

public int getPowerLevel() {
        return powerLevel;
    }
public Affiliation getAffiliation() {
        return affiliation;
    }

public String getSuperpower() {
        return superpower;
    }

public String getOriginCity() {
        return originCity;
    }
public String toString() {
        return "Hero{name='" + name + "', powerLevel=" + powerLevel +
", affiliation=" + affiliation + ", superpower='" + superpower + 
    "', originCity='" + originCity + "'}";
    }
}
