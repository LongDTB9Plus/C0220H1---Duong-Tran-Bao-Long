package com.test.repository;

import com.test.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    List<Employee> findAllByIdEqualsOrBirthDayContainingOrIdNumberContaining
            (Integer id, String birthDay, String idNumber);

}
