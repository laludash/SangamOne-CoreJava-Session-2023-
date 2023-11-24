package Leavs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sendgrid.Response;

import Leavs.emailservice.EmailRequestentity;
import Leavs.emailservice.SendGridEmail;
import Leavs.entity.ApplyLeave;
import Leavs.repository.LeaveRepository;
import Leavs.service.LeaveApplyService;
import Leavs.service.LeaveService;

@RestController
@RequestMapping("/api/leaves")
public class LeaveController {

	
	@Autowired
	private LeaveService leaveService;
	
	@Autowired 
	private LeaveApplyService leaveapplyservice;
	
	
	@Autowired
	private LeaveRepository leaveRepo;
	@Autowired 
	SendGridEmail emailrequest;
	@Autowired(required = false) 
	EmailRequestentity entity;
	
	@PostMapping("/apply")
	public ResponseEntity<ApplyLeave> applyLeave(@RequestBody ApplyLeave applyleave)
	{
		
		ApplyLeave appliedLeave = leaveService.leave(applyleave);
		Response response = emailrequest.sendEmail(entity);
		System.out.println("Response Ok" +response);
		return ResponseEntity.ok(appliedLeave);
		
	}
	
	@GetMapping("/Rejected")
	public List<ApplyLeave> getRejectedLeave()
	{
		return leaveRepo.findByRejectedLeave();
		
	}
	
	@GetMapping("/Pending")
	public List<ApplyLeave> getPendingLeave()
	{
		return leaveRepo.findByPendingLeave();
	}
	
	@GetMapping("/Approved")
	public List<ApplyLeave> getApprovedLeave()
	{
		return leaveRepo.findByApprovedLeave();
		
	}
	
	
	
	
	@PutMapping("/approve/{leave_id}")
	public ResponseEntity<ApplyLeave> approveLeave(@PathVariable(name = "leave_id") int  leave_id)
	{
		ApplyLeave approvedLeave = leaveapplyservice.approveLeave(leave_id);
		
		if(approvedLeave != null)
		{
			return ResponseEntity.ok(approvedLeave);
		}
		else
		{
			 return ResponseEntity.notFound().build();
		}
		//return null;
		
	}
	
	
	@PutMapping("/reject/{leave_id}")
	public ResponseEntity<ApplyLeave> rejectLeave(@PathVariable("leave_id") int leave_id)
	{
		ApplyLeave  rejectLeave = leaveapplyservice.rejectLeave(leave_id);
		if(rejectLeave != null)
		{
			return ResponseEntity.ok(rejectLeave);
		}
		else
		{
			return ResponseEntity.notFound().build();
		}	
	}
}
