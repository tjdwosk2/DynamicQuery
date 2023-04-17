package com.ict.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ict.model.vo.EmpVO;

@Repository
//2
public class EmpDAO {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	public List<EmpVO> getList() {
		return sqlSessionTemplate.selectList("emp.list");
	}
	
	public List<EmpVO> search(String employee_id) {
		return sqlSessionTemplate.selectList("emp.search", employee_id);
	}
	public List<EmpVO> search(String searchType, String searchValue){
		//VO 에 없는내용이고 자료형도 2개 이니 까 Map 을써주자
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("searchType", searchType);
		map.put("searchValue", searchValue);
		return sqlSessionTemplate.selectList("emp.search2", map);
	}
	
}
