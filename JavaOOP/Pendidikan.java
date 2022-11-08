package JavaOOP;


// class Person
public class Pendidikan {
  // atribut class Person

  private String lastEducation;
  


  // constructor kosong
  public Pendidikan() {

  }

  // constructor berparameter
  public Pendidikan(String lastEducation) {
    this.lastEducation = lastEducation;

    // firstName, lastName, domisili, lastEducation. Menampilkan nama lengkap, domisili dan usia
  }

  // method class Person
  public void setLastEducation(String lastEducation) {
    this.lastEducation = lastEducation;
  }
 
  public String getLastEducation() {
    return this.lastEducation;
  }


  public void getLastPendidkan() {
    System.out.println("===== PENDIDIKAN TERAKHIR =====");
    System.out.println("Pendidikan Terakhir: " + getLastEducation());
    
  }
}