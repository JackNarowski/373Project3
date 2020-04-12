abstract class Person {
    protected String name;
    protected Implementor impl;

    protected Person (String name, Implementor impl)
    {
        this.name = name;
        this.impl = impl;
    }

    abstract public void process();

}