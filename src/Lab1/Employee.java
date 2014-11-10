package Lab1;

import java.util.*;

public class Employee {

    private String lastName;
    private String firstName;
    private String ssn;
    private static int baseEmpId = 1000;
    private int empId;

    public Employee(String lastName, String firstName, String ssn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
        empId = baseEmpId + 1;
        baseEmpId++;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public static int getBaseEmpId() {
        return baseEmpId;
    }

    public static void setBaseEmpId(int baseEmpId) {
        Employee.baseEmpId = baseEmpId;
    }
    
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.ssn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.ssn, other.ssn)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employee{" + "lastName=" + lastName + ", firstName=" + firstName + ", ssn=" + ssn + ", empId=" + empId + '}';
    }

    

}
