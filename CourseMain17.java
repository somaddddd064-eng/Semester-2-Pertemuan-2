public class CourseMain17 {

    public static void main(String[] args){
        Course17 course1 = new Course17();
        course1.kodeCourse = "1";
        course1.name = "Data Base";
        course1.credit = 1;
        course1.numberOfHours = 4;

        course1.displayInformation();
        course1.changeSKS(3);
        course1.addHours(6);
        course1.reduceHours(5);
        course1.displayInformation();

        Course17 course2 = new Course17("2","Practikum", 3, 7);
        course2.changeSKS(5);
        course2.addHours(4);
        course2.reduceHours(2);
        course2.displayInformation();
    }   
}