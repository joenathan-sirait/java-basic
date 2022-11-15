package restaurantApp.model;

public class Paket {
    private String paketMenu ;
    private int harga;
    private int totalPesanan;
    private int totalHarga;
    private int allHarga;


    public Paket() {
      
      
    }
    public Paket(String paketMenu, int harga,int totalPesanan) {
        this.totalPesanan = totalPesanan;
        this.paketMenu = paketMenu;
        this.harga = harga;


    }
    public String getPaketMenu() {
        return paketMenu;
    }
    public void setPaketMenu(String paketMenu) {
        this.paketMenu = paketMenu;
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
    public int getAllHarga() {
        return this.allHarga = this.totalHarga + getTotalHarga();
    }

    @Override
    public String toString() {
        return totalPesanan+"X " + paketMenu+ " " + getTotalHarga()  + "\n";//+ "\n" + "TOTAL : " + getAllHarga();
    }

    

    
}
