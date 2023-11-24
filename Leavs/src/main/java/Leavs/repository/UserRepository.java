package Leavs.repository;

import org.springframework.data.repository.CrudRepository;

import Leavs.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
