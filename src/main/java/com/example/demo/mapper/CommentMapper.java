package com.example.demo.mapper;
import java.sql.Timestamp;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.example.demo.model.Comment;

@Mapper
public interface CommentMapper {

	
	
	@Select("SELECT * FROM Comment WHERE pno=#{pno}")
	List<Comment> getComments(@Param("pno")int pno);

	
	@Select("SELECT * FROM Comment WHERE pno=#{pno} AND cno=#{cno}")
	Comment getComment (@Param("pno")int pno, @Param("cno")int cno);
	
	@Insert("INSERT INTO Comment (pno,cno,cid,cment,cdate) VALUES (#{pno},#{cno},#{cid},#{cment},#{cdate})")
	int postComment(@Param("pno")int pno, @Param("cno")int cno, @Param("cid")String cid, @Param("cment")String cment,@Param("cdate")Timestamp cdate);

	
	@Update("UPDATE Comment SET cccnt= cccnt+1 WHERE pno=#{pno} AND cno=#{cno}")
	int updateCccntPlus(@Param("pno")int pno, @Param("cno")int cno);

	
	@Update("UPDATE Comment SET cccnt= cccnt-1 WHERE pno=#{pno} AND cno=#{cno}")
	int updateCccntMinus(@Param("pno")int pno, @Param("cno")int cno);

	
	@Delete("DELETE FROM Comment WHERE pno=#{pno} AND cno=#{cno}")
	int deleteComment(@Param("pno")int pno,  @Param("cno")int cno);
	
	
	

}
