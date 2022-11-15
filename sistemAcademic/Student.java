package sistemAcademic;

import sistemAcademic.serve.RegisServe;

public class Student extends Person implements  RegisServe  {

    private String fullName;
    private int cardIdentitas;
    private String courseName;
    private String room;
    private int sks;
    private int totalSks;

    public Student(String domisili) {
        super(domisili);
    }

   
    
    public Student(String domisili, String fullName, int cardIdentitas, String courseName, String room, int sks, int totalSks) {
        super(domisili);
        this.fullName = fullName;
        this.cardIdentitas = cardIdentitas;
        this.courseName = courseName;
        this.room = room;
        this.sks = sks;
        this.totalSks = totalSks;
        
        
    }

    // public Student(String courseName, String room, int sks){
    //     this.courseName = courseName;
    //     this.room = room;
    //     this.sks = sks;
    // }

    

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
        return this.totalSks = this.sks + getSks();
    }

    @Override
    public void regisStudents(String fullName, int cardIdentitas, String courseName, String room, int sks, int totalSks) {
        // TODO Auto-generated method stub
            System.out.println("++++Data Siswa++++");
            System.out.println("Nama : " + getFullName());
            System.out.println("Card Identitas : " + getCardIdentitas());
            System.out.println("++++Learning Plan+++++");
            System.out.println("Course Name : " + getCourseName());
            System.out.println("Room : " + getRoom());
            System.out.println("sks : " + getSks());  
    }

    // @Override
    // public void learningPlan(String courseName,  String room,int sks) {
    //     // TODO Auto-generated method stub
    //     System.out.println("++++Learning Plan+++++");
    //     System.out.println("Course Name" + getCourseName());
    //     System.out.println("Room : " + getRoom());
    //     System.out.println("sks : " + getSks());   
    // }

    public String result(){
        if (getTotalSks() > 144) {
        return "Nama Lengkap : "+getFullName()+" SPD"+ " Domisili : " + super.getDomisili()  + "Total SKS : " + getTotalSks() ;
            
        } else {
        return "Nama Lengkap : "+getFullName() + " Domisili : " + super.getDomisili()  + "Total SKS : " + getTotalSks()
                +"Card Identitas : "+ getCardIdentitas() + "\n"  ;
        }
    }

    

    @Override
    public void domisili() {
        // TODO Auto-generated method stub
        super.domisili();
    }



    public String resultLearningPlan(){
        return "Course Name : " +getCourseName() + " Room : " + getRoom() + " SKS : " + getSks() ;
    }

    public String toString() {
        // TODO Auto-generated method stub
       
        return "Student "+result()  + "Learning plan "+ resultLearningPlan()  ;
       
    
        // "{username:" + user01 + ", password:" + user01 + "}"
      }

}
