package edu.kh.todoList.model.service;

import edu.kh.todoList.controller.Map;
//유지보수성과 확장성, 테스트 용이성 때문..
//-> Controller 는 ServiceImpl을 직접쓰지 않고, Service 인테페이스를 의존하므로,
//	나중에 구현체가 바뀌어도 Controller는 영향을 받지 않음
//-> ServiceImpl 대신 NewServiceImpl 을 만들어서 새로운 로직을 적용하고 싶을때
//쉽게 교체 가능
public interface TodoListService {

	/** 할일 목록 반환 서비스
	 * @return todoList + 완료개수 map
	 */
	Map<String, Object> todoListFullView();

}
