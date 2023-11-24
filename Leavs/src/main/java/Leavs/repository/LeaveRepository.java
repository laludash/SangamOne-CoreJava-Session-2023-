package Leavs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import Leavs.entity.ApplyLeave;

public interface LeaveRepository extends CrudRepository<ApplyLeave,Integer> {
	
	@Query(value = "select * from leaveleave where status = 'Rejected'", nativeQuery= true)
		List<ApplyLeave> findByRejectedLeave();
	
	@Query(value = "select * from leaveleave where status  = 'Pending'", nativeQuery = true)
	List<ApplyLeave> findByPendingLeave();
	
	@Query(value  = "select * from leaveleave where status = 'Approved'", nativeQuery = true)
	List<ApplyLeave> findByApprovedLeave();
	
}
