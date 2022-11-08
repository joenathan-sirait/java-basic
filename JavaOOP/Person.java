package JavaOOP;


// class Person
public class Person {
  // atribut class Person

  private String firstName;
  private String lastName;
  private String domisili;
  private String tahunLahir;
  private int usia;


  // constructor kosong
  public Person() {

  }

  // constructor berparameter
  public Person(String firstName, String lastName, String domisili, String tahunLahir, int usia) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.domisili = domisili;
    this.tahunLahir = tahunLahir;
    this.usia = usia;
    // firstName, lastName, domisili, tahunLahir. Menampilkan nama lengkap, domisili dan usia
  }

  // method class Person
  public void setFirstName(String namaDepan) {
    this.firstName = namaDepan;
  }

  public void setLastName(String namaBelakang) {
    this.lastName = namaBelakang;
  }
  public void setDomisili(String domisili) {
    this.domisili = domisili;
  }
  public void setTahunLahir(String tahunLahir) {
    this.tahunLahir = tahunLahir;
  }


  public String getTahunLahir() {
    return this.tahunLahir;
  }

  public int getUsia() {
    return this.usia = 2022 - Integer.parseInt(this.tahunLahir);
  }

  public String getDomisili() {
    return this.domisili;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getFullName() {
    return this.firstName + " " + this.lastName;
  }

  public void getPerson() {
    System.out.println("===== BIODATA DIRI =====");
    System.out.println("Nama Lengkap: " + getFullName());
    System.out.println("Domisili: " + getDomisili());
    System.out.println("Usia: " + getUsia());
    
  }
}