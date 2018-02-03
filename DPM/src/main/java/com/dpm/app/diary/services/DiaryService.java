package com.dpm.app.diary.services;

import java.util.Date;
import java.util.List;

import com.dpm.app.diary.dto.DiaryDto;
import com.dpm.app.diary.dto.DiarySearchDto;

public interface DiaryService {
	public List<DiaryDto> getAllDiary(DiarySearchDto searchDto) throws Exception;

	public List<DiaryDto> getDiary(DiarySearchDto searchDto) throws Exception;

	public boolean createDiary(DiaryDto createDto) throws Exception;

	public void deleteDiary(DiaryDto deleteDto) throws Exception;
	
	public void updateDiary(DiaryDto updateDto) throws Exception;
}
