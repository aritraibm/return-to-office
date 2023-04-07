package com.ibm.pru.rto.service;

import java.util.List;

import com.ibm.pru.rto.entity.TblAttendance;
import com.ibm.pru.rto.model.EmpAttendanceRequest;

public interface AttendanceService {
	
	public List<TblAttendance> getEmpAttendance();
	
	public String saveEmpAttendance(EmpAttendanceRequest formRequest);

	public List<TblAttendance> getEmpAttendanceByEmpId(String empId);
}
