package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class streamEx1 {

	public static void main(String[] args) {
		
		List<Integer> list 
				= Arrays.asList(1,2,3,4,5);
//				= new ArrayList<>();
//				  list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
				  list
				  .stream() //스트림생성
				  .filter(i->i%2==0) //중간단계
				  .forEach(i->System.out.println(i)); //생성
		
//		for (Integer i : list) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
	}

}
