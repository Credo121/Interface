public class Designer implements Employee{
    private String employeeName;
    private String workplace;
    private int salary;
    private String designSpecialization;

    @Override
    public String getFullName(String employeeName){//возвращает полное имя работника
        return this.employeeName = employeeName;
    }

    @Override
    public String getDepartment(String workplace) {//возвращает название департамента, в котором работает
        return this.workplace = workplace;
    }

    @Override
    public int getSalary(int salary) {//возвращает размер заработной платы сотрудника
        return this.salary = salary;
    }
}
