package car_dealership;

public class Employee {

	public void handleCustomer(Customer customer,boolean finance, Vehicle vehicle) {
		
		if(finance==true) {
			double loanAmount = vehicle.getPrice() - customer.getCashOnHand();
			runCreadHistory(customer,loanAmount);
		}else {
			
			if(vehicle.getPrice() <= customer.getCashOnHand()) {
				processTransaction(customer,vehicle);
			}else {
				System.out.println("Customer will need more money");
			}
				
		}
		
	}

	private void processTransaction(Customer customer, Vehicle vehicle) {
		System.out.println("Customer has purchased the vehicle"+vehicle+" for the price "+vehicle.getPrice());
		
	}

	private void runCreadHistory(Customer customer, double loanAmount) {
		
		System.out.println("Ran credit history for Customer");
		System.out.println("Customer has been approved to purchase the vehicle");
	}
	
	
	
	
}
