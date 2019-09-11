class Course{
// class CourseName{


    String courseName;
    Course(){
        Course courseName = new Course();// runtime exception
        //The constructor of the class Course creates
        // an object of the class Course, which will
        // call the constructor again.

         courseName.courseName= "Programing";

     }
// }


    public static void main(String[] args) {
        
        Course courseName = new Course();
        courseName.courseName = "Language";
        System.out.println(courseName.courseName);

    }
}