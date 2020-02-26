package edu.wctc.lab4;

import java.util.ArrayList;
import java.util.List;

public class HrEmployee {

    private List<Employee> employeeList;

    public HrEmployee() {
        employeeList = new ArrayList<>();
    }

    public void newHire(String firstName, String lastName, String ssn) {
        Employee e = new Employee(firstName, lastName, ssn);
        employeeList.add(e);
    }

    private void meetAndGreet(Employee emp) {
        emp.doFirstTimeOrientation("117");
    }

    public void outputReport(String ssn) {
        for (Employee emp : employeeList){
            if(emp.getSsn().equals(ssn)) {
                if (emp.hasMetWithHr() && emp.hasMetDeptStaff() && emp.hasReviewedDeptPolicies() && emp.hasMovedIn()) {
                    emp.printReport();
                }
                break;
            }
        }
    }

}
