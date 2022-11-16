package restaurantApp.model;



public class Makanan {
    private String makananMenu ;
    private int harga;
    private int totalPesanan;
    private int totalHarga;
    private int allHarga;


    public Makanan() {
      
      
    }
    public Makanan(String makananMenu, int harga, int totalPesanan) {
        this.totalPesanan = totalPesanan;
        this.makananMenu = makananMenu;
        this.harga = harga;
    }

    

 

    public String getMakananMenu() {
        return makananMenu;
    }
    public void setMakananMenu(String makananMenu) {
        this.makananMenu = makananMenu;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getTotalHarga() {
        return totalPesanan * harga  ;
    }
    public int getTotalPesanan() {
        return totalPesanan;
    }
    public void setTotalPesanan(int totalPesanan) {
        this.totalPesanan = totalPesanan;
    }

    @Override
    public String toString() {
        
        return + totalPesanan+"X " + makananMenu + " " + getTotalHarga() + "\n";//+ "\n" + "TOTAL : " + getAllHarga();
    }
   
    



    
    

    
}
