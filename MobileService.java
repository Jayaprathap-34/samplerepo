package com.example.Mobile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobileService {
@Autowired
	MobileDao md;
	public String store(List<Mobile> a) {
		// TODO Auto-generated method stub
		return md.store(a);
	}
	public List<Mobile> show() {
		// TODO Auto-generated method stub
		return md.show();
	}

}
