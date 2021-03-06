package com.dpm.app.diary.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dpm.app.diary.dto.DiaryDto;
import com.dpm.app.diary.dto.DiarySearchDto;

@Repository
public class DiaryDao {

	@Autowired
	SqlSession sqlSession;

	public List<DiaryDto> getAllDiary(DiarySearchDto searchDto) throws Exception {
		return sqlSession.selectList("diaryDao.getAllDiary", searchDto);
	}

	public List<DiaryDto> getDiary(DiarySearchDto searchDto) throws Exception {
		return sqlSession.selectList("diaryDao.getDiary", searchDto);
	}
	
	public int createDiary(DiaryDto createDto) throws Exception {
		return sqlSession.insert("diaryDao.createDiary", createDto);
	}
	
	public int deleteDiary(DiaryDto deleteDto) throws Exception {
		return sqlSession.delete("diaryDao.deleteDiary", deleteDto);
	}
	
	public int updateDiary(DiaryDto updateDto) throws Exception {
		return sqlSession.update("diaryDao.updateDiary", updateDto);
	}
}
