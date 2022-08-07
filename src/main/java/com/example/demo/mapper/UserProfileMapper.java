package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.UserProfile;

@Mapper
public interface UserProfileMapper {

	
	@Select("SELECT * FROM UserProfile WHERE id=#{id}")
	UserProfile getUserProfilebyID(@Param("id") String id); //이 id를 가지는 사용자 프로필정보가 UserProfile로 가져와서 반환함

	@Select("SELECT * FROM UserProfile WHERE email=#{email}")
	UserProfile getUserProfilebyEmail(@Param("email") String email); //이 email을 가지는 사용자 프로필정보가 UserProfile로 가져와서 반환함
	
	
	@Insert("INSERT INTO UserProfile VALUES (#{id}, #{pwd}, #{name}, #{email})") //sql문이 적용된 레코드 개수를 반환함
	int insertUserProfile(@Param("id") String id,@Param("pwd") String pwd, @Param("name") String name, @Param("email") String email);
	
	
	@Delete("DELETE FROM UserProfile WHERE id=#{id}")
	int deleteUserProfile(@Param("id") String id); 
	
	/*@Select("SELECT * FROM UserProfile")
	List<UserProfile> getUserProfileList();
	
	
	@Update("UPDATE UserProfile SET pwd=#{pwd}, name=#{name} WHERE id=#{id}") //수정
	int updateUserProfile(@Param("id") String id,@Param("pwd") String pwd, @Param("name") String name);
	 */
}
