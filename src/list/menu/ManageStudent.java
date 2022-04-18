package list.menu;

import java.util.ArrayList;
import java.util.Scanner;


public class ManageStudent {
    Scanner scanner = new Scanner(System.in);
     ArrayList<Student> studentArrayList;

    public ManageStudent(ArrayList<Student> studentArrayList) {
        this.studentArrayList = studentArrayList;
    }

    public ManageStudent() {
        this.studentArrayList = new ArrayList<Student>();
    }
    public void add(Student student) {
        this.studentArrayList.add(student);
    }

    public boolean search() {
        System.out.println("nhap vao ma sinh vien");
        scanner.nextLine();
        int masv = scanner.nextInt();
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getMaSinhVien().equals(masv)) {
                System.out.println(studentArrayList.get(i));
                return true;
            }
                System.out.println("ko co, nhap lai de!");

        }
        return false;
    }

    public void delete(String masv) {
        search();
    }



}
