import java.util.Comparator;

public class Hero implements Comparable<Hero> {

    // attributs
    private String name;
    private int age;

    // constructeurs
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // accesseurs (getters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // mutateurs (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // TODO
    // Modifie la classe Hero afin d'implémenter Comparable.
    // L'ordre de tri par défaut sera sur l'attribut name, par ordre croissant.
    @Override
    public int compareTo(Hero hero) {

        return this.getName().compareTo(hero.getName()); // tri par ordre croissant
        // return hero.getName().compareTo(this.getName()); // tri par ordre décroissant
    }

    // // Trie un objet de la classe Hero avec l'attribut age avec un comparateur
    // public static Comparator<Hero> HeroAgeComparator = new Comparator<Hero>() {
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




}
