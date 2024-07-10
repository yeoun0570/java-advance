package generic.InterfaceEx;

public class Codi implements Rentable <AirConditionMachine>{

  @Override
  public AirConditionMachine rent() {
    return new AirConditionMachine();
  }
}
