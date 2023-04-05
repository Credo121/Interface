public class Developer extends Person implements Employee{
    private String programmingLanguage;

    public Developer(String name, String workplace, int salary, String programmingLanguage){
        super(name, workplace, salary);
        this.programmingLanguage = programmingLanguage;
    }
}
