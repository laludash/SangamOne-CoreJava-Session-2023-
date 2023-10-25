package Leavs.repository;

import org.springframework.data.repository.CrudRepository;

import Leavs.entity.ApplyLeave;

public interface LeaveRepository extends CrudRepository<ApplyLeave,Integer> {

}
