package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.mapper.HeartPressMapper;


@RestController
public class HeartPressController {

	private HeartPressMapper mapper;
	
	public HeartPressController(HeartPressMapper mapper) {
		this.mapper =mapper;
	}
	
	@GetMapping("/heartPress/{hid}")
	public List<Integer> getHeartPress(@PathVariable("hid") String hid){
		
		return mapper.getHeartPress(hid);
	}
	
	@PostMapping("/heartPress/{pno}")
	public int postHeartPress(@PathVariable("pno")int pno,@RequestParam("hid") String hid) {
		
		return mapper.insertHeartPress(pno,hid);
	}
	
	@DeleteMapping("/heartPress/delete")
	public int deleteHeartPress(@RequestParam("pno")int pno,@RequestParam("hid") String hid) {
		
		return mapper.deleteHeartpress(pno,hid);
	}

}
