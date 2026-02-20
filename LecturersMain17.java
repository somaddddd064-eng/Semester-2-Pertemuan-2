public class LecturersMain17 {

    public static void main(String[] args) {

        Lecturers17 dosen1 = new Lecturers17();
        dosen1.idDosen = "12345678";
        dosen1.name = "Ahmad Irianto";
        dosen1.active = false;
        dosen1.yearOfEntry = 2015;
        dosen1.expertiseCompetensy = "Futsal";

        dosen1.showInformation();
        dosen1.setActiveStatus(true);
        dosen1.calculateYearNow(2018);
        dosen1.changeSkill("Basket");
        dosen1.showInformation();

        Lecturers17 dosen2 = new Lecturers17("87654321", "Muhajir Sholeh", false, 2007, "Sport");
        dosen2.calculateYearNow(2026);
        dosen2.changeSkill("Civil engeenering");
        dosen2.showInformation();

        
        
    }
}