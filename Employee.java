class Employee {
    private String name;
    private double basicSalary;

    // Constructor
    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Method to get the salary
    public double getSalary() {
        return basicSalary;
    }
}

class Manager extends Employee {
    private double travelAllowance;
    private double houseRentAllowance;

    // Constructor
    public Manager(String name, double basicSalary, double travelAllowance, double houseRentAllowance) {
        super(name, basicSalary);
        this.travelAllowance = travelAllowance;
        this.houseRentAllowance = houseRentAllowance;
    }

    // Getters and Setters for Manager-specific allowances

    public double getTravelAllowance() {
        return travelAllowance;
    }

    public void setTravelAllowance(double travelAllowance) {
        this.travelAllowance = travelAllowance;
    }

    public double getHouseRentAllowance() {
        return houseRentAllowance;
    }

    public void setHouseRentAllowance(double houseRentAllowance) {
        this.houseRentAllowance = houseRentAllowance;
    }

    // Override the getSalary() method to include additional allowances
    @Override
    public double getSalary() {
        // Manager's salary includes basic salary, travel allowance, and house rent allowance
        return super.getBasicSalary() + travelAllowance + houseRentAllowance;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        // Creating an instance of Manager
        Manager manager = new Manager("John Doe", 50000, 10000, 12000);

        // Getting and printing the salary of the manager
        System.out.println("Salary of " + manager.getName() + ": " + manager.getSalary());
    }
}
