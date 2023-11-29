

public class StudentOfQA {
    public static void main(String[] args) {
        Students student = new Students(1, "David", "Joy");
        student.print();

    }
}


class Students {

    int id;
    String FirstName;
    String LastName;

    public Students(int id, String FirstName, String LastName) {
        this.id = id;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public void print() {
        System.out.println(id +" " + FirstName +" " + LastName);
    }
}