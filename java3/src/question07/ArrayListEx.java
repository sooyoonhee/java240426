package question07;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			String nameValue=scanner.next();
			name.add(nameValue);
			if (i==3) {
				for (int j = 0; j < name.size(); j++) {
					System.out.print(name.get(j)+" ");						
				}
			}	
		}
		int longestIndex=0;
		for (int i = 0; i < name.size(); i++) {
//			name.get(0).length()<name.get(0).length()
//			name.get(0).length()<name.get(1).length()=>참이면 longextIndex=i
//			name.get(0 or 1).length()<name.get(2).length()=>참이면 longextIndex=i
//			name.get(0 or 1 or 2).length()<name.get(3).length()=>참이면 longextIndex=i
			if (name.get(longestIndex).length()<name.get(i).length()) {
				longestIndex=i;
			}
		}
		System.out.println("\n가장 긴 이름은 : "+name.get(longestIndex));
		scanner.close();
	}
}
//		System.out.println();

//		String str=name.get(0);
//		int longger =str.length();
//		String longName=name.get(0);
//		
//		for (int i = 1; i < name.size(); i++) {
//			str=name.get(i);
//			int nameLenght =str.length();
//			if (longger<nameLenght) {
//				longger=nameLenght;
//				longName=name.get(i);
//			}
//		}
//		System.out.println("가장 긴 이름은 : "+longName);

