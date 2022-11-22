package waterbottle;    //@author Justin Little
public class WaterBottle {
    public static void main(String[] args) {
    WaterBottleDrink bottleOne = new WaterBottleDrink();
        bottleOne.check();
        bottleOne.drink();
        bottleOne.check();

    WaterBottleDrink bottleTwo = new WaterBottleDrink();
        bottleTwo.drink();
        bottleTwo.drink();
        bottleTwo.check();
    }
    
    
}
