package com.example.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.MemberStore;

@Mapper
public interface MemberStoreMapper {
	
	//가맹점 type별로 들고오기
	@Select("SELECT * FROM MemberStore WHERE stype=#{stype}")
	List<MemberStore> getStorebyType(@Param("stype") String stype);

	//가맹점 이름으로 들고오기
	@Select("SELECT * FROM MemberStore WHERE sname LIKE CONCAT('%',#{sname},'%')")
	List<MemberStore> getStorebyName(@Param("sname") String sname);
	
	@Select("SELECT * FROM MemberStore")
	List<MemberStore> getAllStore();
}
