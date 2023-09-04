# 01. 자바 시작하기
# 01-01. 자바 코드의 구조
## 일반적인 자바 코드
```java
/* 클래스 블록 */
public class 클래스명 {
    /* 메서드 블록 */
    [public|private|protected] [static] (리턴자료형|void) 메서드명1 (입력자료형 매개변수, ...) {
        명령문(statment);
        ...
    }

    /* 메서드 블록 */
    [public|private|protected] [static] (리턴자료형|void) 메서드명2 (입력자료형 매개변수, ...) {
        명령문(statment);
        ...
    }
    ...
}
```

- 클래스 블록 : 자바 코드의 가장 바깥쪽 영역
    - 클래스명 : 사용자 마음대로 작성 가능. 단, 클래스명 == 소스파일의 이름(클래스명.java)
    - 클래스 블록은 여러 메서드 블록을 포함
- 메서드 블록
    -  [public|private|protected] : public, private, protected가 오거나 아무것도 오지 않을 수 있음
    - public, private, protected는 메서드의 접근 제어자
    - [static] : static 키워드가 올 수도 있고 오지 않을 수도 있다는 의미. static 키워드가 붙으면 static 메서드가 된다.
    - (리턴 자료형|voude) : 메서드가 실행된 후 리턴되는 값의 자료형
        - 리턴값이 있을 경우에는 반드시 리턴 자료형을 표기
        - 리턴값이 없는 경우라면 void를 표기
        - void 또는 리턴 자료형이 반드시 있어야 한다.
    - 메서드명은 자유롭게 지을 수 있음.
    - 메서드명 뒤에 이어지는 (입력자료형, 매개변수 등)은 메서드의 입력 인자 -> '입력자료형 + 매개변수형' 형태, 개수에 제한은 없다.

## 속성과 생성자
```java
public class Sample {
    /* 속성*/
    private Sting message;

    /* 생성자 */
    public Sample(String message) {
        this.message = message
    }
}
```
속성 : 클래스의 상태를 나타내는 변수, 클래스 내부에 선언  
생성자 : 클래스 인스턴스를 생성할 때 실행되는 메서드, 주로 속성을 초기화하는 용도로 사용

## 자바 코드의 예
```java
public class Sample {
    public static void main(String[] args) {
        System.out.println("Hello java");
    }
}
```
### 클래스 블록
자바의 가장 바깥쪽 영역인 클래스 블록, 중괄호로 영역 구분
```java
public class Sample {
    (...)
}
```
클래스명 : Sample  
접근 제어자 public : 어디서든 이 클래스에 접근할 수 있음을 의미  
class: 클래스 블록을 만드는 키워드

### 메서드 블록
클래스 블록 내에 존재, 중괄호로 영역 구분
```java
public class Sample {
    public static void main(String[] args)
    (...)
}
```
메서드명 : main  
클래스 블록 내에 여러개 존재 가능  
- static: 메서드에 static 키워드가 붙으면 클래스 메서드가 되어 객체를 만들지 않아도 '클래스명.메서드명' 형태로 호출 가능
- void : 메서드의 리턴 자료형으로, void는 리턴값이 없음을 의미
- String[] args : 메서드의 매개변수로, args 변수는 String[] 배열 자료형임을 의미
    - args는 argement의 줄임말로, 인수를 의미. 다른 이름 사용 가능

### 명령문
메서드 블록 내의 명령문(statment)
```java
public class Sample{
    public static void main(String[] args) {
        System.out.println("Hello java");
    }
}
```
**명령문은 반드시 세미콜론(;)을 붙여 문장이 끝났다는 것을 표시해야한다.**  
메서드 블록 안에는 명령문이 여러 개 있을 수 있음

![image](https://github.com/YUNA-AHN/JAVA-STUDY/assets/130244216/3aea9262-3de3-4877-a4e4-fe9fa8a55ee5)


### 이것이 자바다 참고
패키지 선언 코드
```java
package ch01.sec09;

// 클래스 선언, 클래스명=소스파일명 -> Hello java
public class Hello {
	// 클래스 블록
	// main 메소드 선언 , main: 메소드명
	public static void main(String[] args) {
		// 메소드 블록
		System.out.println("Hello, Java");

	}

}
```

이와 같은 코드를 패키지 선언이라고 부름
- 소스 파일의 위치 : src/ch01/sec09 패키지
- 컴파일 후 생성되는 바이트 코드 파일 위치 : bin.ch01/sec09 패키지
- 클래스 선언 : public class Hello
    - 클래스명 : Hello
        - 숫자로 시작할 수 없고, 공백 미포함
        - 소스 파일명과 대소문자가 완전히 일치해야한다
    - 클래스 블록: 중괄호 {...}에 해당하는 부분, 클래스의 정의 내용 작성
    - 메소드 선언 : public static void main(String[] args) 
        - 메소드명 : main()
        - 메소드 블록 : 중괄호 {...}에 해당하는 부분
        - 바이트코드 파일 실힝 시 main() 메소드 블록이 실행
        - main() 프로그램 실행 진입점(entry point)
- Condole 뷰에 출력하는 코드 : System.out.println("Hello, Java");

# 01-02. 변수와 자료형
## 변수 (Varivale)
- 값을 대입하여 사용할 수 있음
- 하나의 값을 저장할 수 있는 메모리 번지에 붙여진 이름  
- 변수를 통해 프로그램은 메모리 번지에 값을 저장하고 읽을 수 있다.

변수 선언
- 어떤 타입의 데이터를 저장을 할 것인지, 변수 이름이 무엇인지를 결정하는 것

```java
int a;
String b;
```
변수 이름 규칙
1. 변수명은 숫자로 시작할 수 없다.
2. _와 $ 이외의 특수 문자는 사용할 수 없다.
3. int, class, return 등의 자바의 키워드는 변수명으로 사용할 수 없음

+) 캐멀 스타일  
여러 단어를 혼합하여 명명하는 경우, 낙타의 등처럼 대소문자가 섞여있도록 작성하는 스타일, 자바 소스 파일명과 변수명 작성시 관례식으로 사용   
1. 자바 소스 파일명(클래스명)은 대문자로 시작하는 것이 관례
    - Week.java
    - MemberGrade.java
    - ProductKind.java

