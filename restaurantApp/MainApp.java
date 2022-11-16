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
static Scanner userInput = new Scanner(System.in);
static String  makananMenu , minumanMenu, paketMenu;
static int  userTotal, makananInput,minumanInput, paketInput, harga, totalPesanan, totalHargaMakanan, totalHargaMinuman, totalHargaPaket,totalHarga, ppn, totalHargaAkhir;
static MakananImpl makananImpl = new MakananImpl();
static MenuImpl menuImpl = new MenuImpl(); 
static MinumanImpl minumanImpl = new MinumanImpl();
static PaketImpl paketImpl = new PaketImpl();
static Makanan makanan;
static  boolean isNext = true ;
public static void main(String[] args) {
        String userChoice;
        while (isNext) {
            System.out.println("+++++ Restoran Prek +++++ \n");
            System.out.println("1. Lihat Daftar Menu");
            System.out.println("2. input Pemesanan");
            System.out.println("3. Pembayaran");
            System.out.print("\nPilihan Anda : ");
            userChoice = userInput.nextLine();
            
            switch (userChoice) {
                case "1":    
                menuImpl.showMenu();
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
                            makanan = new Makanan(menuImpl.findById(makananInput-1).getNamaMenu(),menuImpl.findById(makananInput-1).getHarga(),userTotal);
                            makananImpl.save(makanan); 
                            totalHargaMakanan = 0;
                            System.out.println("\n+++++++++++MAKANAN++++++++++");
                            makananImpl.showMakanan();
                            for (int i = 0 ; i < makananImpl.findAll().size(); i++) {
                                totalHargaMakanan += makananImpl.findById(i).getTotalHarga();                              
                            }
                            System.out.println("TOTAL HARGA:\t"+totalHargaMakanan+"\n");
                        } else if (userChoice.equalsIgnoreCase("ubah")){
                            System.out.println("Proses ubah");
                            System.out.println("Pesanan Anda :");
                            makananImpl.showMakanan();
                            System.out.println("TOTAL HARGA:\t"+totalHargaMakanan+"\n");
                            if (makananImpl.findAll().size() <= 0 && minumanImpl.findAll().size() <= 0 && paketImpl.findAll().size() <= 0) {
                                System.out.println("Tidak ada pesanan, PESEN DONK");
                            } else {
                                System.out.print("Silahkan Input Nomor Pesanan diatas yang ingin diubah : ");
                                userChoice = userInput.nextLine();
                                System.out.print("Masukan Jumlah Pesanan :");
                                userTotal = userInput.nextInt();
                                totalPesanan = userTotal;
                                makanan = new Makanan( makananMenu, harga,totalPesanan);
                                int id = Integer.parseInt(userChoice)-1;
                                makanan = makananImpl.findById(id);
                                makanan.setTotalPesanan(totalPesanan);
                                makananImpl.update(id, makanan);
                                makananImpl.showMakanan();
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
                                makananImpl.showMakanan();
                                totalHargaMakanan = totalHargaMakanan * 0;
                                for (int i = 0 ; i < makananImpl.findAll().size(); i++) {
                                    totalHargaMakanan += makananImpl.findById(i).getTotalHarga();                              
                                }                             
                                System.out.println("TOTAL HARGA:\t"+totalHargaMakanan+"\n");
                            }  
                        } else if(userChoice.equalsIgnoreCase("lihat Pesanan")){
                            makananImpl.showMakanan();
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
                            minumanImpl.showMinuman();
                            for (int i = 0 ; i < minumanImpl.findAll().size(); i++) {
                                totalHargaMinuman += minumanImpl.findById(i).getTotalHarga();                              
                            }
                            System.out.println("TOTAL HARGA:\t"+totalHargaMinuman+"\n");
                        } else if (userChoice.equalsIgnoreCase("ubah")){
                            System.out.println("Proses ubah");
                            System.out.println("Pesanan Anda :");
                            minumanImpl.showMinuman();
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
                                minumanImpl.showMinuman();
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
                                minumanImpl.showMinuman();
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
                            paketImpl.showPaket();
                            for (int i = 0 ; i < paketImpl.findAll().size(); i++) {
                                totalHargaPaket += paketImpl.findById(i).getTotalHarga();                              
                            }
                            System.out.println("Total harga = " + totalHargaPaket + "\n"); 
                        } else if (userChoice.equalsIgnoreCase("ubah")){
                            System.out.println("Proses ubah");
                            System.out.println("Pesanan Anda :");
                            paketImpl.showPaket();
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
                                paketImpl.showPaket();
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
                                paketImpl.showPaket();
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
                            payment();
                           
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

    
    
    public static void showPesanan(){
        if (makananImpl.findAll().size() <= 0 && minumanImpl.findAll().size() <= 0 && paketImpl.findAll().size() <= 0) {
            System.out.println("Pesanan Belum Ada");
          } else {
            System.out.println("Makanan \n");
            makananImpl.showMakanan();
            System.out.println("TOTAL HARGA:\t"+totalHargaMakanan+"\n");
            System.out.println("MINUMAN \n");
            minumanImpl.showMinuman();
            System.out.println("TOTAL HARGA:\t"+totalHargaMinuman+"\n");
            System.out.println("PAKET \n");
            paketImpl.showPaket();
            System.out.println("TOTAL HARGA:\t"+totalHargaPaket+"\n");
          }
    }
    public static void showTime(){
        
        LocalDateTime dateTimeNow = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMMM dd yyyy, HH:mm:ss");
        String dateTimeFormatted = dateTimeNow.format(formatter);
        System.out.println(dateTimeFormatted + "\n");
    }

    public static void payment(){
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

}
