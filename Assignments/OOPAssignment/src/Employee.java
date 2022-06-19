
public class Employee {
    int salary ;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    class PermEmployee {
        //int salary =Employee.this.salary;
        String code = "PE01";
        double hike = .45;


        int newSalary() {
            return Employee.this.getSalary() * 45 / 100 + Employee.this.getSalary();
        }

        void display() {
            System.out.println("PermEmployee Old salary is "+Employee.this.getSalary() +" The new salary is " + this.newSalary() + " The employee code is " + this.code + " The hike is " + this.hike);
        }

    }

    class TempEmployee {


        String code = "TE01";
        double hike = .30;
        int newSalary() {
            return Employee.this.getSalary() * 30 / 100 + Employee.this.getSalary();
        }

        void display() {
            System.out.println("TempEmployee Old salary is "+Employee.this.getSalary()+" The new salary is " + this.newSalary() + " The employee code is " + this.code + " The hike is " + this.hike);
        }

    }

    void role() {
        class ContractEmployee {

            String code = "CE01";
            double hike = .30;


            int newSalary() {
                return Employee.this.getSalary() * 30 / 100 + Employee.this.getSalary();
            }

            void display() {
                System.out.println("ContractEmployee Old salary is "+Employee.this.getSalary() +" The new salary is " + this.newSalary() + " The employee code is " + this.code + " The hike is " + this.hike);
            }

        }
        ContractEmployee contractEmployee = new ContractEmployee();
        contractEmployee.display();
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setSalary(10000);
        Employee.PermEmployee permEmployee = employee.new PermEmployee();
        permEmployee.display();

        Employee.TempEmployee tempEmployee = employee.new TempEmployee();
        tempEmployee.display();

        employee.role();

    }
}
