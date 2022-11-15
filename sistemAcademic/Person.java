package sistemAcademic;

public class Person {

    private String domisili;

    public Person() {
        
    }


    public Person(String domisili) {
        this.domisili = domisili;
    }

    public String getDomisili() {
        return domisili;
    }

    public void setDomisili(String domisili) {
        this.domisili = domisili;
    }
    
    public void domisili(){
        System.out.println("Domisili : " + getDomisili());
    }
    
    
}
