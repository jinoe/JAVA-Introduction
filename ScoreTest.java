import java.util.Scanner;

public class ScoreTest {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
//		System.out.print("java 점수: ");
//		int java = scanner.nextInt();
//		System.out.print("jsp 점수: ");
//		int jsp = scanner.nextInt();
//		System.out.print("spring 점수: ");
//		int spring = scanner.nextInt();

		//한줄에 집어넣기
		System.out.print("3과목 점수를 입력하세요: ");
		int java = scanner.nextInt();
		int jsp = scanner.nextInt();
		int spring = scanner.nextInt();

		
		int total = java + jsp + spring;
		double average = (double) total/3;
		
		System.out.println("총점: " + total + "점, 평균: " + average);
		System.out.printf("총점: %3d점, 평균: %6.2f점\n",total,average);
		
		// 평균점수가 90점 미만이고 80점 이상이면 B
		if(average>=90) {
			System.out.println("A");
		}
		else if (average>=80) {
			System.out.println("B");
		}
		else if (average>=70) {
			System.out.println("C");
		}
		else if (average>=60) {
			System.out.println("D");
		}
		else{
			System.out.println("F");
		}
	}
}