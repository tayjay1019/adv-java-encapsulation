package edu.wctc.lab4;

public class Corperation {
    private HrEmployee hr;

    public Corperation(){
        hr = new HrEmployee();
    }

    public void newHire(String firstName, String lastName, String ssn){
        hr.newHire(firstName, lastName, ssn);
        hr.outputReport(ssn);
    }


}
