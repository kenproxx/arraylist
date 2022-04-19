package list.menu;

import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageStudent manageStudent = new ManageStudent();
        int choice = 0;

        do {
            System.out.println("----Menu----");
            System.out.println("vui long chon chuc nang");
            System.out.println(
                    "1. Thêm sv.\n"
                            + "2. In\n"
                            + "3. kiem tra rong\n"
                            + "4. lay ra so luong sinh vien\n"
                            + "5. lam rong~ danh sach\n"
                            + "6. tim kiem theo ma sinh vien\n"
                            + "7. xoa sinh vien theo ma\n"
                            + "8. tim kiem theo ten\n"
                            + "9. sap xep theo diem\n"
                            + "0. thoat\n"
                            + "-------------------------------------\n"
            );
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhap ma sinh vien"); String maSV = scanner.nextLine();
                    System.out.println("Nhap ten sv"); String nameSV = scanner.nextLine();
                    System.out.println("Nhap tuoi"); int ageSV = scanner.nextInt();
                    System.out.println("Nhap diem"); int scoreSV = scanner.nextInt();
                    Student sv = new Student(maSV, nameSV, scoreSV, ageSV);
                    manageStudent.studentArrayList.add(sv);
                    break;
                case 2:
                    for (int i = 0; i < manageStudent.studentArrayList.size(); i++) {
                        System.out.println(manageStudent.studentArrayList.get(i));
                    }
                    break;
                case 3:
                    if (manageStudent.studentArrayList.isEmpty()) {
                        System.out.println("danh sach rong roi`");
                        break;
                    } else {
                        System.out.println("danh sach sinh vien la: " + manageStudent.studentArrayList.size());
                        break;
                    }

                case 4:
                    System.out.println("so luong sinh vien la: " + manageStudent.studentArrayList.size());
                    break;
                case 5:
                    System.out.println("danh sach da duoc lam trong.");
                    manageStudent.studentArrayList.clear();
                    break;
                case 6:
                    System.out.println("nhap vao ma sinh vien");
                    String  masv = scanner.nextLine();
                    for (int i = 0; i < manageStudent.studentArrayList.size(); i++) {
                        if (manageStudent.studentArrayList.get(i).getMaSinhVien().equals(masv)) {
                            System.out.println(manageStudent.studentArrayList.get(i));
                            break;
                        }

                    }
                    System.out.println("ko co, nhap lai de!");
                    break;
                case 7:

                case 8:
                case 9:
            }
        } while (choice != 0);
    }

}
