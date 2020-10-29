package com.company.testTraining.first;

public class HourPay extends Base{

    public HourPay(int id, String name, int salary){
        super(id, name, salary);

        super.salary = (int) (20.8*8*super.salary);
    }

    @Override
    public int getMonth_payment() {
        return super.salary;
    }

    @Override
    public void typeMonth_payment() {
        System.out.println(super.salary);
    }
}
