package waterbottle;    //@author Justin Little
class WaterBottleDrink {
  public int waterLevel;  
  public WaterBottleDrink() {
  waterLevel = 100;
}
  public void drink(){
  if (waterLevel == 0){
    System.out.println("No more water!");
  }
  else if (waterLevel < 10){
    System.out.println("Enough for a sip");
    waterLevel = 0;
  }
  else{
    System.out.println("Drank a mouthful");
    waterLevel -= 10;
  }
}
  public void check(){
  System.out.println("Water level: " + waterLevel);
}
}

    

