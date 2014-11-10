/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.util.*;
/**
 *
 * @author Mitch
 */
public class Lab4 {
    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Smith", "John", "111-11-1111"));
        employees.add(new Employee("Johnson", "Jack", "222-22-2222"));
        employees.add(new Employee("Jones", "Jone", "333-33-3333"));
        employees.add(new Employee("Jones", "Jone", "333-33-3333"));
        
        Set<Employee> removeDups = new HashSet<>(employees);
        employees = new ArrayList<>(removeDups);
        System.out.println("The size of the employees list is: " + employees.size() + "\n");
        
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
