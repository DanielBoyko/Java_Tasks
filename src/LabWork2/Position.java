package LabWork2;

/* 33. Створіть enum Посади, яке відповідає можливій структурі посад підприємства.
Продемонструйте  можливість задавати властивості, конструктори та методи в enum.
Забезпечте при цьому можливості змінювати посадові оклади та кількість днів відпустки.*/

public enum Position {
    DIRECTOR(2000,20), ENGINEER(1500,10), CONSTRUCTOR(1000);
    private double salary;
    private int numberOfVacationDays;

    Position(double salary, int numberOfVacationDays) {
        this.salary = salary;
        this.numberOfVacationDays = numberOfVacationDays;
    }

    Position(double salary) {
        this(salary, 0);
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setNumberOfVacationDays(int numberOfVacationDays){
        this.numberOfVacationDays = numberOfVacationDays;
    }

    @Override
    public String toString() {
        return "Position{" +
                "salary=" + salary +
                ", numberOfVacationDays=" + numberOfVacationDays +
                "} ";
    }
}