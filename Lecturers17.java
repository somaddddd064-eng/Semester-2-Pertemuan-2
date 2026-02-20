public class Lecturers17{
    String idDosen;
    String name;
    boolean active;
    int yearOfEntry;
    String expertiseCompetensy;

    public Lecturers17(){

    }

    public Lecturers17(String id, String nm, boolean active, int year, String excom){
        this.idDosen = id;
        this.name = nm;
        this.active = active;
        this.yearOfEntry = year;
        this.expertiseCompetensy = excom;
    }

    void showInformation(){
        System.out.println("ID Dosen = " + idDosen);
        System.out.println("Name = " + name);
        System.out.println("Active Status = " + active);
        System.out.println("Year of Entry = " + yearOfEntry);
        System.out.println("Competensy = " + expertiseCompetensy);
        System.out.println("-------------------------------");
    }

    void setActiveStatus(boolean status){
        active = status;
        System.out.println("Active update");
    }
        
    

    int calculateYearNow(int yearNow){
        return yearNow - yearOfEntry;
    }

    void changeSkill(String skill){
        expertiseCompetensy = skill;
    }


}