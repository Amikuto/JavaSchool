package com.company.testTraining.first;

public abstract class Base implements Comparable<Base>{
    protected int salary;
    protected String name;
    protected int id;

    public Base( int id, String name, int salary) {
        this.salary = salary;
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Base{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Base o){
        int result = Integer.compare(salary, o.salary);

        if (result == -1){
            result = 1;
        } else if (result == 1){
            result = -1;
        }

        if (result == 0){
            result = name.compareTo(o.name);
            System.out.println(id);
        }
        return result;
    }

    public abstract int  getMonth_payment();
    public abstract void typeMonth_payment();
}
