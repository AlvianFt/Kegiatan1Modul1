import java.util.*;
import java.math.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int pilihan;
        String inputNIM, inputUname, inputPassword;
        Scanner inputPilih = new Scanner(System.in);
        System.out.print("=== Library System ===\n1. Login as Student\n2. Login as Admin\n3. Exit\nChoose option (1-3): ");
        pilihan = inputPilih.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("Enter your NIM : ");
                inputNIM = inputPilih.next();
                if (inputNIM.equals("202310370311436")) {
                    System.out.print("Sucessful Login as Student.");
                }else {
                    System.out.print("User not found.");
                }
                break;
            case 2:
                System.out.print("Enter your username (admin) : ");
                inputUname = inputPilih.next();
                System.out.print("Enter your password (admin) : ");
                inputPassword = inputPilih.next();
                if (inputUname.contentEquals("admin")) {
                    if (inputPassword.contentEquals("admin")) {
                        System.out.print("Successfull login as Admin.");
                    } else {
                        System.out.print("Admin User Not Found!");
                    }
                } else {
                    System.out.print("Admin User Not Found!");
                }
                break;
            case 3:
                return;
        }

    }
}