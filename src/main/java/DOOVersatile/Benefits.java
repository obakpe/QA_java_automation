package DOOVersatile;

public class Benefits {
    public static void main(String[] args){
    Fruits f1 = new Fruits("yellow", "vitaminC", 45, 10);
    System.out.println(f1.color+" " +f1.nutrient+" " +f1.calories+" " +f1.seeds);
    Oranges o1= new Oranges("yellow","vitaminsC", 45, 10, "juice" );
    System.out.println(o1.color+" " +o1.nutrient+" " +o1.calories+" " +o1.seeds+" "+o1.drink);
    f1.plant();
    f1.eat();
    o1.drink();
}
}
