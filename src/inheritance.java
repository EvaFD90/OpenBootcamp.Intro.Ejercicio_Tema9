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

        System.out.println(client.getName());
        System.out.println(client.getAge());
        System.out.println(client.getPhoneNumber());
        System.out.println(client.getCredit());

        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(employee.getPhoneNumber());
        System.out.println(employee.getSalary());

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