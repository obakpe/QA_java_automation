package DOOVersatile;

public class Oranges extends Fruits{
public  String drink;
        public Oranges (String color, String nutrient, int calories, int seeds, String drink){
         super(color,nutrient,calories,seeds);
    this.drink = drink;
}
public void drink(){
            System.out.println("i enjoy drinking oranges");
}

public String getDrink(){
    return drink;

}

}
