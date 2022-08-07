package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.MemberStoreMapper;
import com.example.demo.model.MemberStore;

@RestController 
public class MemberStoreController {

	private MemberStoreMapper mapper;
	
	public MemberStoreController(MemberStoreMapper mapper) {
		this.mapper=mapper;
	}
	
	@GetMapping("/storeType/{stype}")
	public List<MemberStore> getStorebyType(@PathVariable("stype")String stype){
		return mapper.getStorebyType(stype);
	}
	
	@GetMapping("/storeName/{sname}")
	public List<MemberStore> getStorebyName(@PathVariable("sname") String sname){
		return mapper.getStorebyName(sname);
	}
	
	@GetMapping("/storeAll")
	public List<MemberStore> getAllStore(){
		return mapper.getAllStore();
	}
	
}
