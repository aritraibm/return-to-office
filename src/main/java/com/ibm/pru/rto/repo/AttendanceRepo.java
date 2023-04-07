package com.ibm.pru.rto.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ibm.pru.rto.entity.TblAttendance;

@Repository
public interface AttendanceRepo extends JpaRepository<TblAttendance, String> {

	List<TblAttendance> findByEmpId(String empId);

	
}
