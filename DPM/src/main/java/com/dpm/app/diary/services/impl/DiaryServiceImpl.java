package com.dpm.app.diary.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dpm.app.diary.dao.DiaryDao;
import com.dpm.app.diary.dto.DiaryDto;
import com.dpm.app.diary.dto.DiarySearchDto;
import com.dpm.app.diary.services.DiaryService;

@Service
public class DiaryServiceImpl implements DiaryService {

	@Autowired
	DiaryDao diaryDao;

	@Override
	public List<DiaryDto> getAllDiary(DiarySearchDto searchDto) throws Exception {
		return diaryDao.getAllDiary(searchDto);
	}

	@Override
	public List<DiaryDto> getDiary(DiarySearchDto searchDto) throws Exception {
		return diaryDao.getAllDiary(searchDto);
	}

	@Override
	public boolean createDiary(DiaryDto createDto) throws Exception {
		int result = diaryDao.createDiary(createDto);
		if (result == 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void deleteDiary(DiaryDto deleteDto) throws Exception {
		diaryDao.deleteDiary(deleteDto);
	}

	@Override
	public void updateDiary(DiaryDto updateDto) throws Exception {
		diaryDao.updateDiary(updateDto);
	}
}
