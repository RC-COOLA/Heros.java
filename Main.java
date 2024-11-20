public class Main {
    public static void main(String[] args) {
        HeroManager heroManager = new HeroManager();

        // I added the hero names and affiliated them with powerlevels and cities they are from 
        heroManager.addHero(new Hero("Spider-Man", 85, Affiliation.AVENGERS, "Web_Slinger", "New York"));
        heroManager.addHero(new Hero("Batman", 90, Affiliation.JUSTICE_LEAGUE, "Detective Skills", "Gotham"));
        heroManager.addHero(new Hero("Wolverine", 95, Affiliation.X_MEN, "Regeneration", "Alberta"));
        heroManager.addHero(new Hero("Wonder Woman", 100, Affiliation.JUSTICE_LEAGUE, "Super Strength", "Themyscira"));

        System.out.println("Original List of Heroes:");
        heroManager.displayHeroes();

        // Sort heroes using Bubble Sort
        System.out.println("\nHeroes Sorted by Power Level (Bubble Sort):");
        heroManager.bubbleSortHeroes();
        heroManager.displayHeroes();

        // Sort heroes using Insertion Sort
        System.out.println("\nHeroes Sorted by Power Level (Insertion Sort):");
        heroManager.insertionSortHeroes();
        heroManager.displayHeroes();

        //Remove a hero by name to demonstrate dynamic management
        System.out.println("\nRemoving 'Batman' from the list...");
        heroManager.removeHero("Batman");
        heroManager.displayHeroes();

        // Add new hero
        System.out.println("\nAdding 'Iron Man' to the list...");
        heroManager.addHero(new Hero("Iron Man", 95, Affiliation.AVENGERS, "Flight", "Malibu"));
        heroManager.displayHeroes();

        // Display the heroes in 2D array format
        System.out.println("\nHeroes in 2D Array Format:");
        heroManager.displayHeroes2D();

        // Search for a hero by thier name
        System.out.println("\nSearching for hero 'Wolverine':");
        Hero searchResult = heroManager.searchByName("Wolverine");
        if (searchResult != null) {
            System.out.println(searchResult);
        } else {
            System.out.println("Hero os not found!");
        }

        // Search for heroes by affiliation
        System.out.println("\nSearching for heroes in the 'JUSTICE_LEAGUE':");
        ArrayList<Hero> justiceLeagueHeroes = heroManager.searchByAffiliation(Affiliation.JUSTICE_LEAGUE);
        for (Hero hero : justiceLeagueHeroes) {
            System.out.println(hero);
        }
    }
}
