package Leavs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Leavs.entity.Company;
import Leavs.repository.CompanyRepository;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

	@Autowired
    private CompanyRepository companyRepository;
	
	@PostMapping("/addCompany")
    public ResponseEntity<Company> createCompany(@RequestBody Company company) {
        Company savedCompany = companyRepository.save(company);
        return new ResponseEntity<>(savedCompany, HttpStatus.CREATED);
    }
	
	@GetMapping("/getCompany")
	public ResponseEntity<List<Company>> getCompanyDetails()
	{
		List<Company> companies = companyRepository.findAll();
		return new ResponseEntity<>(companies, HttpStatus.OK);
		
	}
	
	
	
	
	
	
}
