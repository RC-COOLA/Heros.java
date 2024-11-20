import java.util.ArrayList;
import java.util.Arrays;

public class HeroManager {
    private ArrayList<Hero> heroes;
    public HeroManager() {
        heroes = new ArrayList<>();
    }
    // Method to add heros
    public void addHero(Hero hero) {
        heroes.add(hero);
    }
    // Method to remove a hero by thier name
    public void removeHero(String name) {
        heroes.removeIf(hero -> hero.getName().equals(name));
    }
    // Method to search for a hero by name
    public Hero searchByName(String name) {
        for (Hero hero : heroes) {
            if (hero.getName().equalsIgnoreCase(name)) {
                return hero;
            }
        }
        return null; // This will have the hero not found 
    }

    // Method to search for heroes by affiliation
    public ArrayList<Hero> searchByAffiliation(Affiliation affiliation) {
        ArrayList<Hero> results = new ArrayList<>();
        for (Hero hero : heroes) {
            if (hero.getAffiliation() == affiliation) {
                results.add(hero);
            }
        }
        return results;
    }

    // Bubble Sort method to sort heroes increasing by thier power level
    public void bubbleSortHeroes() {
        for (int i = 0; i < heroes.size(); i++) {
            for (int j = 0; j < heroes.size() - 1 - i; j++) {
                if (heroes.get(j).getPowerLevel() > heroes.get(j + 1).getPowerLevel()) {
                    // Swap heroes
                    Hero temp = heroes.get(j);
                    heroes.set(j, heroes.get(j + 1));
                    heroes.set(j + 1, temp);
                }
            }
        }
    }
    public void insertionSortHeroes() {
        for (int i = 1; i < heroes.size(); i++) {
            Hero currentHero = heroes.get(i);
            int j = i - 1;
            while (j >= 0 && heroes.get(j).getPowerLevel() > currentHero.getPowerLevel()) {
                heroes.set(j + 1, heroes.get(j));
                j--;
            }
            heroes.set(j + 1, currentHero);
        }
    }

    //2D array format method
    public void displayHeroes2D() {
        String[][] heroArray = new String[heroes.size()][5];
        for (int i = 0; i < heroes.size(); i++) {
            heroArray[i][0] = heroes.get(i).getName();
            heroArray[i][1] = String.valueOf(heroes.get(i).getPowerLevel());
            heroArray[i][2] = heroes.get(i).getAffiliation().toString();
            heroArray[i][3] = heroes.get(i).getSuperpower();
            heroArray[i][4] = heroes.get(i).getOriginCity();
        }
        System.out.println(Arrays.deepToString(heroArray));
    }
    //display the heros 
    public void displayHeroes() {
        for (Hero hero : heroes) {
            System.out.println(hero);
        }
    }
}
