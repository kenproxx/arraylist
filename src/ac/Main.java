package ac;

public class Main {
    public static void main(String[] args) {
        Family manageFamily = new Family();
        manageFamily.add(new Person("kien", 24, "IT", 90150));
        manageFamily.add(new Person("nhung", 20, "IT", 9123150));
        manageFamily.add(new Person("thang", 60, "IT", 9190150));
        manageFamily.add(new Person("quynh", 40, "IT", 91356150));
        manageFamily.display();
        System.out.println(manageFamily.searchByName("nhung"));
        manageFamily.edit("kien2", new Person("luyen", 23, "coach", 123));
        manageFamily.display();
        manageFamily.del("thang");
        manageFamily.display();
    }
}
