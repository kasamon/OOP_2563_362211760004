package LAB8;

public class PersonApp {

    public static void main(String[] args) {
        //Objects

        Person p1 =new Person();
        p1.setName("Kasamon Okong");
        p1.setAge(40);

        Person p2 =new Teacher("RMUTS");
        p2.setName("Puriwat Lertkrai");
        p2.setAge(34);

        Person p3 =new Doctor("Thungsong");
        p3.setName("Nattapong Keawboonam");
        p3.setAge(40);
        //
        p1.introduce();
        p2.introduce();
        p3.introduce();
    }

}
