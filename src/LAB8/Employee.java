package LAB8;

public class Employee extends Person{
    //Class Attributes
    private String empID; //รหัสพนักงาน
    private String position;
    private double salaly;
    //constructors


    public Employee(String empID) {
        this.empID = empID;
    }

    public Employee() {
    }


    public Employee(String pid, String name, int age, String gender, String tel, String empID, String position, double salaly) {
        super(pid, name, age, gender, tel);
        this.empID = empID;
        this.position = position;
        this.salaly = salaly;
    }
    //getter

    public String getEmpID() {
        return empID;
    }

    public String getPosition() {
        return position;
    }

    public double getSalaly() {
        return salaly;
    }
   //and setter

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalaly(double salaly) {
        this.salaly = salaly;
    }


    //toString()


    @Override
    public String toString() {
        return "Employee{" +
                "empID='" + empID + '\'' +
                ", position='" + position + '\'' +
                ", salaly=" + salaly +
                "} " + super.toString();
    }
}

