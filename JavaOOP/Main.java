package JavaOOP;
import java.util.Scanner;

public class Main {
     Scanner userInput = new Scanner(System.in);
     String firstName, lastName ,domisili, tahunLahir, lastEducation;
     int usia ;
    public static void main(String[] args) {
        Main main = new Main();
        String userChoice;
        String educationChoice;
        boolean isNext = true ;
        while (isNext) {
            System.out.println("Pilih nomor");
            System.out.println("1. input Person");
            System.out.println("2. input Pendidikan");
            System.out.println("3. Show Person");
            System.out.println("4. Show Pendidikan");
            System.out.println("5. Cancel");


            System.out.print("\nPilihan Anda : ");
            userChoice = main.userInput.nextLine();
          

            switch (userChoice) {
                case "1":
               
                System.out.println("Input Person\n");
                System.out.print("Input Nama Depan: ");
                main.firstName =  main.userInput.nextLine();
                System.out.print("Input Nama Belakang: ");
                main.lastName =  main.userInput.nextLine();
                System.out.print("Input domisili: ");
                main.domisili =  main.userInput.nextLine();
                System.out.print("Input tahun lahir: ");
                main.tahunLahir =  main.userInput.nextLine();
                if (main.tahunLahir.matches("[a-zA-Z]+") ){
                    System.out.println("Mohon masukan tahun dengan benar");
                    isNext = false;
                    System.out.println("data gagal tersimpan");
                    break;
                }
                System.out.println("Data tersimpan.");
                break;

                case "2":
                
                System.out.println("Input Pendidikan\n");
                System.out.println("Pilih Pendidikan Terakhir");
                System.out.println("1. SD");
                System.out.println("2. SMP");
                System.out.println("3. SMA");
                System.out.println("4. D3");
                System.out.println("5. S1 or higher");
                System.out.print("\nPilihan Anda : ");
                educationChoice = main.userInput.nextLine();
                switch (educationChoice) {
                    case "1":
                    main.lastEducation = "SD";
                    break;
                    case "2":
                    main.lastEducation = "SMP";
                    break;
                    case "3":
                    main.lastEducation = "SMA";
                    break;
                    case "4":
                    main.lastEducation = "D3";
                    case "5":
                    main.lastEducation = "S1 or higher";
                    break;
                    default:
                    System.out.println("anda tidak memilih apapun");
                        break;
                }
                break;

                case "3":

                System.out.println("Show Person\n");
                Person person = new Person(main.firstName, main.lastName, main.domisili, main.tahunLahir, main.usia);
                if (main.firstName == null || main.lastName == null || main.domisili == null || main.tahunLahir == null) {
                    System.out.println("DATA BELUM DI ISI");
                    break;
                } else if (main.tahunLahir.matches("[a-zA-Z]+") ){
                    System.out.println("Mohon masukan tahun dengan benar");
                    break;
                }
                person.getPerson();
                break;

                case "4":
                System.out.println("Show Pendidikan\n");
                Pendidikan pendidikan = new Pendidikan(main.lastEducation);
                pendidikan.getLastPendidkan();
                break;
                case "5":
                isNext = false;
                break;
                default:
                System.out.println("Anda tidak pilih apapun\n");
                    break;
            }

            System.out.print("Apakah anda ingin melanjutkan (y/n)? ");
            userChoice = main.userInput.nextLine();
            isNext = userChoice.equalsIgnoreCase("y");

            while(!userChoice.equalsIgnoreCase("y") && !userChoice.equalsIgnoreCase("n")) {
                System.out.println("Pilhan anda bukan Y / N , pilihlah Y / N !");
                System.out.print("Apakah anda ingin melanjutkan (y/n)? ");
                userChoice = main.userInput.nextLine();
                isNext = userChoice.equalsIgnoreCase("y");
            }
        }
    }
}
