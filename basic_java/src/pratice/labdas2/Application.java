package pratice.labdas2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Application {

	public static void main(String[] args) {
		
		List<Car> cars = Arrays.asList(
				new Car("Honda", "Accord", "Red", 22300),
				new Car("Honda", "Civic", "Blue", 17700),
				new Car("Toyota", "Land Cruiser", "White", 48500),
				new Car("Toyota", "Corolla", "Black", 16200),
				new Car("Toyota", "Camry", "Blue", 24000),
				new Car("Nissan", "Sentra", "White", 17300),
				new Car("Mitsubishi", "Lancer", "White", 20000),
				new Car("Jeep", "Wrangler", "Red", 24500)
				);

	
		printCars(cars, (car) -> car.getColor().equals("Blue") );
			
		printCars(cars, (car) -> car.getPrice() >= 1800 && car.getPrice() <= 22000);
	
        Function<Car, String> priceAndColor = (car) -> {
          return "Price = "+ car.getPrice()+" color = "+car.getColor();
        };
		
        System.out.println(priceAndColor.apply(  cars.get(0) ));
        
        Supplier<String>  suplll  =  () -> "suplly";
		
	}
	
	public static void printCars(List<Car> cars, Predicate<Car> condition) {
		
		for(Car car: cars) {
			if(condition.test(car)) {
				System.out.println(car);
			}
			
		}
		
		
	}

}
