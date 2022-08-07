package com.example.demo.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.UserCard;

@Mapper
public interface UserCardMapper {

	@Select("SELECT * FROM UserCard WHERE id=#{id}")
	List<UserCard> getUserCard(@Param("id") String id); //후에는 이 아이디가 가진 여러개 카드를 들고올 줄 알아야함
		
	@Select("SELECT * FROM UserCard WHERE cardNum=#{cardNum}")  //카드 하나만 가져올때 번호를 이용해서 
	UserCard getCardbyNum(@Param("cardNum") String cardNum);
	
	@Select("SELECT * FROM UserCard")
	List<UserCard> getUserCardList();
	
	@Insert("INSERT INTO UserCard VALUES (#{id}, #{cardName}, #{cardNum}, #{cardType})") //sql문이 적용된 레코드 개수를 반환함
	int insertUserCard(@Param("id") String id,@Param("cardName") String cardName, @Param("cardNum") String cardNum, @Param("cardType") String cardType);
	
	@Delete("DELETE FROM UserCard WHERE id=#{id} AND cardName=#{cardName} AND cardNum=#{cardNum} AND cardType=#{cardType}")
	int deleteUserCard(@Param("id") String id,@Param("cardName") String cardName, @Param("cardNum") String cardNum, @Param("cardType") String cardType);  //카드번호 기준으로 지움
}
