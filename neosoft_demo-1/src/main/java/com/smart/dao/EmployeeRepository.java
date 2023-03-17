package com.smart.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.smart.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	
	List<Employee> findByFirstName(String firstName);
	List<Employee> findBySalary(int salary);
	List<Employee> findByCity(String city);
	
	
	@Query("select e from empldetails e where e.department=?1")
	public List<Employee> findByDepartment(String department);
	
	@Query("select e from empldetails e where e.id=?1")
	List<Employee> findById(int id);

}
