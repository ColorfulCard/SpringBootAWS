package com.example.demo.controller;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.UserCardMapper;
import com.example.demo.model.UserCard;


@RestController 
public class UserCardController {

	private UserCardMapper mapper;
	
	public UserCardController(UserCardMapper mapper) {
		this.mapper=mapper;
	}
	
	@GetMapping("/cardID/{id}")  
	public List<UserCard> getUserCard(@PathVariable("id") String id) {
		return mapper.getUserCard(id);
	} 
		
	@PostMapping("/card/{cardNum}") //데이터를 생성함 
	public UserCard postUserCard(@PathVariable("cardNum") String cardNum, @RequestParam("id") String id, @RequestParam("cardName") String cardName, @RequestParam("cardType") String cardType)
	{
		//파라메타 형태로 전달
		mapper.insertUserCard(id, cardName, cardNum, cardType);
		return mapper.getCardbyNum(cardNum);
	}
	
	@DeleteMapping("/card/delete")
	public int deleteUserCard(@RequestParam("cardNum") String cardNum, @RequestParam("id") String id, @RequestParam("cardName") String cardName, @RequestParam("cardType") String cardType) {	
		
		return mapper.deleteUserCard(id,cardName,cardNum,cardType);
		
	}
	
	
	
	/*@GetMapping("/card/all")
	public List<UserCard> getUserCardList(){
		return mapper.getUserCardList();
	} */
	
	/*@GetMapping("/cardNum/{cardNum}")
	public UserCard getCardbyNum(@PathVariable("cardNum") String cardNum) {
		return mapper.getCardbyNum(cardNum);
	}*/
	
}
