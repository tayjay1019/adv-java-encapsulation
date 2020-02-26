package edu.wctc.property.lab1;

import java.time.LocalDate;

/**
 * Fix the code in this class to do PROPERTY encapsulation correctly. Also
 * consider if any of the properties should be mandatory and use a constructor
 * to enforce that. Review the tips in the document "EncapCheckList.pdf" if
 * needed.
 *
 * @author Jim Lombardo
 * @version 1.02
 */
public class Employee {

    private String firstName;
    private String lastName;
    private String ssn;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private LocalDate orientationDate;

    public static final int SSN_LENGTH = 9;

    public Employee(String firstName, String lastName, String ssn)
    {
        if(ssn.length() != SSN_LENGTH)
        {
            throw new IllegalArgumentException("Invalid ssn length");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    public void meetHR() {
        this.metWithHr = true;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public void meetDeptStaff() {
        this.metDeptStaff = true;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public void reviewedDeptPolicies() {
        this.reviewedDeptPolicies = true;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public void moveIn() {
        this.movedIn = true;
    }

    public String getCubeId() {
        return cubeId;
    }

    public void setCubeId(String cubeId) {
        this.cubeId = cubeId;
    }

    public LocalDate getOrientationDate() {
        return orientationDate;
    }

    public void setOrientationDate(LocalDate orientationDate) {
        this.orientationDate = orientationDate;
    }
}
