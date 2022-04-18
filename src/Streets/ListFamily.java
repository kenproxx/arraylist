package Streets;

import java.util.ArrayList;
import java.util.List;

public class ListFamily {
    List<Family> familyList;

    public ListFamily() {
        this.familyList = new ArrayList<>();
    }

    public void add(Family family) {
        familyList.add(family);
    }

    public void display() {
        for (int i = 0; i < familyList.size(); i++) {
            System.out.println(familyList.get(i));
        }
        System.out.println("----------------------");
    }

    public void edit(String name, Family family) {
        int index = search(name);
        if (index == -1) {
            System.out.println("ko co");

        } else {
            familyList.set(index, family);
        }
    }

    public int search(String name) {
        for (int i = 0; i < familyList.size(); i++) {
            if (familyList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void del(String name) {
        familyList.remove(search(name));
    }


}
