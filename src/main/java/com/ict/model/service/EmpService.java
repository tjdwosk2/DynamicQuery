package com.ict.model.service;

import java.util.List;

import com.ict.model.vo.EmpVO;

//3 이제 내가 원하는 값을 넣어주자 
public interface EmpService {
	//전체보기
	List<EmpVO> getList() throws Exception;
	//아이디 넣어서 검색
	List<EmpVO> search(String employee_id) throws Exception;
	// 키 벨류값 
	List<EmpVO> search(String searchType, String searchValue)throws Exception;
	
}
