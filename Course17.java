public class Course17 {
    String kodeCourse;
    String name;
    int credit;
    int numberOfHours;

    public Course17(){
        
    }

  

    public Course17(String kC, String nm, int crdt, int noh) {
        this.kodeCourse = kC;
        this.name = nm;
        this.credit = crdt;
        this.numberOfHours = noh;
    }

    void displayInformation(){
        System.out.println("Code Course = " + kodeCourse);
        System.out.println("Name = " + name);
        System.out.println("Credit = " + credit);
        System.out.println("Number of hours = " + numberOfHours);
    }

    void changeSKS(int newCredit){
        credit = newCredit;
    }

    void addHours(int hours){
        numberOfHours = hours;
    }

    void reduceHours(int hours){
        numberOfHours = hours;
    }
}