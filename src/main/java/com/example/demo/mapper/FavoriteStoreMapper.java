package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface FavoriteStoreMapper {

	
	@Select("SELECT sid FROM FavoriteStore WHERE uid=#{uid}")
	List<Integer> getFavoriteStore(@Param("uid") String uid);
	
	@Insert("INSERT INTO FavoriteStore VALUES (#{uid}, #{sid})")
	int insertFavoriteStore(@Param("uid") String uid, @Param("sid") int sid);
	
	@Delete("DELETE FROM FavoriteStore WHERE uid=#{uid} AND sid=#{sid}")
	int deleteFavoriteStore(@Param("uid") String uid, @Param("sid") int sid);
	

}