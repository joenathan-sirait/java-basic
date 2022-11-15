package sistemAkademik.serve;

public interface RegisServe {
    public void regisStudent(String fullName, int cardIdentitas, String domisili);
    public void learningPlan(String courseName,  String room, int sks);
}
