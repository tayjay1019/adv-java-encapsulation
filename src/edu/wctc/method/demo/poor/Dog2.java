package edu.wctc.method.demo.poor;

public class Dog2 {

    private int age;

    public Dog2(int age) {
        setAge(age);
    }

    public void chaseMailCarrier() {
    startRunning();
    navigateToMailCarrier();
    closeGatToMailCarrier();
    }

    private void closeGatToMailCarrier() {
        System.out.println("Closing gap");
    }

    private void startRunning() {
        System.out.println("Starting to run");
    }

    private void navigateToMailCarrier() {
        System.out.println("Navigating");
    }

    public void setAge(int age) {
        validateAge(age);
        this.age = age;
    }

    private void validateAge(int age)
    {
        if (age < 0){
            throw new IllegalArgumentException("age can't be negative");
        }
    }

}
