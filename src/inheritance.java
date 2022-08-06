public class inheritance {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Robin Hood");
        client.setAge(32);
        client.setPhoneNumber("777777777");
        client.setCredit(100);

        Employee employee = new Employee();
        employee.setName("Little John");
        employee.setAge(30);
        employee.setPhoneNumber("888888888");
        employee.setSalary(1300);

        System.out.println("Client Name: " + client.getName());
        System.out.println("Client Age: " + client.getAge());
        System.out.println("Client Phone number: " + client.getPhoneNumber());
        System.out.println("Client Credit: " + client.getCredit());

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Age: " + employee.getAge());
        System.out.println("Employee Phone Number: " + employee.getPhoneNumber());
        System.out.println("Employee Salary: " + employee.getSalary());

    }
}

class Person {
    String name;
    int age;
    String phoneNumber;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

}
class Client extends Person {
    private float credit;

    public void setCredit(float credit){
        this.credit = credit;
    }
    public float getCredit(){
        return credit;
    }
}
class Employee extends Person {
    private float salary;

    public void setSalary(float salary){
        this.salary = salary;
    }
    public float getSalary(){
        return salary;
    }
}