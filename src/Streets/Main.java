package Streets;

public class Main {
    public static void main(String[] args) {
        ListFamily listF = new ListFamily();
        listF.add(new Family(1, "nha tt01"));
        listF.add(new Family(2, "nha tt02"));
        listF.add(new Family(3, "nha tt03"));
        listF.display();
        listF.edit("nha tt03", new Family(5, "nha tt04"));
        listF.del("nha tt01");
        listF.display();
    }

}
