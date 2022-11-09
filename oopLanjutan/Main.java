package oopLanjutan;
import java.util.Scanner;
public class Main {
    Scanner userInput = new Scanner(System.in);
    int alas , tinggi , sisi1 , sisi2, sisi3, sisi, tinggiPrisma;
    double jari;
   public static void main(String[] args) {
       Main main = new Main();
       String userChoice;
       boolean isNext = true ;
       while (isNext) {
           System.out.println("+++++ Rumus APP +++++ \n");
           System.out.println("1. Segitiga");
           System.out.println("2. Persegi");
           System.out.println("3. Lingkaran");
           System.out.println("4. Prisma");
           System.out.println("5. Bola");
           System.out.println("6. Kubus");


           System.out.print("\nPilihan Anda : ");
           userChoice = main.userInput.nextLine();
           switch (userChoice) {
            case "1":
            System.out.println("Rumus Segitiga\n");          
                System.out.println("Input Rumus Luas Segitiga\n");
                System.out.println("Menghitung Luas\n");
                System.out.print("Masukan Alas Segitiga: ");
                main.alas =  main.userInput.nextInt();
                System.out.print("Masukan Tinggi Segitiga: ");
                main.tinggi =  main.userInput.nextInt();
                System.out.println("Menghitung Keliling\n");
                System.out.print("Masukan sisi1 Segitiga: ");
                main.sisi1 = main.userInput.nextInt();
                System.out.print("Masukan sisi2 Segitiga: ");
                main.sisi2 = main.userInput.nextInt();
                System.out.print("Masukan sisi3 Segitiga: ");
                main.sisi3 = main.userInput.nextInt();
               Segitiga segitiga = new Segitiga(main.alas, main.tinggi, main.sisi1, main.sisi2, main.sisi3);
               segitiga.Luas();    
            break;
               case "2":
               System.out.println("Rumus Persegi\n");
               System.out.println("Input Rumus Persegi\n");
               System.out.println("Menghitung Luas & Keliling\n");
               System.out.print("Masukan Sisi Persegi: ");
               main.sisi =  main.userInput.nextInt();
               Persegi persegi = new Persegi(main.sisi);
               persegi.Luas();
               break;
               case "3":
               System.out.println("Rumus Lingkaran\n");
               System.out.println("Input Rumus Lingkaran\n");
               System.out.println("Menghitung Luas & Keliling\n");
               System.out.print("Masukan jari jari Lingkaran: ");
               main.jari =  main.userInput.nextInt();
               Lingkaran lingkaran = new Lingkaran(main.jari);
               lingkaran.Luas();
               break;
               case "4":
               System.out.println("Rumus Prisma\n");
               System.out.println("Input Rumus Prisma\n");
               System.out.println("Menghitung Volume Prisma\n");
               System.out.print("Masukan Tinggi Prisma: ");
               main.tinggiPrisma =  main.userInput.nextInt();
               Prisma prisma = new Prisma(main.tinggiPrisma);
               prisma.setAlas(main.alas);
               prisma.setTinggi(main.tinggi);
               prisma.setSisi1(main.sisi1);
               prisma.setSisi2(main.sisi2);
               prisma.setSisi3(main.sisi1);
               prisma.Luas();
               prisma.Volume();
               break;
               case "5":
               System.out.println("Rumus Lingkaran\n");
               System.out.println("Input Rumus Lingkaran\n");
               System.out.println("Menghitung Volume Lingkaran\n");
               System.out.print("Masukan Tinggi Prisma: ");
               Bola bola = new Bola();
               bola.setJari(main.jari);
               bola.Luas();
               bola.Volume();
               break;
               case "6":
               System.out.println("Rumus Lingkaran\n");
               System.out.println("Input Rumus Lingkaran\n");
               System.out.println("Menghitung Volume Lingkaran\n");
               Kubus kubus = new Kubus();
                kubus.setSisi(main.sisi);
               kubus.Luas();
               kubus.Volume();
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
