public class Program {

    public static void main(String[] args){
        String[] subordinatesOfManager = new String[]{
                
        };
        

        Person[] staff = new Person[]{
                new Manager("Василий", "Маркетинг", 150000, subordinatesOfManager),
                new Developer("Георгий", "IT - решений", 100000, "Fortran"),
                new Designer("Семён", "Дизайн", 70000, "Дизайн " +
                        "одностраничных сайтов")
        };

        for (Person person: staff
             ) {
            System.out.printf("%s работает в отделе %s. Его зарплата - %d рублей. \n", person.getFullName(),
                    person.getDepartment(), person.getSalary());
        }
    }
}
