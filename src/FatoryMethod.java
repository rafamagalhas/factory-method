
public class FatoryMethod {

	public static void main(String[] args) {
		CarFactory factory = new FiatFactory();
		Car palio = factory.createCar();
		
		palio.showInfo();
	}

}
