public class Singer extends Person{
    private String banName;

    public Singer(String name, String designation, String banName) {
        super(name, designation);
        this.banName = banName;
    }

    public String getBanName() {
        return banName;
    }

    public void setBanName(String banName) {
        this.banName = banName;
    }

    public void singing(String singing){
        System.out.println("Music: " + singing);
    }

    public void playGitar(String playGitar){
        System.out.println("Play gitar: " + playGitar);
    }

    @Override
    public String toString() {
        return "\n  Singer: " +
                "\nBan name='" + banName
                + super.toString();
    }
}
