package org.example;
import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        HealthPlan healthplan = new HealthPlan(1, "Basic", Plan.BASIC);
        System.out.println("Healthplan object:");
        System.out.println(healthplan.toString());

        Company company = new Company(1, "Example Company", 10000, new String[]{"John", "Jane"});
        System.out.println("\nCompany object:");
        System.out.println(company.toString());

        Employee employee = new Employee(1, "John Doe", "john@example.com", "password123", new String[5]);
        System.out.println("\nEmployee object:");
        System.out.println(employee.toString());

        employee.addHealthplan(2, Plan.PREMIUM.getName());
        System.out.println("\nAfter adding healthplan:");
        System.out.println(employee.toString());

        company.setGiro(15000);
        System.out.println("\nAfter setting giro:");
        System.out.println(company.toString());
    }
}

