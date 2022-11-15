package restaurantApp.model;

public class Minuman {
    private String minumanMenu ;
    private int harga;
    private int totalPesanan;
    private int totalHarga;
    private int allHarga;


    public Minuman() {
      
      
    }
    public Minuman(String minumanMenu, int harga,int totalPesanan) {
        this.totalPesanan = totalPesanan;
        this.minumanMenu = minumanMenu;
        this.harga = harga;


    }
    public String getMinumanMenu() {
        return minumanMenu;
    }
    public void setMinumanMenu(String minumanMenu) {
        this.minumanMenu = minumanMenu;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getTotalHarga() {
        return totalPesanan * harga ;
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
        return totalPesanan+"X " + minumanMenu+ " "  + getTotalHarga()  + "\n";//+ "\n" + "TOTAL : " + getAllHarga();
    }

    

    
}
