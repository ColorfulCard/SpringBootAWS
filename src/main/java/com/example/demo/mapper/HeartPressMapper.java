package com.example.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface HeartPressMapper {


	@Select("SELECT pno FROM HeartPress WHERE hid=#{hid}")
	List<Integer> getHeartPress(@Param("hid") String hid);

	
	@Insert("INSERT INTO HeartPress VALUES (#{pno},#{hid})")
	int insertHeartPress(@Param("pno") int pno, @Param("hid") String hid);

	
	@Delete("DELETE FROM HeartPress WHERE pno=#{pno} AND hid=#{hid}")
	int deleteHeartpress(@Param("pno") int pno, @Param("hid") String hid);

}
