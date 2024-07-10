package generic.InterfaceEx;

public class RentEx {

  public static void main(String[] args) {
    Codi codi = new Codi();
    AirConditionMachine airConditionMachine = codi.rent();
    airConditionMachine.powerOn();
  }

}
