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
public class Lab2 {
    public static void main(String[] args) {
        
        List employees = new ArrayList<>();
        employees.add(new Employee("Smith", "John", "111-11-1111"));
        employees.add(new Employee("Johnson", "Jack", "222-22-2222"));
        employees.add(new Employee("Jones", "Jone", "333-33-3333"));
        employees.add(new Employee("Jones", "Jone", "333-33-3333"));
        
        System.out.println("The size of the employees list is: " + employees.size() + "\n");
        
        Employee employee2 = (Employee)employees.get(1);
        System.out.println("Employee2: " + employee2 + "\n");
        
        for (int i = 0; i < employees.size(); i++){
            System.out.println(employees.get(i));
        }System.out.println("");
        
        employees.clear();
        employees.add(new Employee("Doe", "John", "666-66-6666"));
        for (int i = 0; i < employees.size(); i++){
            System.out.println("Clear all, add John " + employees.get(i));
        }System.out.println("");
        
        employees.set(0, employee2);
        for (int i = 0; i < employees.size(); i++){
            System.out.println("set first emp to emp2 " + employees.get(i));
        }System.out.println("");
        
        employees.remove(employee2);
        for (int i = 0; i < employees.size(); i++){
            System.out.println("remove emp2 " + employees.get(i));
        }
    }
}
