package com.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerRunner implements CommandLineRunner {
	@Autowired
	CustomerRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// Create/Insert/Update

		/*
		 * Customer c = new Customer(3, "Gregory", "Argentina"); repo.save(c);
		 * System.out.println("Record inserted");
		 */

		List<Customer> customers = List.of(new Customer(1, "Alice Johnson", "New York"),
				new Customer(2, "Bob Smith", "Los Angeles"), new Customer(3, "Gregory", "Argentina"),
				new Customer(4, "Catherine Miller", "Chicago"), new Customer(5, "David Brown", "Houston"),
				new Customer(6, "Emma Wilson", "Phoenix"), new Customer(7, "Frank Garcia", "Philadelphia"),
				new Customer(8, "Grace Lee", "San Antonio"), new Customer(9, "Henry Harris", "San Diego"),
				new Customer(10, "Isabella Young", "Dallas"), new Customer(11, "Jack Martinez", "San Jose"),
				new Customer(12, "Kelly Turner", "Austin"), new Customer(13, "Liam Thompson", "Jacksonville"),
				new Customer(14, "Mia Anderson", "Fort Worth"), new Customer(15, "Noah Walker", "Columbus"),
				new Customer(16, "Olivia Scott", "Charlotte"), new Customer(17, "Paul Moore", "San Francisco"),
				new Customer(18, "Quincy Allen", "Indianapolis"), new Customer(19, "Rachel Hernandez", "Seattle"),
				new Customer(20, "Samuel King", "Denver"), new Customer(21, "Tina Wright", "Washington"),
				new Customer(22, "Ursula Lopez", "Boston"), new Customer(23, "Victor Green", "El Paso"),
				new Customer(24, "Wendy Adams", "Nashville"), new Customer(25, "Xavier Nelson", "Detroit"),
				new Customer(26, "Yvonne Baker", "Portland"), new Customer(27, "Zachary Clark", "Las Vegas"));

		// Save all customers to the repository
		repo.saveAll(customers);

		// Retrieve one record
		/*
		 * Integer cno = 3; Optional<Customer> byId = repo.findById(cno);
		 * while(byId.isPresent()) { System.out.println(byId.get().getCno() +
		 * " - "+byId.get().getCname()+" - "+byId.get().getLoc()); break;
		 * 
		 * }
		 */

		// Retrieve All Records
		/*
		 * Iterable<Customer> all = repo.findAll(); Iterator<Customer> iterator =
		 * all.iterator(); while (iterator.hasNext()) { Customer next = iterator.next();
		 * System.out.println(next.getCno() + " - " + next.getCname() + " - " +
		 * next.getLoc()); }
		 */

		// Delete record

		/*
		 * Integer cno = 3; repo.deleteById(cno); // repo.deleteAll() --> for deleting
		 * all the records System.out.println("Record deleted");
		 */

	}

}
