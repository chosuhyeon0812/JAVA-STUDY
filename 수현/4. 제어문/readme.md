#### **1\. if 문**

**1) if 문과 else 문의 기본 구조**

\- if 문 : 주어진 조건이 참일 때 실행되는 코드

\- else 문: if 문의 조건이 거짓일 때 실행되는 코드

```
if (조건문) {
	<수행할 문장>;
    <수행할 문장2>;
} else {
	<수행할 문장3>;
    <수행할 문장4>;
}
```

**2) 비교 연산자**

| 비교 연산자 | 설명 |
| --- | --- |
| x <  y | x가 y보다 작다 |
| x > y | x가 y보다 크다 |
| x == y | x와 y가 같다 |
| x != y | x와 y가 같지 않다 |
| x >= y | x가 y보다 크거나 같다 |
| x <= y | y사 x보다 크거나 같다 |

```
// 돈이 3000원 이상 있으면 택시, 아니면 걷기
int money = 2000;
if (money > 3000) {
    System.out.println("택시");
} else {
    System.out.println("걷기");
}
 // 걷기
```

**3) and, or, not 연산자**

| 연산자 | 설명 |
| --- | --- |
| x && y | x와 y 모두 참이어야 참 |
| x \|\| y | x와 y 둘 중에서 적어도 하나가 참이면 참 |
| !x | x가 거짓이면 참 |

```
// 카드가 있거나 돈이3000원 이상 있으면 택시, 아니면 걷기
int money = 2000;
boolean card = true;
if (money > 3000 || card) {
    System.out.println("택시");
} else {
    System.out.println("걷기");
}

// 택시
```

**4)  contains**

\- 해당 아이템이 있는지 조사하는 메서드 / 조건문에 많이 활용된다

```
import java.util.ArrayList;

public class money {
	public static void main(String[] args) {
	ArrayList<String> pocket = new ArrayList<String>();
	pocket.add("paper");
	pocket.add("cellphone");
	pocket.add("money");
	
	if (pocket.contains("money")) {
		System.out.println("택시를 타고 가라");
	} else {
		System.out.println("걸어가라");
	}
	
	}
}

// 택시를 타고 가라
```

**5) else if**

\- 있다와 없다중에 없을 경우 다시 경우를 나누어주는 조건문에 해당한다

(if, else가 여러번 사용되어 한 번에 이해하기가 쉽지 않고 산만한 느낌이드느데... 이를 보완하기 위해서... 자바는 여러 조건을 판단할 수 있게 하는 else if 문이 있다)

```
package test;
import java.util.ArrayList;

public class money {
	public static void main(String[] args) {
	boolean hasCard = true;
	ArrayList<String> pocket = new ArrayList<String>();
	pocket.add("paper");
	pocket.add("cellphone");
	
	if (pocket.contains("money")) {
		System.out.println("택시를 타고 가라");
	} else {
		if (hasCard) {
			System.out.println("택시를 타고 가라");
		}else {
			System.out.println("걸어가라");
		}
	}
	
	}
}

// 택시를 타고 가라
```

아래 else if 부분들을 수정하면 조금 간단하게 나타내면 아래로 나타내질 수 있다 / else if는 개수제한 없이 사용 가능

```
	if (pocket.contains("money")) {
		System.out.println("택시를 타고 가라");
	}else if (hasCard) {
		System.out.println("택시를 타고 가라");
	}else {
		System.out.println("걸어가라");
	}
```

#### **2\. switch / case 문**

: if 문과 비슷하지만 좀 더 일정한 형식이 잇는 조건문..

\=> 입력 변수의 값과 일치하는 case 입력값(입력값1, 입력값2,....) 이 있다면 해당 case 문에 속한 문장들이 실행된다...

  break 문 또한 존재(해당 case문을 실행한 뒤 swirch 문을 빠져나가기 위함), break 문이 없다면, 다음 case로 이동

