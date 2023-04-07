package com.ibm.pru.rto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.pru.rto.entity.TblAttendance;
import com.ibm.pru.rto.model.EmpAttendanceRequest;
import com.ibm.pru.rto.service.AttendanceService;

@RestController
@RequestMapping(path = "/rto")
public class GatewayController {

	@Autowired
	private AttendanceService attendanceService;
	
	@PostMapping(path = "/saveEmployeeAttendance")
	public String saveEmployeeAttendance(@RequestBody EmpAttendanceRequest formRequest) {
		return attendanceService.saveEmpAttendance(formRequest);
	}
	
	@GetMapping(path = "/getAllEmployeeAttendance")
	public List<TblAttendance> getAllEmployeeAttendance() {
		return attendanceService.getEmpAttendance();
	}
	
	@GetMapping(path = "/getAllEmployeeAttendanceByEmpId/{empId}")
	public List<TblAttendance> getAllEmployeeAttendanceByEmpId(@PathVariable String empId) {
		return attendanceService.getEmpAttendanceByEmpId(empId);
	}
}
