package edu.kh.todoList.model.service;

import java.util.List;
import java.util.Map;

import edu.kh.todoList.common.JDBCTemplate.*;
import edu.kh.todoList.model.dto.Todo;


public class TodoListServiceImpl implements TodoListService{

	private TodoListDAO = new TodoListDAOImpl();
	
	@Override
	public Map<String, Object> todoListFullView() {
		
		// 커넥션 생성
		Connection conn = getConnection();
		
		// dao 호출 및 반환받기
		// 1) 할 일 목록 얻어오기
		List<Todo> todoList = dao.todoListFullView(conn);
		
		// 2) 완료된 할 일 개수 카운트
		int completeCount = dao.getCompleteCount(conn);
		
		// Map 에 1,2 번으로 얻어온 데이터를 세팅하여 리턴
		
		
		return null;
	}

}
