// Timer.java

import java.util.Scanner;

public class FancyTimer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("⏰ 원하는 초단위 시간을 입력해주세요😀 : ");
        int seconds = scanner.nextInt();
        scanner.close();
        timer(seconds);
    }

    public static void timer(int seconds) {
        try {
			for(int i = 1; i <= seconds;i++)
			{	
				Thread.sleep(1000);
				System.out.println(i + "초");
			}
            System.out.println("⌛️⌛️ 시간이 종료되었습니다!!! ⌛️⌛️");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

