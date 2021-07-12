package com.ch.layout.model;
import java.sql.Date;
import org.apache.ibatis.type.Alias;
import lombok.Data;
@Data
@Alias("emp")
public class Emp {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
	// join
//	private Dept dept;	dept table 통쨰로 갖고올 때
	private String dname;	// dept 컬럼 일부만 갖고온다
	private String loc;
}