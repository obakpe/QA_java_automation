package OOPConcepts;

public class Poly2 {
    public static void main(String[] args){

        Sport mySport = new Football();
        mySport.scoreGoals();
        System.out.println("----creating sport class instance with football object scoreGoals");

        Sport sport = new Sport();
        mySport.scoreGoals();
        System.out.println("-----creating instance of Sport class for the fun of the game.");



    }
}

class Sport{
    void scoreGoals(){
        System.out.println("The fun of the game :");
    }
}
class Football extends Sport{
    @Override
    void scoreGoals(){
        System.out.println("Gooaalll");
    }

}
