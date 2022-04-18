package ac;

import java.util.ArrayList;
import java.util.List;

public class Family {
    List<Person> personList;

    public Family() {
        this.personList = new ArrayList<>();
    }

    public void display() {
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }
        System.out.println("-----------------------------");
    }

    public void add(Person person) {
        personList.add(person);
    }
    public int searchByName(String name) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void edit(String name, Person person) {
        int index = searchByName(name);
        if (index == -1) {
            System.out.println("khong co");

        } else {
            personList.set(index, person);
        }
    }

    public void del(String name) {
        int index = searchByName(name);
        if (index == -1) {
            System.out.println("khong co");

        } else {
            personList.remove(personList.get(index));
        }
    }


}
