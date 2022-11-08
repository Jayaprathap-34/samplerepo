package com.example.Mobile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MobileDao {
	@Autowired
	Mobilerepository mr;
	public String store(List<Mobile> a) {
		// TODO Auto-generated method stub
		mr.saveAll(a);
		return "successfully";
	}
	public List<Mobile> show() {
		// TODO Auto-generated method stub
		return mr.findAll();
	}
	

}
