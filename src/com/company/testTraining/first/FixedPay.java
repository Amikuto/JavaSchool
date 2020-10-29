package com.company.testTraining.first;

public class FixedPay extends Base {

    public FixedPay(int id, String name, int salary) {
        super(id, name, salary);
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
