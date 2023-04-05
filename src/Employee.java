public interface Employee {

    void getFullName();//возвращает полное имя работника

    void getDepartment();//возвращает название департамента, в котором работает

    int getSalary();//возвращает размер заработной платы сотрудника

    String getFullName(String employeeName);

    String getDepartment(String workplace);

    int getSalary(int salary);
}
