package Leavs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Leavs.entity.ApplyLeave;
import Leavs.repository.LeaveRepository;

@Service
public class LeaveService {

	@Autowired 
	private LeaveRepository leaveRepo;
	
	public ApplyLeave leave(ApplyLeave applyleave)
	{
		applyleave.setStatus("Pending");
		return leaveRepo.save(applyleave);
		
	}
	
	
	
	
	
}
