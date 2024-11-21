package CH11_01;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String num = "123";
        //123+100
		int a = Integer.parseInt(num) + 100; // 문자열을 정수로
        System.out.println(a);   // 223
        // 정수,실수 -> 문자열 str(a)
        String num2 = String.valueOf(100);
		System.out.println(num2);   // 숫자 "100" 무조건 문자열로 변환시켜준다
        
	}

}