변수명을 잘못한 예
```java
int lst; // 변수명은 숫자로 시작할 수 없다.
int a#; // 변수명에 특수 문자를 사용할 수 없다.
int class; // 키워드를 변수명으로 사용할 수 없다.
```

자바의 키워드
```
abstract  continue  for         new        switch
assert    default   goto        package    synchronized
boolean   do        if          private    this
break     double    implements  protected  throw
byte      else      import      public     throws
case      enum      instanceof  return     transient
catch     extends   int         short      try
char      final     interface   static     void
class     finally   long        strictfp   volatile
const     float     native      super      while

```

## 자료형
int, String 등 변수의 자료형
```java
int a;  // 변수 a의 자료형은 int이다.
```
a라는 변수에는 int 자료형 값으로 1, 10, 25 등의 정수만 담을 수 있따.

```java
String b;  // 변수 b의 자료형은 String이다..
```
b라는 변수에는 STring 자료형 값으로 'a', 'hello'등의 문자열만 담을 수 있다.

## 변수에 값 대입하기
변수를 선언한 후에는 = 기호를 사용해 변수에 값을 대입할 수 있다.  
= 은 대입 연산자(assignment operator)fkrh gksek.
```java
int a;
Sring b;

a = 1; // int 자료형 변수 a에 1이라는 값을 대입
b = "hello java"; // String 자료형 변수 b에 'hello java"라는 값을 대입
```
변수 선언과 값 대입 동시에 가능
```java
int a = 1;
String  b= "hello java";
```

## 자주 쓰이는 자료형
- int
- long
- double
- boolean
- char
- String
- StringBuffer
- List
- Map
- Set
```java
StringBuffer sb; // sb 변수의 자료형은 StringBuffer
List myList; // mylist 변수의 자료형은 List
```

## 사용자 정의 자료형
사용자가 직접 자료형을 만들수도 있음
```java
class Animal{
}
```
Animal이란 자료형의 변수를 만들 수 있음
```java
Animal cat; // cat 변수의 자료형은 Animal아며, cat 변수엔 Animal 자료형에 해당하는 값만 대입 가능
```

# 01-03. 이름 짓는 규칙
## 클래스 이름 짓기
1. 클래스명은 명사로 한다.
2. 클래스명은 대문자로 시작한다.
3. 여러개의 단어를 좋바하여 만들 경우 각 단어의 첫 번째 글자는 대문자이어여 한다.(pascal case)

```java
class Cookie {}
class ChocoCookie {}
```

## 메서드 이름 짓기
1. 메서드명은 동사로 한다.
2. 메서드명은 소문자로 시작한다.
3. 여러개의 단어를 조합하여 만들 경우 맨 첫글자를 제외한 나머지 단어의 첫 글자는 대문자를 써서 구분한다(camel case)
```java
run();
runFast();
getBackground();
```

## 변수 이름 짓기
1. 짧지만 의미가 있어야 한다. 변수명만 봐도 사용 이유를 알 수 있어야 함.
2. 순서를 의미학 임시로 쓰이는 정수의 변수명은 i, j, k, m, n 사용한다. 문자의 경우 c, d, e 등을 사용한다.
3. 변수명에 _, $ 사용할 수 있으나 지양할 것

```java
String userName;
float lineWidht;
int i; // 주로 반복문에 사용
char c;
```

# 01-04. 주석 (comment)
프로그래머의 의견이나 코드의 설명을 적는 것

## 블록 주석 : /* */
코드의 블록 단위(클래스, 메서드 등)로 설명할 때 주로 사용한다.

```java
/*
프로그램의 저작권

이 프로그램의 저작권은 홍길동에게 있습니다.
Copyright 2013.
*/
public class MyProgram {
    ...
```

## 라인 주석 : //
시작된 곳부터 그 라인의 끝까지. 특정 코드 한 줄을 설명할 때 사용
```java
int age; // 동물의 나이
```

## 주석 올바르게 사용하기
1. 누구나 알 만한 내용의 주석
2. 코드와 주석의 업데이트는 항상 같이
3. 임시 백업을 위한 주석을 활용하자
