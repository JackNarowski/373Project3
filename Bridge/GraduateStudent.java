public class GraduateStudent extends Person {
    protected String advisor;

    protected GraduateStudent(String name, Implementor impl, String advisor) {
        super(name, impl);
        this.advisor=advisor;
    }
    public void process(){
        System.out.println("Graduate:");
        impl.process();
    }
}
