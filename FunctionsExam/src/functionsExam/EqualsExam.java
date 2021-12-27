package functionsExam;

public class EqualsExam {

	public static void main(String[] args) {
/* .equals() : 문자열을 비교하여 그 결과를 boolean 값으로 알려준다.
	
 */
		String a = "password"; // 사용자로부터 키보드로 입력받은 비밀번호
		String b = "password"; // 회원가입 시 DB에 저장된 비밀번호

		if(a.equals(b)) {
			System.out.println("비밀번호가 일치합니다. 로그인 허용"); // 로그인은 session?
		} else {
			System.out.println("잘못된 비밀번호입니다. 다시 입력하세요.");
		}
	}

}
