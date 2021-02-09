package LAB7;

public class EmployeeApp {


    public static void main(String[] args) {

        //use default constructor
        Employee emp1 = new Employee();
        //assing constructor
        Employee emp2 = new Employee( "Kasamon",22,"Student",3000);


        //call displayData()
       emp1.displayData();
       emp2.displayData();

       //assing data to emp1
        emp1.setName("Koy");
        emp1.setage(22);
        emp1.setposition("Student");
        emp1.setsalary(5000);

        emp1.displayData();
        System.out.println("Emp name:"+emp1.getName());
    }//main


}//class
