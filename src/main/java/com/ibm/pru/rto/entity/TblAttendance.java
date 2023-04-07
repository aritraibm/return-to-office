package com.ibm.pru.rto.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_attendance")
public class TblAttendance {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long attendanceId;
	private String empId;
	private String month;
	private String date_1;
	private String date_2;
	private String date_3;
	private String date_4;
	private String date_5;
	private String date_6;
	private String date_7;
	private String date_8;
	private String date_9;
	private String date_10;
	private String date_11;
	private String date_12;
	private String date_13;
	private String date_14;
	private String date_15;
	private String date_16;
	private String date_17;
	private String date_18;
	private String date_19;
	private String date_20;
	private String date_21;
	private String date_22;
	private String date_23;
	private String date_24;
	private String date_25;
	private String date_26;
	private String date_27;
	private String date_28;
	private String date_29;
	private String date_30;
	private String date_31;
	private String status;
}
