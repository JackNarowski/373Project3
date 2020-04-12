public class Main{
    public static void main(String[] args){
        //Set up
        Person student1 = new Student("John", new Register(), 48494);
        Person graduate1 = new GraduateStudent("Clara", new Register(), "Dr. Smith");

        student1.process();

        graduate1.process();

    }
}