package demo.demo.domain;

public class Employee {
    private String name;
    private double salary;
    private String gender;

    // Constructors
    public Employee(String name, double salary, String gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    // Getters and Setters
    public String getName() { 
        return name;
        }
    public double getSalary() { 
        return salary;
        }
    public String getGender() { 
        return gender;
        }

    public void setName(String name) { 
        this.name = name;
        }
    public void setSalary(double salary) { 
        this.salary = salary;
        }
    public void setGender(String gender) { 
        this.gender = gender;
        }

    
}

