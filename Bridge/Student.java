class Student extends Person {
    protected int studentId;

    protected Student(String name, Implementor impl, int studentId) {
        super(name, impl);
        this.studentId=studentId;
    }

    public void process(){
        System.out.println("Student:");
        impl.register();
    }
}