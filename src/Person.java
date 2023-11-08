public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void learn(String learn){
        System.out.println("Learn: " + learn);
    }

    public void walk(int walk){
        System.out.println("Walk: " + walk +" saat basat kununo.");
    }

    public void eat(String eat){
        System.out.println("Eat: " + eat);
    }

    @Override
    public String toString() {
        return " \n  Person: " +
                "\nName: " + name  +
                "\nDesignation: " + designation;
    }
}
