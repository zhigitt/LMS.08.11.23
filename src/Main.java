public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Aliaskar", "Study", "Apple");

        System.out.println(programmer);

        programmer.eat("Besh barmak");
        programmer.walk(2);
        programmer.learn("Java");
        programmer.coding("OOP");

        System.out.println("==================================");
        Dancer dancer = new Dancer("Urmat", "dancing", "UrmatClub");

        System.out.println(dancer);

        dancer.eat("Hoshan");
        dancer.walk(1);
        dancer.learn("Learn dance");
        dancer.dancing("Shafl");

        System.out.println("==================================");
        Singer singer = new Singer("Joana", "sining", "Solo");

        System.out.println(singer);

        singer.eat("Salat");
        singer.walk(1);
        singer.learn("Music");
        singer.singing("Call my");
        singer.playGitar("Nazira");




    }
}