import java.util.Scanner;

class Name {
    private String name; 
    private String firstName;
    private String lastName;
    private String birthPlace;
    private String birthYear;
    private String progrLangFav;
    
    public String getName() {
        return  this.name;
    }
    public String getFirstName() {
        return  this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getBirthPlace(){
        return this.birthPlace;
    }
    public String getBirthYear(){
        return this.birthYear;
    }
    public String getProgrLangFav(){
        return this.progrLangFav;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setBirthPlace(String birthPlace){
        this.birthPlace = birthPlace;
    }
    public void setBirthYear(String birthYear){
        this.birthYear = birthYear;
    }
    public void setProgrLangFav(String progrLangFav){
        this.progrLangFav = progrLangFav;
    }
    }
    
    public class App {
        public static void main(String[] args) throws Exception {   
        Name namePeople = new Name();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan username : ");
        String inputUser = input.nextLine();
        System.out.print("Masukan First Name : ");
        String inputFirstName = input.nextLine();
        System.out.print("Masukan Last Name : ");
        String inputLastName = input.nextLine();
        System.out.print("Masukan Birth Place : ");
        String inputBirthPlace = input.nextLine();
        System.out.print("Masukan Birth Year : ");
        String inputBirthYear= input.nextLine();
        System.out.print("Masukan Programming languange Favorit : "); 
        String inputProgLangFav= input.nextLine();
        input.close();
        namePeople.setName(inputUser);
        namePeople.setFirstName(inputFirstName);
        namePeople.setLastName(inputLastName);
        namePeople.setBirthPlace(inputBirthPlace);
        namePeople.setBirthYear(inputBirthYear);
        namePeople.setProgrLangFav(inputProgLangFav);
        System.out.println("\n");
        System.out.println("result");
        System.out.println("Username: " + namePeople.getName());
        System.out.println("First Name: " + namePeople.getFirstName());
        System.out.println("Last Name: " + namePeople.getLastName());
        System.out.println("Birth Place: " + namePeople.getBirthPlace());
        System.out.println("Birth Year: " + namePeople.getBirthYear());
        System.out.println("Programer Language Favorit: " + namePeople.getProgrLangFav());                      
        }
    }