package DOOVersatile;

public class Fruits {
    public  String color;
    public String  nutrient;
    public int calories;
    public int seeds;

    public Fruits(String color, String nutrient, int calories,int seeds){

        this.color = color;
        this.nutrient = nutrient;
        this.calories = calories;
        this.seeds = seeds;
    }
    public void plant(){
        System.out.println("Planting fruits");
    }
    public void eat(){
        System.out.println("Eating fruits");
    }
    public String getColor(){
        return color;
    }
    public String getNutrient(){
        return nutrient;
    }
    public int  getCalories(){
        return calories;
    }
    public int seeds(){
        return seeds;
    }
}
