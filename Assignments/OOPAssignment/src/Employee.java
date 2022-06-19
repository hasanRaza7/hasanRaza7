
public class Employee {
    int salary = 1000;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    class PermEmployee {
        int salary =Employee.this.salary;
        String code = "PE01";
        double hike = .45;


        double newSalary() {
            return this.salary * 45 / 100 + this.salary;
        }

        void display() {
            System.out.println("The Old salary is "+this.salary +" The new salary is " + this.newSalary() + " The employee code is " + this.code + " The hike is " + this.hike);
        }

    }

    class TempEmployee {

        int salary =Employee.this.salary;
        String code = "TE01";
        double hike = .30;

        public int getSalary() {
            return salary;
        }

        public void setSalary() {
            this.salary = Employee.this.salary;
        }

        double newSalary() {
            return this.salary * 30 / 100 + this.salary;
        }

        void display() {
            System.out.println("The Old salary is "+this.salary +"The new salary is " + this.newSalary() + " The employee code is " + this.code + " The hike is " + this.hike);
        }

    }

    void role() {
        class ContractEmployee {
            int salary =Employee.this.salary;;
            String code = "CE01";
            double hike = .30;

            public int getSalary() {
                return salary;
            }

            public void setSalary() {
                this.salary = Employee.this.salary;
            }

            double newSalary() {
                return this.salary * 30 / 100 + this.salary;
            }

            void display() {
                System.out.println("The Old salary is "+this.salary +"The new salary is " + this.newSalary() + " The employee code is " + this.code + " The hike is " + this.hike);
            }

        }
        ContractEmployee contractEmployee = new ContractEmployee();
        contractEmployee.display();
    }

    public static void main(String[] args) {
        Employee employee = new Employee();

        Employee.PermEmployee permEmployee = employee.new PermEmployee();
        permEmployee.display();

        Employee.TempEmployee tempEmployee = employee.new TempEmployee();
        tempEmployee.display();

        employee.role();

    }
}
