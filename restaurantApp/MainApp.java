package restaurantApp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import restaurantApp.model.Makanan;
import restaurantApp.model.Menu;
import restaurantApp.model.Minuman;
import restaurantApp.model.Paket;
import restaurantApp.repository.MakananImpl;
import restaurantApp.repository.MenuImpl;
import restaurantApp.repository.MinumanImpl;
import restaurantApp.repository.PaketImpl;
import restaurantApp.service.restaurantService;
public class MainApp {
private static restaurantService<Makanan, Integer> makananImpl;
private static restaurantService<Minuman, Integer> minumanImpl;
private static restaurantService<Paket, Integer> paketImpl;
private static restaurantService<Menu, Integer> menuImpl;
static Scanner userInput = new Scanner(System.in);
static String  makananMenu , minumanMenu, paketMenu;
static int  harga, totalPesanan, totalHargaMakanan, totalHargaMinuman, totalHargaPaket,totalHarga, ppn, totalHargaAkhir;
    public static void main(String[] args) {
       menuImpl = new MenuImpl(); 
       makananImpl = new MakananImpl();
       minumanImpl = new MinumanImpl();
       paketImpl = new PaketImpl();
       Menu menu = new Menu();
        String userChoice;
        int userTotal, makananInput,minumanInput, paketInput;
        boolean isNext = true ;
        while (isNext) {
            System.out.println("+++++ Restoran Prek +++++ \n");
            System.out.println("1. Lihat Daftar Menu");
            System.out.println("2. input Pemesanan");
            System.out.println("3. Pembayaran");
            System.out.print("\nPilihan Anda : ");
            userChoice = userInput.nextLine();
            menu = new Menu("Yamprek", 14000);
            menuImpl.save(menu);
            menu = new Menu("Leprek", 10000 );
            menuImpl.save(menu);
            menu = new Menu("Nasprek", 4000 );
            menuImpl.save(menu);
            menu = new Menu("Temprek", 1500 );
            menuImpl.save(menu);
            menu = new Menu("Teh Manis Anget", 14000);
            menuImpl.save(menu);
            menu = new Menu("Teh Manis Dingin", 10000 );
            menuImpl.save(menu);
            menu = new Menu("Fanta", 5000 );
            menuImpl.save(menu);
            menu = new Menu("Air iIneral", 500 );
            menuImpl.save(menu);
            menu = new Menu("YamPrek + NasPrek + Es teh manis anget", 30000);
            menuImpl.save(menu);
            menu = new Menu("LePrek + NasPrek + teh manis dingin", 20000 );
            menuImpl.save(menu);
            menu = new Menu("Yamprek + LePrek + Nasprek + Temprek + Air MIneral", 25000 );
            menuImpl.save(menu); 
            switch (userChoice) {
                case "1":    
                for (int i = 0; i < menuImpl.findAll().size(); i++) {
                    Menu makanan = menuImpl.findById(i);
                    if (i == 0 ) {
                        System.out.println("+++++++MENU MAKANAN+++++++ \n");
                    } else if ( i == 4  ) {
                        System.out.println("+++++++MENU MINUMAN+++++++ \n");
                    } else if (i == 8 ){
                        System.out.println("+++++++Paket+++++++ \n");
                    }
                    System.out.println(Integer.toString(i+1) + ". "+makanan.getNamaMenu() + "\tHarga :" + makanan.getHarga() + "\n");
                }
                break;
                case "2":
                    System.out.println("+++++++Pesan+++++++ \n");     
                    System.out.println("1. Makanan");
                    System.out.println("2. Minuman");
                    System.out.println("3. Paket");
                    System.out.print("\nPilihan Anda : ");
                    userChoice = userInput.nextLine();
                    switch (userChoice) {
                        case "1":
                        System.out.println("+++++++MENU MAKANAN+++++++ \n");
                        System.out.println("1. YamPrek - 14000");
                        System.out.println("2. LePrek - 10000");
                        System.out.println("3. NasPrek - 4000");
                        System.out.println("4. TemPrek - 1500");
                        System.out.println("\n");
                        while (isNext) {
                            System.out.print("Ingin menambah / mengubah / melihat / menghapus  pesanan ?  (tambah/ubah/hapus/lihat pesanan/kembali)? "); 
                            userChoice = userInput.nextLine();
                        if (userChoice.equalsIgnoreCase("tambah")) {                           
                            System.out.print("Silahkan Input Nomor Pesanan : ");
                            makananInput = userInput.nextInt();
                            System.out.print("Masukan Jumlah Pesanan :");
                            userTotal = userInput.nextInt();
                            Makanan makanan = new Makanan(menuImpl.findById(makananInput-1).getNamaMenu(),menuImpl.findById(makananInput-1).getHarga(),userTotal);
                            makananImpl.save(makanan); 
                            totalHargaMakanan = 0;
                            System.out.println("\n+++++++++++MAKANAN++++++++++");
                            showMakanan();
                            for (int i = 0 ; i < makananImpl.findAll().size(); i++) {
                                totalHargaMakanan += makananImpl.findById(i).getTotalHarga();                              
                            }
                            System.out.println("TOTAL HARGA:\t"+totalHargaMakanan+"\n");
                        } else if (userChoice.equalsIgnoreCase("ubah")){
                            System.out.println("Proses ubah");
                            System.out.println("Pesanan Anda :");
                            showMakanan();
                            System.out.println("TOTAL HARGA:\t"+totalHargaMakanan+"\n");
                            if (makananImpl.findAll().size() <= 0 && minumanImpl.findAll().size() <= 0 && paketImpl.findAll().size() <= 0) {
                                System.out.println("Tidak ada pesanan, PESEN DONK");
                            } else {
                                System.out.print("Silahkan Input Nomor Pesanan diatas yang ingin diubah : ");
                                userChoice = userInput.nextLine();
                                System.out.print("Masukan Jumlah Pesanan :");
                                userTotal = userInput.nextInt();
                                totalPesanan = userTotal;
                                Makanan makanan = new Makanan( makananMenu, harga,totalPesanan);
                                int id = Integer.parseInt(userChoice)-1;
                                makanan = makananImpl.findById(id);
                                makanan.setTotalPesanan(totalPesanan);
                                makananImpl.update(id, makanan);
                                showMakanan();
                                totalHargaMakanan = totalHargaMakanan * 0;
                                for (int i = 0 ; i < makananImpl.findAll().size(); i++) {
                                    totalHargaMakanan += makananImpl.findById(i).getTotalHarga();                              
                                }                             
                                System.out.println("TOTAL HARGA:\t"+totalHargaMakanan+"\n");
                            }
                            
                        } else if (userChoice.equalsIgnoreCase("kembali")) {
                            isNext = false;
                        } else if (userChoice.equalsIgnoreCase("hapus")){

                            if (makananImpl.findAll().size() <= 0 && minumanImpl.findAll().size() <= 0 && minumanImpl.findAll().size() <= 0) {
                                System.out.println("Tidak ada pesanan, PESEN DONK");
                            } else {
                                System.out.print("Silahkan Input Nomor Pesanan Diatas yang ingin dihapus : ");
                                userChoice = userInput.nextLine();
                                makananImpl.delete(Integer.parseInt(userChoice)-1);
                                System.out.println("Pesanan Terhapus");
                                showMakanan();
                                totalHargaMakanan = totalHargaMakanan * 0;
                                for (int i = 0 ; i < makananImpl.findAll().size(); i++) {
                                    totalHargaMakanan += makananImpl.findById(i).getTotalHarga();                              
                                }                             
                                System.out.println("TOTAL HARGA:\t"+totalHargaMakanan+"\n");
                            }  
                        } else if(userChoice.equalsIgnoreCase("lihat Pesanan")){
                            showMakanan();
                            System.out.println("TOTAL HARGA:\t"+totalHargaMakanan+"\n");
                        } else {
                            System.out.println("Mohom input Tambah / ubah /hapus/lihat pesanan/ kembali");
                            isNext = true;
                        }
                        }
                        break;
                        case "2":
                        System.out.println("+++++++MENU MINUMAN+++++++ \n");
                        System.out.println("1. Es teh manis anget - 14000");
                        System.out.println("2. Teh Manis Dingin - 10000");
                        System.out.println("3. Fanta - 5000");
                        System.out.println("4. Air Mineral - 2500");
                        System.out.println("\n");
                        while (isNext) {
                            System.out.print("Ingin menambah / mengubah / melihat / menghapus  pesanan ?  (tambah/ubah/hapus/lihat pesanan/kembali)? "); 
                            userChoice = userInput.nextLine();
                        if (userChoice.equalsIgnoreCase("tambah")) {                           
                            System.out.print("Silahkan Input Nomor Pesanan : ");
                            minumanInput = userInput.nextInt();
                            System.out.print("Masukan Jumlah Pesanan :");
                            userTotal = userInput.nextInt();
                            Minuman minuman = new Minuman(menuImpl.findById(minumanInput+3).getNamaMenu(),menuImpl.findById(minumanInput+3).getHarga(),userTotal);
                            minumanImpl.save(minuman); 
                            totalHargaMinuman = 0;
                            System.out.println("\n+++++++++MINUMAN++++++++");
                            showMinuman();
                            for (int i = 0 ; i < minumanImpl.findAll().size(); i++) {
                                totalHargaMinuman += minumanImpl.findById(i).getTotalHarga();                              
                            }
                            System.out.println("TOTAL HARGA:\t"+totalHargaMinuman+"\n");
                        } else if (userChoice.equalsIgnoreCase("ubah")){
                            System.out.println("Proses ubah");
                            System.out.println("Pesanan Anda :");
                            showMinuman();
                            System.out.println("TOTAL HARGA:\t"+totalHargaMinuman+"\n");
                            if (makananImpl.findAll().size() <= 0 && minumanImpl.findAll().size() <= 0 && minumanImpl.findAll().size() <= 0) {
                                System.out.println("Tidak ada pesanan, PESEN DONK");
                            } else {
                                System.out.print("Silahkan Input Nomor Pesanan diatas yang ingin diubah : ");
                                userChoice = userInput.nextLine();
                                System.out.print("Masukan Jumlah Pesanan :");
                                userTotal = userInput.nextInt();
                                totalPesanan = userTotal;
                                Minuman minuman = new Minuman( minumanMenu, harga,totalPesanan);
                                int id = Integer.parseInt(userChoice)-1;
                                minuman = minumanImpl.findById(id);
                                minuman.setTotalPesanan(totalPesanan);
                                minumanImpl.update(id, minuman);
                                showMinuman();
                                totalHargaMinuman = totalHargaMinuman * 0;
                                for (int i = 0 ; i < minumanImpl.findAll().size(); i++) {
                                    totalHargaMinuman += minumanImpl.findById(i).getTotalHarga();                              
                                }
                                System.out.println("TOTAL HARGA:\t"+totalHargaMinuman+"\n");
                            }                     
                        } else if (userChoice.equalsIgnoreCase("kembali")) {
                            isNext = false;
                        } else if (userChoice.equalsIgnoreCase("hapus")){

                            if (minumanImpl.findAll().size() <= 0 && minumanImpl.findAll().size() <= 0 && minumanImpl.findAll().size() <= 0) {
                                System.out.println("Tidak ada pesanan, PESEN DONK");
                            } else {
                                System.out.print("Silahkan Input Nomor Pesanan Diatas yang ingin dihapus : ");
                                userChoice = userInput.nextLine();
                                minumanImpl.delete(Integer.parseInt(userChoice)-1);
                                System.out.println("Pesanan Terhapus");
                                System.out.println("MINUMAN \n");
                                showMinuman();
                                totalHargaMinuman = totalHargaMinuman * 0;
                                for (int i = 0 ; i < minumanImpl.findAll().size(); i++) {
                                    totalHargaMinuman += minumanImpl.findById(i).getTotalHarga();                              
                                }
                                System.out.println("TOTAL HARGA:\t"+totalHargaMinuman+"\n");
                            }                     
                        } else if(userChoice.equalsIgnoreCase("lihat Pesanan")){
                           showPesanan();
                        } else {
                            System.out.println("Mohom input Tambah / ubah /hapus/lihat pesanan/ kembali");
                            isNext = true;
                        }
                        }
                        break;
                        case "3":
                        System.out.println("+++++++Menu Paket+++++++ \n");
                        System.out.println("1. Paket Prek A : YamPrek + NasPrek + Es teh manis anget - 30000");
                        System.out.println("2. Paket Prek B : LePrek + NasPrek + teh manis dingin - 20000");
                        System.out.println("3. Paket Prek C : Yamprek + LePrek + Nasprek + Temprek + Air MIneral  - 25000");
                        System.out.println("\n");
                        while (isNext) {
                            System.out.print("Ingin menambah / mengubah / melihat / menghapus  pesanan ?  (tambah/ubah/hapus/lihat pesanan/kembali)? "); 
                            userChoice = userInput.nextLine();
                        if (userChoice.equalsIgnoreCase("tambah")) {                           
                            System.out.print("Silahkan Input Nomor Pesanan : ");
                            paketInput = userInput.nextInt();
                            System.out.print("Masukan Jumlah Pesanan :");
                            userTotal = userInput.nextInt();
                            Paket paket = new Paket(menuImpl.findById(paketInput+7).getNamaMenu(),menuImpl.findById(paketInput+7).getHarga(),userTotal);
                            paketImpl.save(paket); 
                            totalHargaPaket = 0;
                            System.out.println("\n++++++++++++PAKET++++++++++++");
                            showPaket();
                            for (int i = 0 ; i < paketImpl.findAll().size(); i++) {
                                totalHargaPaket += paketImpl.findById(i).getTotalHarga();                              
                            }
                            System.out.println("Total harga = " + totalHargaPaket + "\n"); 
                        } else if (userChoice.equalsIgnoreCase("ubah")){
                            System.out.println("Proses ubah");
                            System.out.println("Pesanan Anda :");
                            showPaket();
                            if (makananImpl.findAll().size() <= 0 && paketImpl.findAll().size() <= 0 && paketImpl.findAll().size() <= 0) {
                                System.out.println("Tidak ada pesanan, PESEN DONK");
                            } else {
                                System.out.print("Silahkan Input Nomor Pesanan diatas yang ingin diubah : ");
                                userChoice = userInput.nextLine();
                                System.out.print("Masukan Jumlah Pesanan :");
                                userTotal = userInput.nextInt();
                                totalPesanan = userTotal;
                                Paket paket = new Paket( paketMenu, harga,totalPesanan);
                                int id = Integer.parseInt(userChoice)-1;
                                paket = paketImpl.findById(id);
                                paket.setTotalPesanan(totalPesanan);
                                paketImpl.update(id, paket);
                                showPaket();
                                totalHargaPaket = totalHargaPaket * 0;
                                for (int i = 0 ; i < paketImpl.findAll().size(); i++) {
                                    totalHargaPaket += paketImpl.findById(i).getTotalHarga();                              
                                }
                                System.out.println("Total harga = " + totalHargaPaket + "\n"); 
                            }                     
                        } else if (userChoice.equalsIgnoreCase("kembali")) {
                            isNext = false;
                        } else if (userChoice.equalsIgnoreCase("hapus")){

                            if (paketImpl.findAll().size() <= 0 && paketImpl.findAll().size() <= 0 && paketImpl.findAll().size() <= 0) {
                                System.out.println("Tidak ada pesanan, PESEN DONK");
                            } else {
                                System.out.print("Silahkan Input Nomor Pesanan Diatas yang ingin dihapus : ");
                                userChoice = userInput.nextLine();
                                paketImpl.delete(Integer.parseInt(userChoice)-1);
                                System.out.println("Pesanan Terhapus");
                                System.out.println("paket \n");
                                showPaket();
                                totalHargaPaket = totalHargaPaket * 0;
                                for (int i = 0 ; i < paketImpl.findAll().size(); i++) {
                                    totalHargaPaket += paketImpl.findById(i).getTotalHarga();                              
                                }
                                System.out.println("Total harga = " + totalHargaPaket + "\n"); 
                            }                     
                        } else if(userChoice.equalsIgnoreCase("lihat Pesanan")){
                           showPesanan();
                        } else {
                            System.out.println("Mohom input Tambah / ubah /hapus/lihat pesanan/ kembali");
                            isNext = true;
                        }
                        }
                        break;
                        default:
                        System.out.println("Mohon Pilih 1 - 3");
                        break;                    
                    }
                    break;                
                case "3":
                    System.out.println("PESANAN ANDA");
                    totalHarga = 0;
                    if (makananImpl.findAll().size() <= 0 && minumanImpl.findAll().size() <= 0 && paketImpl.findAll().size() <= 0) {
                        System.out.println("Pesanan Belum Ada");
                    } else {
                        while (isNext) {
                            showPesanan();
                            // PAYMENT
                            ppn =  (totalHargaMakanan + totalHargaMinuman + totalHargaPaket) / 100 * 11;
                            totalHarga = totalHargaMakanan + totalHargaMinuman + totalHargaPaket;
                            totalHargaAkhir = totalHarga + ppn;
                            System.out.println("PPN 11% = " + ppn);
                            System.out.println("Total Harga = " + totalHarga);
                            System.out.println("Total Harga yg harus dibayar = " + totalHargaAkhir);
                            System.out.print("CASH :");
                            userTotal = userInput.nextInt();
    
                            if (userTotal < totalHargaAkhir) {
                                System.out.println("Uang Nya Kurang");
                                System.out.println("Tolong Bayar dengan harga" + ">" + totalHarga);
                            } else if (userTotal == totalHargaAkhir){
                                System.out.println("\n=======STRUK======\n");
                                showTime();
                                showPesanan();
                                System.out.println("UANG : " + userTotal);
                                System.out.println("TERIMAKSIH HAPPY EATING");
                            }
                            else {
                                System.out.println("\n=======STRUK======\n");
                                showTime();
                                showPesanan();
                                System.out.println("Total Harga + PPN(11%) :" + totalHargaAkhir);
                                System.out.println("UANG : " + userTotal);
                                System.out.println("Kembalian : " + (userTotal - totalHargaAkhir));
                                System.out.println("TERIMAKSIH HAPPY EATING");
                                isNext = false;
                            }  
                        }
                        System.out.print("Apakah anda ingin melakukan Pembayaran / Pemesanan (y/n)? ");
                        userChoice = userInput.nextLine();
                        isNext = userChoice.equalsIgnoreCase("y");                                        
                      }                
                    break;         
                default:
                System.out.println("Mohon Pilih 1 - 3");
                    break;
            }
            System.out.print("Apakah anda ingin melakukan Pembayaran / Pemesanan (y/n)? ");
            userChoice = userInput.nextLine();
            isNext = userChoice.equalsIgnoreCase("y");
            while(!userChoice.equalsIgnoreCase("y") && !userChoice.equalsIgnoreCase("n")) {
                System.out.println("Pilhan anda bukan Y / N , pilihlah Y / N !");
                System.out.print("Apakah anda ingin melanjutkan (y/n)? ");
                userChoice = userInput.nextLine();
                isNext = userChoice.equalsIgnoreCase("y");
            }
        }     
    }
    public static void showMakanan(){
        System.out.println("\n");
        for (int i = 0; i < makananImpl.findAll().size(); i++) {
            System.out.println(Integer.toString(i+1)+ ". " + makananImpl.findById(i));
        }
        System.out.println("\n");
    }
    public static void showMinuman(){
        System.out.println("\n");
        for (int i = 0; i < minumanImpl.findAll().size(); i++) {
            System.out.println(Integer.toString(i+1)+ ". " + minumanImpl.findById(i));
        }
        System.out.println("\n");
    }
    public static void showPaket(){
        System.out.println("\n");
        for (int i = 0; i < paketImpl.findAll().size(); i++) {
            System.out.println(Integer.toString(i+1)+ ". " + paketImpl.findById(i));
        }
        System.out.println("\n");
    }
    public static void showPesanan(){
        if (makananImpl.findAll().size() <= 0 && minumanImpl.findAll().size() <= 0 && paketImpl.findAll().size() <= 0) {
            System.out.println("Pesanan Belum Ada");
          } else {
            System.out.println("Makanan \n");
            showMakanan();
            System.out.println("TOTAL HARGA:\t"+totalHargaMakanan+"\n");
            System.out.println("MINUMAN \n");
            showMinuman();
            System.out.println("TOTAL HARGA:\t"+totalHargaMinuman+"\n");
            System.out.println("PAKET \n");
            showPaket();
            System.out.println("TOTAL HARGA:\t"+totalHargaPaket+"\n");
          }
    }
    public static void showTime(){

        LocalDateTime dateTimeNow = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMMM dd yyyy, HH:mm:ss");
        String dateTimeFormatted = dateTimeNow.format(formatter);
        System.out.println(dateTimeFormatted + "\n");
    }

}
