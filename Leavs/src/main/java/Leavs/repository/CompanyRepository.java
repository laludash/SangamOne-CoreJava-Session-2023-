package Leavs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Leavs.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
