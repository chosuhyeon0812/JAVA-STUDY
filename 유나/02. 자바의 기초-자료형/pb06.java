package jumptojava.ch03;

// 크기가 가변적으로 변하는 선형리스트 : 타입을 명시해주는 것이 좋음
import java.util.ArrayList;
// asList : 변경이 가능한 리스트 생성
import java.util.Arrays;
// 기존의 정렬 기준과 다른 정렬 기준으로 정렬하고자 할 때
import java.util.Comparator;

public class pb06 {
	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1,3,5,4,2));
		myList.sort(Comparator.reverseOrder());
		System.out.println(myList);
	}
}