```
package test;
import java.util.ArrayList;

public class money {
	public static void main(String[] args) {
		int month = 8;
		String monthString = " ";
		switch(month) {
		case 1: monthString = "January";
		break;
		case 2: monthString = "February";
		break;
		case 3: monthString = "March";
		break;
		case 4: monthString = "April";
		break;
		case 5: monthString = "May";
		break;
		case 6: monthString = "June";
		break;
		case 7: monthString = "July";
		break;
		case 8: monthString = "August";
		break;
		case 9: monthString = "September";
		break;
		case 10: monthString = "October";
		break;
		case 11: monthString = "November";
		break;
		case 12: monthString = "December";
		break;
		default: monthString = "Invalid month";
		break;
		}
		System.out.println(monthString);
	}
}
```

해당하는 숫자에 대한 case가 실행되었다!!

만약 month가 1에서 12사이의 숫자가 아닌 다른 값이 저장되어 있다면 defaul: 문장이 수행된다!

값이 정형화되어 있는 경우 if 문보다는 switch/case 문을 쓰는 것이 코드의 가독성이 좋다!!

#### **3\. while 문**

: 조건문이 참인 동안 수행할 문장들을 반복해서 수행한다

```
package test;

public class tree {
	public static void main(String[] args) {
		int treeHit = 0;
		while (treeHit < 10) {
			treeHit++; // treeHit += 1; 로도 표현가능
			System.out.println("나무를 " + treeHit + "번 찍었습니다.");
			if (treeHit == 10) {
				System.out.println("나무 넘어갑니다.");
			}
		}

	}
}

/*
나무를 1번 찍었습니다.
나무를 2번 찍었습니다.
나무를 3번 찍었습니다.
나무를 4번 찍었습니다.
나무를 5번 찍었습니다.
나무를 6번 찍었습니다.
나무를 7번 찍었습니다.
나무를 8번 찍었습니다.
나무를 9번 찍었습니다.
나무를 10번 찍었습니다.
나무 넘어갑니다.
*/
```

while문의 조건문 : treeHit < 10 (10보다 작은 동안 수행) / +1 커지면서 수행하고 / 10이 되면서 종료.. while 문 빠져나옴

**1) 무한 루프**

: 무한하게 while 문 내의 문장들을 수행... 빠져나오지 못한다...

```
package test;

public class loop {
	public static void main(String[] args) {
		while (true) {
			System.out.println("Ctrl-C를 눌러야 while문을 빠져나갈 수 있습니다.");
		}
	}
}

/*
Ctrl-C를 눌러야 while문을 빠져나갈 수 있습니다.
Ctrl-C를 눌러야 while문을 빠져나갈 수 있습니다.
Ctrl-C를 눌러야 while문을 빠져나갈 수 있습니다.
...
*/
```

\[Ctrl\] + \[c\] : 종료

**2) while 문 빠져나가기 - break**

: while 문을 강제로 멈춰야 할 때 사용한다

```
package test;

public class loop {
	public static void main(String[] args) {
		int coffee = 10;
		int money = 300;
		
		while (money > 0) {
			System.out.println("돈을 받았으니 커피를 줍니다.");
			coffee--;
			System.out.println("남은 커피의 양은 " + coffee + "입니다.");
			if (coffee == 0) {
				System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
				break;
			}
		}
	}
}

/*
돈을 받았으니 커피를 줍니다.
남은 커피의 양은 9입니다.
돈을 받았으니 커피를 줍니다.
남은 커피의 양은 8입니다.
돈을 받았으니 커피를 줍니다.
남은 커피의 양은 7입니다.
돈을 받았으니 커피를 줍니다.
남은 커피의 양은 6입니다.
돈을 받았으니 커피를 줍니다.
남은 커피의 양은 5입니다.
돈을 받았으니 커피를 줍니다.
남은 커피의 양은 4입니다.
돈을 받았으니 커피를 줍니다.
남은 커피의 양은 3입니다.
돈을 받았으니 커피를 줍니다.
남은 커피의 양은 2입니다.
돈을 받았으니 커피를 줍니다.
남은 커피의 양은 1입니다.
돈을 받았으니 커피를 줍니다.
남은 커피의 양은 0입니다.
커피가 다 떨어졌습니다. 판매를 중지합니다.
*/
```

돈이 0보다 클때동안 진행하다... 0이 되어버리면 출력후 break가 호출되어 while 문을 빠져나간다

**3) while 문으로 돌아가기 - continue**

