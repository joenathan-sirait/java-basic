package sistemAcademic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import sistemAcademic.serve.RegisServe;

public class Main {
    Scanner userInput = new Scanner(System.in);
    String fullName  , courseName , room;
    int sks,cardIdentitas, totalSks;
    
    public static void main(String[] args) {
        String userChoice;
        Main main = new Main();
      
        RegisServe rs;
        List<RegisServe> students = new ArrayList<>(); 
        boolean isNext = true ;
        while (isNext) {
            System.out.println("+++++ Siswa APP +++++ \n");
            System.out.println("1. Regis Student & Add Learning Plan");

            System.out.println("2. Detail Student");
            System.out.print("\nPilihan Anda : ");
            userChoice = main.userInput.nextLine();
            switch (userChoice) {
             case "1":
             System.out.println("\nBiodata Student\n");
             
             System.out.print("Masukan Nama Lengkap: ");
             main.fullName =  main.userInput.nextLine();
            //  
             System.out.print("Masukan Course Name: ");
             main.courseName = main.userInput.nextLine();
             System.out.print("Masukan Room : ");
             main.room =  main.userInput.nextLine();
             System.out.print("Masukan Card Identitas: ");
              main.cardIdentitas =  main.userInput.nextInt();
             System.out.print("Masukan SKS :");
             main.sks = main.userInput.nextInt();
             rs = new Student(main.fullName, main.cardIdentitas,main.courseName, main.room, main.sks,main.totalSks);
             students.add(rs);
             rs.regisStudents("", 0, "", "", 0,0);
            
             break;
                case "2":
                System.out.println("Cari Students");
                System.out.println(students.toString());
                break;
                default:
                System.out.println("Anda tidak pilih apapun\n");
                 break;
            }
 
            System.out.print("Apakah anda ingin melanjutkan aplikasi (y/n)? ");
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
