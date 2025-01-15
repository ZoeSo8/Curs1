import java.util.Objects;

public class Employee {
    private static int idGenerator = 1;
    private int id;
    private String name;
    private int department;
    private int salary;

    public Employee(String name, int department, int salary) {
        id = idGenerator++;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID " + id+" " + this.name + ", Отдел " + this.department + ", Зарплата " + this.salary;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, department,salary);
    }
    @Override
    public boolean equals(Object other) {
        if (this==other){
            return true;
        }
        if (other== null || getClass() != other.getClass()) {
            return false;
        }
        Employee c2 = (Employee) other;
        return Objects.equals(name, c2.name)&& Objects.equals(department,c2.department)&& Objects.equals(salary, c2.salary);
    }

    }


