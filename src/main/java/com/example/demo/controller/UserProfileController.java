package com.example.demo.controller;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.UserProfileMapper;
import com.example.demo.model.UserProfile;


@RestController  //이 프레임워크가 알아서 컨트롤러로 인식하도록 함 
public class UserProfileController {

	private UserProfileMapper mapper;


	public UserProfileController(UserProfileMapper mapper) {
		this.mapper=mapper;
	}

	/*get: 데이터를 조회
	  post: 데이터를 생성
	  put: 데이터를 수정
	  delete: 데이터를 삭제 */

	
	@GetMapping("/user/{id}")
	public UserProfile getUserProfile(@PathVariable("id") String id) {
		return mapper.getUserProfilebyID(id);
	} //데이터베이스에서 얻어온 userProfile 을 JSON 형태로 mapping해서 리턴해줌
	
	@GetMapping("/userEmail/{email}")
	public UserProfile getUserProfilebyEmail(@PathVariable("email") String email) {
		return mapper.getUserProfilebyEmail(email);
	} 

	@PostMapping("/user/{id}") //데이터를 생성함 
	public UserProfile postUserProfile(@PathVariable("id") String id, @RequestParam("pwd") String pwd, @RequestParam("name") String name, @RequestParam("email") String email) {
		//파라메타 형태로 전달
		mapper.insertUserProfile(id, pwd, name, email);
		return mapper.getUserProfilebyID(id);
	}

	@DeleteMapping("/user/delete")
	public int deleteUserProfile(@RequestParam("id") String id) {
		return mapper.deleteUserProfile(id);
	}
	
	
	
	/*@GetMapping("/hello")
	public String getHello() {	
		return "Hello? It's me";
	}
	
	@GetMapping("/user/all")
	public List<UserProfile> getUserProfileList(){
		return mapper.getUserProfileList();
	} 
	
	@PutMapping("/user/{id}") //정보수정
	public void putUserProfile(@PathVariable("id") String id, @RequestParam("pwd") String pwd, @RequestParam("name") String name) {
		mapper.updateUserProfile(id, pwd, name);
	} */

	
}