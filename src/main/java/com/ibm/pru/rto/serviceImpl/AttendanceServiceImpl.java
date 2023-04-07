package com.ibm.pru.rto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.pru.rto.entity.TblAttendance;
import com.ibm.pru.rto.model.EmpAttendanceRequest;
import com.ibm.pru.rto.repo.AttendanceRepo;
import com.ibm.pru.rto.service.AttendanceService;

@Service
public class AttendanceServiceImpl implements AttendanceService{

	@Autowired
	private AttendanceRepo attendanceRepo;
	
	@Override
	public List<TblAttendance> getEmpAttendance() {
		return attendanceRepo.findAll();
	}

	@Override
	public String saveEmpAttendance(EmpAttendanceRequest formRequest) {
		// TODO Auto-generated method stub
		System.out.println("=========SOURCE============== >>>"+formRequest.toString());
		
		TblAttendance finalMappedEntity = mapUIRequesttoEntity(formRequest);
		System.out.println("==========FINAL============= >>>"+finalMappedEntity.toString());
		
		attendanceRepo.save(finalMappedEntity);
		return "hello";
	}

	private TblAttendance mapUIRequesttoEntity(EmpAttendanceRequest formRequest) {
		
		TblAttendance tblAtt = new TblAttendance();
		tblAtt.setEmpId(formRequest.getEmpId());
		tblAtt.setMonth(formRequest.getMonth());
		tblAtt.setDate_1(formRequest.getDate_1());
		tblAtt.setDate_2(formRequest.getDate_2());
		tblAtt.setDate_3(formRequest.getDate_3());
		tblAtt.setDate_4(formRequest.getDate_4());
		tblAtt.setDate_5(formRequest.getDate_5());
		tblAtt.setDate_6(formRequest.getDate_6());
		tblAtt.setDate_7(formRequest.getDate_7());
		tblAtt.setDate_8(formRequest.getDate_8());
		tblAtt.setDate_9(formRequest.getDate_9());
		tblAtt.setDate_10(formRequest.getDate_10());
		tblAtt.setDate_11(formRequest.getDate_11());
		tblAtt.setDate_12(formRequest.getDate_12());
		tblAtt.setDate_13(formRequest.getDate_13());
		tblAtt.setDate_14(formRequest.getDate_14());
		tblAtt.setDate_15(formRequest.getDate_15());
		tblAtt.setDate_16(formRequest.getDate_16());
		tblAtt.setDate_17(formRequest.getDate_17());
		tblAtt.setDate_18(formRequest.getDate_18());
		tblAtt.setDate_19(formRequest.getDate_19());
		tblAtt.setDate_20(formRequest.getDate_21());
		tblAtt.setDate_22(formRequest.getDate_22());
		tblAtt.setDate_23(formRequest.getDate_23());
		tblAtt.setDate_24(formRequest.getDate_24());
		tblAtt.setDate_25(formRequest.getDate_25());
		tblAtt.setDate_26(formRequest.getDate_26());
		tblAtt.setDate_27(formRequest.getDate_27());
		tblAtt.setDate_28(formRequest.getDate_28());
		tblAtt.setDate_29(formRequest.getDate_29());
		tblAtt.setDate_30(formRequest.getDate_30());
		tblAtt.setDate_31(formRequest.getDate_31());
		tblAtt.setStatus("Active");
		
		return tblAtt;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TblAttendance> getEmpAttendanceByEmpId(String empId) {
		// TODO Auto-generated method stub
		return attendanceRepo.findByEmpId(empId);
	}

}
