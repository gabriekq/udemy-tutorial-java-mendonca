package car_dealership;

public class Dealership {

	public static void main(String[] args) throws CloneNotSupportedException {
	
	Customer cust1 = new Customer("Joao","abcd Steet",250000);	

	Vehicle vehicle = new Vehicle("Honda","Acord",15000);
	
	
	Employee employee = new Employee();
	
	
	cust1.purcheseCar(vehicle,employee,false);
	
//	Vehicle car = new Vehicle("Honda","Acord",15000);
	
//	System.out.println(car.equals(vehicle));
	
	 Vehicle vehicleClore = (Vehicle) vehicle.clone();
	
	 System.out.println("veiculo clonado -> "+vehicleClore);

	}

}
