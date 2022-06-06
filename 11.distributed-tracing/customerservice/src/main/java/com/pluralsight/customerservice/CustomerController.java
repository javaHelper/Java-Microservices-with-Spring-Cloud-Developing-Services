package com.pluralsight.customerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@RestController
public class CustomerController {

	@Autowired
	private WebClient wc;

	@GetMapping("/servicestatus")
	public String getStatus() {
		return "up";
	}

	private Mono<ContactDetails> getCustomerContact(String cid) {
		return wc.get().uri("http://localhost:8091/customer/" + cid + "/contactdetails").retrieve()
				.bodyToMono(ContactDetails.class);
	}

	private Mono<VehicleDetails> getCustomerVehicle(String cid) {
		return wc.get().uri("http://localhost:8092/customer/" + cid + "/vehicledetails").retrieve()
				.bodyToMono(VehicleDetails.class);
	}

	@RequestMapping(value = "/customer/{cid}", method = RequestMethod.GET)
	public CustomerDetails getCustomer(@PathVariable String cid) {

		CustomerDetails customer = new CustomerDetails();
		// WebClient client = WebClient.create();

		ContactDetails svc1 = wc.get().uri("http://localhost:8091/customer/" + cid + "/contactdetails").retrieve()
				.bodyToMono(ContactDetails.class).block();

		VehicleDetails svc2 = wc.get().uri("http://localhost:8092/customer/" + cid + "/vehicledetails").retrieve()
				.bodyToMono(VehicleDetails.class).block();

		customer.setContactId(cid);
		customer.setContactName(svc1.getContactName());
		customer.setPostalCode(svc1.getPostalCode());
		customer.setLicensePlate(svc2.getLicensePlate());
		customer.setCarType(svc2.getCarType());

		return customer;

	}
}
