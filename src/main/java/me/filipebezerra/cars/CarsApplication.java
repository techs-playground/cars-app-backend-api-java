package me.filipebezerra.cars;

import me.filipebezerra.cars.domain.entity.Car;
import me.filipebezerra.cars.domain.entity.Owner;
import me.filipebezerra.cars.domain.repository.CarRepository;
import me.filipebezerra.cars.domain.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CarsApplication {

	@Autowired
	private CarRepository carRepository;

	@Autowired
	private OwnerRepository ownerRepository;

	public static void main(String[] args) {
		SpringApplication.run(CarsApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			final Owner sarah = new Owner("Sarah", "Leew");
			final Owner john = new Owner("John", "Jhones");

			ownerRepository.save(sarah);
			ownerRepository.save(john);

			carRepository.save(new Car("Ford", "Mustang", "Red", "ADF-1121",
					2017, 59000, sarah));
			carRepository.save(new Car("Toyota", "Prius", "Black", "KKO-1309",
					2018, 39000, john));
		};
	}

}
