package test;


import java.util.HashMap;

public class MapExam {

	public static void main(String[] args) {
		// 파이썬의 딕셔너리, 판다스의 series, JS의 json과 같은 키와 벨류 쌍으로 이루어진 자료형
		// 오직 키값으로 벨류 값을 얻는다. 순서(index)의 개념이 없다.
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		//<String, String> -> 키, 벨류 모두 String으로 하라고 강제
		
		map.put("people", "사람");
		map.put("baseball", "야구");
		
		System.out.println(map.get("people"));
		System.out.println(map.get("baseball"));
		System.out.println(map.size());

	}

}
