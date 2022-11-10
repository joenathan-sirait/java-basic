package sistemAkademik;

import sistemAkademik.serve.RegisServe;

public class Student extends Person implements  RegisServe  {

    private String fullName;
    private int cardIdentitas;
    private String courseName;
    private String room;
    private int sks;

    public Student(String domisili) {
        super(domisili);
    }

    public Student(){

    }
    
    public Student(String fullName, int cardIdentitas) {
        this.fullName = fullName;
        this.cardIdentitas = cardIdentitas;
        
    }

    public Student(String courseName, String room, int sks){
        this.courseName = courseName;
        this.room = room;
        this.sks = sks;
    }

    

    public String getCourseName() {
        return courseName;
    }



    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }



    public String getRoom() {
        return room;
    }



    public void setRoom(String room) {
        this.room = room;
    }



    public int getSks() {
        return sks;
    }



    public void setSks(int sks) {
        this.sks = sks;
    }



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCardIdentitas() {
        return cardIdentitas;
    }

    public void setCardIdentitas(int cardIdentitas) {
        this.cardIdentitas = cardIdentitas;
    }

    public int getTotalSks(){
        return this.sks =+ this.sks;
    }

    @Override
    public void regisStudent(String fullName, int cardIdentitas) {
        // TODO Auto-generated method stub
            System.out.println("++++Data Siswa++++");
            if (this.sks > 144) {
                System.out.println("Nama : " + getFullName() + "\tSPD");
            } else {
                System.out.println("Nama : " + getFullName());
            }
            System.out.println("Card Identitas : " + getCardIdentitas());
    }

    @Override
    public void learningPlan(String courseName,  String room,int sks) {
        // TODO Auto-generated method stub
        System.out.println("++++Learning Plan+++++");
        System.out.println("Course Name" + getCourseName());
        System.out.println("Room : " + getRoom());
        System.out.println("sks : " + getSks());   
    }

    public String result(){
        return "Nama Lengkap : "+getFullName()  + " " + "Total SKS" + getTotalSks()
                +"Card Identitas : "+ getCardIdentitas() + "\n"  ;
    }

    public String resultLearningPlan(){
        return "Course Name : " +getCourseName() + " Room : " + getRoom() + " SKS : " + getSks() ;
    }

    public String toString() {
        // TODO Auto-generated method stub
       
        return "Student "+result() + "\n" + "Learning plan "+ resultLearningPlan()  ;
       
    
        // "{username:" + user01 + ", password:" + user01 + "}"
      }

}
