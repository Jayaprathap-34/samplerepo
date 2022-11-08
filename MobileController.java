package com.example.Mobile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileController {
	@Autowired
	MobileService ms;
	@PostMapping(value="/store")
	public String store(@RequestBody List<Mobile> a) {
	return ms.store(a);
	}
	@GetMapping(value="/showAll")
	public List<Mobile>show(){
		return ms.show();
		
	}
	
}