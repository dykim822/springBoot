package com.ch.jpa.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ch.jpa.dao.EmpDao;
import com.ch.jpa.model.Emp;
@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpDao ed;
	public List<Emp> list(int deptno) {
		return ed.list(deptno);
	}
	public List<Emp> empList() {
		return ed.empList();
	}
	@Override
	public Emp select(int empno) {
		return ed.select(empno);
	}
	@Override
	public Emp insert(Emp emp) {
		return ed.saveAndFlush(emp);
	}
	@Override
	public Emp update(Emp emp) {
		return ed.saveAndFlush(emp);
	}
	@Override
	public int delete(int empno) {
		return ed.delete(empno);
	}
	@Override
	public List<Emp> allList() {
		return ed.allList();
	}
}