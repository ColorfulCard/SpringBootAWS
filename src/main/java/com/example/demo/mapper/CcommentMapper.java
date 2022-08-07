package com.example.demo.mapper;
import java.sql.Timestamp;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.Ccomment;

@Mapper
public interface CcommentMapper {

	
	@Select("SELECT * FROM Ccomment WHERE pno=#{pno}")
	List<Ccomment> getCcomments(@Param("pno")int pno);
	
	@Select("SELECT * FROM Ccomment WHERE pno=#{pno} AND cno=#{cno} AND ccno=#{ccno}")
	Ccomment getCcomment(@Param("pno")int pno,@Param("cno")int cno,@Param("ccno")int ccno);
	
	@Insert("INSERT INTO Ccomment (pno,cno,ccno,ccid,ccment,ccdate) VALUES (#{pno},#{cno},#{ccno},#{ccid},#{ccment},#{ccdate})")
	int postCcomment (@Param("pno")int pno,@Param("cno")int cno, @Param("ccno")int ccno, @Param("ccid")String ccid, @Param("ccment")String ccment, @Param("ccdate")Timestamp ccdate);

	
	@Delete("DELETE FROM Ccomment WHERE pno=#{pno} AND cno=#{cno} AND ccno=#{ccno}")
	int deleteCcomment(@Param("pno")int pno,@Param("cno") int cno,@Param("ccno") int ccno);

}
