package edu.kh.jsp2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@ToString
@Data // Getter + Setter + toString
@NoArgsConstructor  // 기본생성자
@AllArgsConstructor // 모든필드 초기화용 매개변수생성자
public class Book {
	// 필드
	private String title;   //제목
	private String writer;  // 작성자
	private int price;		// 가격
	
	// 메서드(생성자, getter/setter/toString())
}