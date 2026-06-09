class Employee {

    void calculateSalary() {
        System.out.println("Salary calculation method.");
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    void calculateSalary() {
        System.out.println("Full-Time Employee Salary: ₹" + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(int hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    void calculateSalary() {
        double salary = hoursWorked * hourlyRate;
        System.out.println("Part-Time Employee Salary: ₹" + salary);
    }
}

public class Main {
    public static void main(String[] args) {

        Employee fullTime = new FullTimeEmployee(50000);
        Employee partTime = new PartTimeEmployee(80, 250);

        fullTime.calculateSalary();
        partTime.calculateSalary();
    }
}