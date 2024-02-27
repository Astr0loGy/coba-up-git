package Tugas;
import java.util.Scanner;

public class Demotugas1 {
    public static void main (String[] args){

        System.out.println("---- Library System ----");
        System.out.println("1. Login as Student");
        System.out.println("1. Login as Admin");
        System.out.println("3. Exit");

        for (int j = 0; j < 10; j++) {
            int pilihanUser;
            System.out.print("Choose your option (1-3):");
            Scanner Inputopsi = new Scanner(System.in);
            pilihanUser = Inputopsi.nextInt();

            if (pilihanUser == 1) {
                for (int i = 0; i < 10; i++) {
                    String NIM;
                    System.out.print("Enter Your NIM = ");
                    Scanner InputNIM = new Scanner(System.in);
                    NIM = InputNIM.nextLine();

                    if (NIM.length() == 15) {
                        System.out.println("Login successfull");
                        break;
                    } else {
                        System.out.println("Login Failed");
                        System.out.println("NIM Has To Be 15 Digits");
                    }
                }
            break;
            }
            else if (pilihanUser == 2) {
                String Username;
                System.out.print("Enter Your Username = ");
                Scanner inputUsername = new Scanner(System.in);
                Username = inputUsername.nextLine();
                String passWord;
                System.out.print("Enter Your Password = ");
                Scanner inputPass = new Scanner(System.in);
                passWord = inputPass.nextLine();
                System.out.println("Your Username and password is correct");
                System.out.println("Halo Selamat Datang " + Username);
            break;
            }
            else if (pilihanUser == 3) {
                System.out.println("Exit, babai..");
            break;
            }
            else {
                System.out.println("Please choose a number between 1 and 3");
            }
        }
    }

}





