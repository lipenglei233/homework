package two;
import java.util.*;

public class TwoOne {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int yourNum,pcNum;
		Random r = new Random();
		HashMap map = new HashMap();
		map.put(0,"����");
		map.put(1,"ʯͷ");
		map.put(2,"��");
		
		while(true) {
			System.out.println();
			System.out.println("������һ��0~2������");
			yourNum = input.nextInt();
			if(yourNum < 0 || yourNum > 2) {
				System.out.println("������������������");
				continue;
			}else {
				pcNum = r.nextInt(3);
				if(yourNum == pcNum) {
					System.out.println("��ѡ���ˣ�"+map.get(yourNum)+",����ѡ���ˣ�"+map.get(pcNum)+",ƽ��");
				}else if(yourNum == 2 && pcNum == 0) {
					System.out.println("��ѡ���ˣ�"+map.get(yourNum)+",����ѡ���ˣ�"+map.get(pcNum)+",����ʤ");
				}else if(yourNum == 0 && pcNum == 2) {
					System.out.println("��ѡ���ˣ�"+map.get(yourNum)+",����ѡ���ˣ�"+map.get(pcNum)+",��ʤ");
				}else if(yourNum > pcNum) {
					System.out.println("��ѡ���ˣ�"+map.get(yourNum)+",����ѡ���ˣ�"+map.get(pcNum)+",��ʤ");
				}else {
					System.out.println("��ѡ���ˣ�"+map.get(yourNum)+",����ѡ���ˣ�"+map.get(pcNum)+",����ʤ");
				}
			}
		}
		
		
		
	}

}
