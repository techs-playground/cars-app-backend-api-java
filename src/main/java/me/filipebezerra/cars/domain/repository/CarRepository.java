package me.filipebezerra.cars.domain.repository;

import me.filipebezerra.cars.domain.entity.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {}
