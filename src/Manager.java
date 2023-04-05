public class Manager extends Person implements Employee{
    private String[] subordinates;

    public Manager(String name, String workplace, int salary, String[] subordinates) {
        super(name, workplace, salary);
        this.subordinates = subordinates;
    }

    public String[] getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(String[] subordinates) {
        this.subordinates = subordinates;
    }
}
