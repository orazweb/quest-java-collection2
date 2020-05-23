import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Thanos {

    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));

        // TODO 1 : Modify Hero to implements Comparable and sort by name (ascending)
        Collections.sort(heroes);

        System.out.println("\nOrder by name:");
        showList(heroes);

        // TODO 2: Add a Comparator and sort by age (descending)
        /* Comparator */
        // Sort heroes by age
        Comparator<Hero> HeroAgeComparator = new Comparator<Hero>() {
            @Override
            public int compare(Hero hero1, Hero hero2) {
                if(hero2.getAge() < hero1.getAge()) {
                    return -1;
                } else if (hero2.getAge() > hero1.getAge()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };

        // 2 ème solution possible :
        // Trie un objet de la classe Hero avec l'attribut age avec un comparateur
        // Comparator<Hero> HeroAgeComparator = new Comparator<Hero>() {
        //
        //     public int compare(Hero hero1, Hero hero2) {
        //
        //       Integer heroAge1 = hero1.getAge();
        //       Integer heroAge2 = hero2.getAge();
        //
        //       //descending order
        //        return heroAge2.compareTo(heroAge1);
        //
        //      //ascending order
        //      //return heroAge1.compareTo(heroAge2);
        //     }
        // };

        Collections.sort(heroes, HeroAgeComparator);

        System.out.println("\nOrder by age:");
        showList(heroes);
    }

    /* show List*/
    private static void showList(List<Hero> heroes) {
        for (Hero heroe : heroes) {
            System.out.println(heroe.getName() + ", " + heroe.getAge());
        }
    }
}
