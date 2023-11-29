package OOPConcepts;

public class AggregationExample2 {
    public static void main(String[] args) {
        Address address1 = new Address("McLean","Virginia","USA");
        Address address2 = new Address("Hilton head Beach", "South Carolina", "USA");
        Human human = new Human("(123)456-7890","Salary",address1);
        Human human2 = new Human("111-222-3344","Gbenga",address2);
        human.print();
        human2.print();
    }
}
class Address{
    String city,state,country;

    public Address(String city,String state,String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Human{
    String name;
    String number;
    Address address;

    public Human (String number,String name,Address address){
        this.name = name;
        this.number = number;
        this.address = address;
    }

    void print(){
        System.out.println(name + " " + number);
        System.out.println(address.city+ " "+ address.state+" "+address.country);
    }
}

