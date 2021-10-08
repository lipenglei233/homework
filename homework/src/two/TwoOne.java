package two;
import java.util.*;

public class TwoOne {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int yourNum,pcNum;
		Random r = new Random();
		HashMap map = new HashMap();
		map.put(0,"剪刀");
		map.put(1,"石头");
		map.put(2,"布");
		
		while(true) {
			System.out.println();
			System.out.println("请输入一个0~2的数字");
			yourNum = input.nextInt();
			if(yourNum < 0 || yourNum > 2) {
				System.out.println("输入有误，请重新输入");
				continue;
			}else {
				pcNum = r.nextInt(3);
				if(yourNum == pcNum) {
					System.out.println("你选择了："+map.get(yourNum)+",电脑选择了："+map.get(pcNum)+",平局");
				}else if(yourNum == 2 && pcNum == 0) {
					System.out.println("你选择了："+map.get(yourNum)+",电脑选择了："+map.get(pcNum)+",电脑胜");
				}else if(yourNum == 0 && pcNum == 2) {
					System.out.println("你选择了："+map.get(yourNum)+",电脑选择了："+map.get(pcNum)+",你胜");
				}else if(yourNum > pcNum) {
					System.out.println("你选择了："+map.get(yourNum)+",电脑选择了："+map.get(pcNum)+",你胜");
				}else {
					System.out.println("你选择了："+map.get(yourNum)+",电脑选择了："+map.get(pcNum)+",电脑胜");
				}
			}
		}
		
		
		
	}

}
