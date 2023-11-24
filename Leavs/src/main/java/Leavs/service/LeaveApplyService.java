package Leavs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Leavs.entity.ApplyLeave;
import Leavs.repository.LeaveRepository;

@Service
public class LeaveApplyService {
	 @Autowired
	    private LeaveRepository leaveRepository;
	 
	 
	 public ApplyLeave approveLeave(int  leave_id)
	 {
		 
		 ApplyLeave leavs = leaveRepository.findById(leave_id).orElse(null);
		 if(leavs != null)
		 {
			 leavs.setStatus("Approved");
			 return leaveRepository.save(leavs);
		 }
		 else
		 {
			 return null;
		 }
	
	 }
	 
	 
	 public ApplyLeave rejectLeave(int leave_id)
	 {
		 ApplyLeave leavs = leaveRepository.findById(leave_id).orElse(null);
		 if(leavs  != null)
		 {
			 leavs.setStatus("Rejected");
			 return leaveRepository.save(leavs);
			 
		 }
		 else
		 {
			 return null;
		 }
		 
	 }
	 
	
	
}
