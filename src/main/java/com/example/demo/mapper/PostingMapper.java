package com.example.demo.mapper;

import java.sql.Timestamp;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.example.demo.model.Posting;

@Mapper
public interface PostingMapper {

	
	
	@Select("SELECT * FROM Posting LIMIT 0,5")
	List<Posting> getBoardPosting();
	
	@Select("SELECT * FROM Posting ORDER BY hcnt DESC LIMIT #{offset},10")
	List<Posting> getBoardOffsetbyHcnt(@Param("offset")int offset);

	
	@Select("SELECT * FROM Posting ORDER BY pdate DESC LIMIT #{offset},10")
	List<Posting> getBoardOffsetbyDate(@Param("offset")int offset);

	
	@Select("SELECT * FROM Posting ORDER BY vcnt DESC LIMIT #{offset},10")
	List<Posting> getBoardOffsetbyVcnt(@Param("offset")int offset);

	
	@Select("SELECT * FROM Posting WHERE pcontent LIKE CONCAT('%',#{pcontent},'%')")
	List<Posting> getPostingbyContent(@Param("pcontent")String pcontent);
	

	@Insert("INSERT INTO Posting (pid,pdate,pcontent) VALUES (#{pid},#{pdate},#{pcontent})")
	int insertBoardPosting(@Param("pid")String pid, @Param("pdate")Timestamp pdate, @Param("pcontent")String pcontent);
	
	
	@Update("UPDATE Posting SET hcnt = hcnt+1 WHERE pno=#{pno}")
	int updateHcntPlus(@Param("pno")int pno);
	

	@Update("UPDATE Posting SET hcnt = hcnt-1 WHERE pno=#{pno}")
	int updateHcntMinus(@Param("pno")int pno);
	

	@Update("UPDATE Posting SET ccnt = ccnt+1 WHERE pno=#{pno}")
	int updateCcntPlus(@Param("pno")int pno);
	

	@Update("UPDATE Posting SET ccnt = ccnt-1 WHERE pno=#{pno}")
	int updateCcntMinus(@Param("pno")int pno);

	
	@Update("UPDATE Posting SET vcnt = vcnt+1 WHERE pno=#{pno}")
	int updateVcntPlus(@Param("pno")int pno);

	
	@Delete("DELETE FROM Posting WHERE pno=#{pno}")
	int deleteBoardPosting(@Param("pno")int pno);
}
