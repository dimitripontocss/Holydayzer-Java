public class Holyday {
    String date;
    String name;

    public Holyday(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public void getInfo() {
        System.out.print(this.date);
        System.out.print(" => ");
        System.out.println(this.name);
    }
}
