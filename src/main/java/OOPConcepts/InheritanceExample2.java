package OOPConcepts;
/*
n Java, getters and setters are methods used to access and modify the
private fields (also known as instance variables) of a class.
They are often used to implement encapsulation, which is one of the four fundamental
Object-Oriented Programming (OOP) principles. Getters are used to retrieve the values
of private fields, and setters are used to modify the values of private fields while
providing control and validation.
Getter Method:
A getter method is used to retrieve the value of a private field.
It typically follows the naming convention getFieldName() where FieldName is the name of the private field.
It returns the value of the private field.
Setter Method:
A setter method is used to set the value of a private field.
It typically follows the naming convention setFieldName(newValue) where FieldName is the name of the private field and newValue is the value to be assigned.
It does not return a value (usually declared as void), but it modifies the private field.
Using getters and setters allows you to control access to the private fields and enforce encapsulation.
You can add additional logic within the setter method to perform validation or calculations when setting
the field's value.
 */
public class InheritanceExample2 {
    public static void main(String[] args) {

        Veg veg = new Veg("1","2lb","cucumber");
        System.out.println(veg.size+" "+ veg.weight+" "+veg.name);
        veg.fresh();
        veg.pay();
    }
}

class Basket{
    public String size;
    public String weight;

    public Basket(String size,String weight){
        this.size = size;
        this.weight = weight;
    }
    public void pay(){
        System.out.println("pay for it");
    }
}

class Veg extends Basket{
    public String name;

    public Veg(String size,String weight,String name){
        super(size,weight);
        this.name= name;
    }
    public void fresh(){
        System.out.println("this veggie is fresh");
    }
}

