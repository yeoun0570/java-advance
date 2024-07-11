package generic.classEx;

public class GenericEx01 {

  public static void main(String[] args) {
    Product<SmartPhone, String> p1 = new Product<SmartPhone, String>();
    p1.setKind(new SmartPhone());
    p1.setModel("애플15Pro");

    SmartPhone applePhone = p1.getKind();
    String model = p1.getModel();
    System.out.println(applePhone + " " + model);

    Product<Car, String> p2 = new Product<Car, String>();
    p2.setKind(new Car());
    p2.setModel("volvo");

    Car volvoCar = p2.getKind();
    String model2 = p2.getModel();
    System.out.println(volvoCar + " " + model2);

    Box<Doll> box = new Box<Doll>();
    box.content = new Doll();
    System.out.println(box.content.name);


  }

}