: while 문 안의 문장을 수행할 때 어떤 조건을 검사해서 참이 아닌 경우 while 문을 빠져나가는 대신 while 문의 맨 처음, 즉 조건문으로 돌아가게 하고 싶은 경우 continue를 사용(빠져나가지 않고 다시 올라가서 진행)

```
package test;

public class loop {
	public static void main(String[] args) {
		int a = 0;
		while (a < 10) {
			a++;
			if (a % 2 == 0) {
				continue; // 짝수인 경우 조건문으로 돌아간다.
			}
			System.out.println(a); // 홀수만 출력된다
		}
	}
}

/*
1
3
5
7
9
*/
```

a가 짝수이면 continue문이 실행되어 while 문의 맨 처음으로 돌아가게 한다!! 

그러므로 a가 짝수이면 System.out.println(a)는 수행되지 않기 때문에 홀수만 출력될 것이다!!!!

#### **4\. for 문**

: 문장을 반복해서 수행해야 할 경우에 사용

1) for 문의 기본 구조

```
// 기본 구조
for (초깃값; 조건문; 증갓값) {
	...
}

/////
String[] numbers = ["one", "two", "three"]
for (int i = 0; i < numbers.length; i++) :
	System.out.println(numvers[i]);
}
/*
one
two
three
*/
```

i의 초깃값은 0, 조건문은 i < numbers.length, 증갓값은 i++이 된다!!

\=> i 값이 numbers의 개수보다 작은 동안 계속 i 값을 1씩 증가시키며 for 문의 문장들을 수행

**2) for 문으로 돌아가기 - continue**

: while 문과 마찬가지로 적용!

```
int[] marks = {90, 25, 67, 45, 80};
for (int i = 0; i < marks.length; i++) {
	if (marks[i] < 60) {
    	continue; // 조건문으로 돌아간다.
    }
    System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
}

/*
1번 학생 축하합니다. 합격입니다.
3번 학생 축하합니다. 합격입니다.
5번 학생 축하합니다. 합격입니다.
*/
```

점수가 60점 미만이면 continue문이 실해되어 축하메시지를 출력하는 부분이 수행하지 않고, 

for 문의 첫부분으로 돌아갑니다!!!

\=> 반복문을 수행할 때, 특정 조건에서는 수행하지 않고 건너뛰어야 할 때 사용합니다!!!!

**3) 이중 for 문**

: for 문을 두번 사용한 것..

```
// 구구단 만들기
package test;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=2; i < 10; i++) {
			for (int j=1; j <10; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println(""); // 줄을 바꾸어 출력하는 역할을 한다
		}
	}
}

/*
2 4 6 8 10 12 14 16 18 
3 6 9 12 15 18 21 24 27 
4 8 12 16 20 24 28 32 36 
5 10 15 20 25 30 35 40 45 
6 12 18 24 30 36 42 48 54 
7 14 21 28 35 42 49 56 63 
8 16 24 32 40 48 56 64 72 
9 18 27 36 45 54 63 72 81 
*/
```

단이 바뀔때 println을 사용하여 줄바꿈하여 문자를 출력하였다!!

5\. for each 문

: 이전에 배웠던 for문을 활용한 예제(첨봄)

```
// for each 문의 구조
for (type 변수명: iterate) {
	body-of-loop
}
```

iterate는 루프를 돌릴 객체이고 iterate 객체에서 한 개씩 순차적으로 변수명에 대입되어 for 문이 수행된다...

iterate에 사용할 수 있는 자료형은 **루프를 돌릴 수 있는 자료형(배열이나 ArrayList등)만** 가능하다...

**\+ 변수명의 type(자료형)은 iterate 객체에 포함된 자료형과 일치**해야한다!!!

```
String[] numbers = {"one", "two", "three"};
for(int i = 0; i < numbers.lengh; i++) {
	System.out.println(numbers[i]);
}

// for each 문을 사용한다면...
String[] numbers = {"one", "two", "three"};
for(String number: numbers) {
	System.out.println(number);
}
```

문제...

1\. everywhere

2\. i % 3 == 0

3\. i >5 / int j=0; j <5; j++;

4\. int i = 1; i < 101; i++;

5\. int mark: marks / total / marks.length;
