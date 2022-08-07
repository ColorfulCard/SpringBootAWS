package com.example.demo.controller;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.mapper.FavoriteStoreMapper;
import com.example.demo.model.FavoriteStore;


@RestController
public class FavoriteStoreController {
	
	private FavoriteStoreMapper mapper;
	
	public FavoriteStoreController(FavoriteStoreMapper mapper) {
		this.mapper=mapper;
	}

	@GetMapping("/favorStore/{uid}")
	public List<Integer> getFavoriteStore(@PathVariable("uid") String uid){
		return mapper.getFavoriteStore(uid);
	}
	
	@PostMapping("/favorStore/{uid}")
	public int postUserFavorStore(@PathVariable("uid") String uid, @RequestParam("sid")int sid) {
		return mapper.insertFavoriteStore(uid,sid);
	}
	
	@DeleteMapping("/favorStore/delete")
	public int deleteFavoriteStore(@RequestParam("uid")String uid, @RequestParam("sid")int sid) {
		return mapper.deleteFavoriteStore(uid,sid);
	}
	
}
