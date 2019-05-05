package me.filipebezerra.cars.domain.repository;

import me.filipebezerra.cars.domain.entity.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
