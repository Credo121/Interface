public class Designer extends Person implements Employee{
    private String designSpecialization;

    public Designer(String name, String workplace, int salary, String designSpecialization){
        super(name, workplace, salary);
        this.designSpecialization = designSpecialization;
    }
}
