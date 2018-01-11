# 생활 코딩 java 정주행 season1 

🏃 🏃‍♀🏃 🏃‍♀🏃 🏃‍♀🏃 🏃‍♀🏃 🏃‍♀🏃 🏃‍♀🏃 🏃‍♀🏃 🏃‍♀🏃 🏃‍♀🏃 🏃‍♀🏃 



## 언어소개

=> 자바의 아버지? 

제임스 고슬링

=>SI?

system integration (기업의 업무 관리를 소프트웨어화)

한국에서는 정부나 기업의 SI 프로젝트가 대부분 자바로 구현!

=> Java의 특징

객체지향정도만!

자바 프로그램의 동작

=> 1. 코드 작성 ,    2.컴퓨터가 실행할 수 있는 형태로 코드를 컴파일 	

3. 컴파일된 프로그램을 실행



## java의 설치

Java SE(standard edition) : 자바의 표준안(소프트웨어 설계도)

JDK(java Development Kit) : java se의 표준안에 따라 만들어진 구체적인 소프트웨어

JRE(java runtime  environment): java로 만든 프로그램 구동을 위해 필요한 환경.

JVM: 자바가 실제로 구동하는 환경.

JDK - JRE - JVM 

![java1](img/java1)





![javaenv](C:\Users\Administrator\Desktop\java\javaenv.PNG)



dropbox를 사용하면

버전관리 용이- 버전 선택할  수 있음.



* Java cmd창 컴파일 오류 

미리 eclipse로 패키징이 되어있으면 

root디렉토리를 잘 찾아가야함. 프로젝트의 bin 파일이 있는 곳으로!

참고링크 : http://zeddios.tistory.com/41



## 개발도구와 이클립스

* 자바개발도구 이클립스 특징

콘솔에 표시되는 것 : 메인메소드 안에 있는 것.

패키지 : 디렉토리와 밀접한 관련

이클립스에서 save를 하면 자동으로 컴파일이 된다.



+참고ideone 

온라인에서 각종 프로그래밍 언어를 컴파일하고 또 공유할 수 있는 도구



## 변수

변수?

문자나 숫자같은 데이터를 담는 컨테이너

- 숫자
  - 정수? int
  - 실수? double
- 문자열? string



+자바스크립트에서는 어떤 변수의 선언도 가능하다. 따라서 웹페이지나 앱의 UI를 만들때는 자바스크립트 같이 관대한 언어 금융과학 관련은 java같이 엄격한언어



변수 왜써? 중복제거/가독성/유지보수



## 주석과 세미콜론

주석 : 코드나 설명 비활성화/프로그래밍적 해석 비활성화

+ 한줄주석 : //
+ 여러줄 주석 /* */
+ JavaDoc 주석 /** */

세미콜론 : 문장의 끝. 자바에서는 세미콜론을 사용하지 않으면 컴파일 에러가 발생.

세미콜론 이용시 여러개의 문장을 한줄에 표현

```java
int a = 100; double b = 10.1;
```



## 데이터 타입

+ 데이터의 크기

8bit(비트) = 1(바이트)

1024(바이트) = 1kilobyte..

bit < byte < kilobyte < megabyte < gigabyte<  terabyte < petabyte < exabyte < zettabyte

+ 정수형

  byte : -128 ~ 127(1 byte)

  short: -32.768 ~ 32.767(2 byte)

  int: 4byte

  long: 8byte

   +다 범위에 들어갈 수 있을 정도의 자료라면 int안에 넣는 것이 좋다.

     메모리 덜 차지

  +메모리의 크기 up to 데이터타입

+ 실수

  float(4byte)

  double(8byte)

+ 문자

  char(2byte)

  : 6글자는 12byte

# 상수의 데이터타입

상수 : 변하지 않는 값

int a = 1; (여기서 1이 상수)

double a  = 2.2;

float a = 2.2F;(f로 명시)

상수타입과 변수타입 맞춰주기

long a = 2147483648L;

byte a = 100;

short b = 200; 은 가능

# 형변환

형변환 : 데이터 타입을 변경하는 것

0000000 0000000 0000000 11001000(8 X 4 : 32 bit)

byte는 double로 형변환 가능 / double은 byte로 형변환 불가능(정보의 손실발생)

byte-> short/char -> int -> long -> float-> double

int a = 3;

float b = 1.0F;

double c = a + b;



# 연산자

연산자? 특정한 작업을 하기 위해서 사용하는 기호[작업의 종류에 따라]

1.대입연산자 =

2.산술연산자(+ - * / %)

3.비교연산자 : ==,  !=, >, <, equals(문자열비교)

```java
System.out.println(a == b);
//객체자체를 비교
System.out.println(a.equals(b));
//객체들 간의 값이 같은지 비교
```

4.논리 연산자

&&, ||, !

5.단항연산자 : 하나의 항을 대상으로 연산이 이루어지는 연산자

+:양수를 표현

-:음수를 표현

++: 증가연산자로 항의 값을 1씩 증가

i ++   => i = i + 1;

--:감소 연산자

연산자의 우선순위



## 조건문

조건문? 주어진 조건에 따라서 애플리케이션을 다르게 동작하도록 하는 것

```java

if(true/false){
}else if(true/false) {
}else {
}

```

## switch문

if문으로 완벽하게 대체가능

```java
switch(조건) {
case(조건) :
	실행됨.
break;
주어진 케이스가 없으면 default출력
```

+switch 문을 사용할 때 한가지 주의 할 것은 switch의 조건으로는 몇가지 제한된 데이터 타입만을 사용할 수 있다. byte, short, char, int, enum, String, Character, Byte, Short, Integer

## 논리 연산자

논리연산자는 비교문을 보완

&&(and), ||(or), !(not)



## 반복문

loop/iteration

* while문

  while(조건) {반복 실행 영역}

  for(초기화; 종료조건; 반복실행) 

  { 반복적으로 실행될 구문}

  ​

* 반복문의제어 

  break :  넘기고 다음구문

  continue : 멈추고 조건문으로 돌아 간다.



* 반복문의 중첩

  반복문 안에 반복문 가능

  변수, 반복문, 조건문, 연산자



## 배열

* 배열의 개념

연관된 정보를 그룹핑

1반 = {'최진혁', '최유빈', '이고잉'}

1반은 변수고, 최진혁, 최유빈, 이고잉 외 47명의 학생은 이 변수에 소속된 상수가 되는 것.



* 배열의 생성

```java
String[] classGroup = {"최진혁", "최유빈", "한이람", "이고잉"};
```



* 배열 : 제어(인덱스로)

  ![](img\array.PNG)



* 배열의 사용

  ```java
  String[] members = { "최진혁", "최유빈", "한이람" };
          for (int i = 0; i < members.length; i++) {
              String member = members[i];
              System.out.println(member + "이 상담을 받았습니다");
  ```

  반복문 + 배열 : 반복문을 통해서 배열 조합을 꺼낸다.

* foreach

  for(String e : members)

* 배열의 한계

  배열은 초기화할 때 그 크기가 정해짐. 따라서 예측이 틀리면 배열 지우고 다시 만들어야함.



반복문, 조건문, 변수, 상수

## 메소드

 '경제적 로직'형성을 위해 사용

* 메소드? 규칙 

  재활용성/ 입력과 출력

  ```java
   public static void numbering(int init, int limit) {
   //가변적인 부분을 없애고 고정적인 부분을 만들어야 매소드(규칙) 가능
          int i = init;
          while (i < limit) {
              System.out.println(i);
              i++;
          }
      }
      public static void main(String[] args) {
          numbering(1, 5);
      }
   
  }
  ```

  ​

* return

메소드 값을 돌려준다.(주의! return 값을 통해서 반환할 값의 데이터형식 명시해주어야함)

```java
public static String numbering(int init, int limit) {
		int i = init;
		String output = "";
		while(i < limit) {
			output += i;
			i ++;
		}
		return output;
	}	
```

return값 없으면 void

return값은 하나여야 한다.

## 입력과 출력

input/output

//java -cp bin org.opentutorials.javatutorials.method.InputDemo 1

args의 의미는 매개변수(입력값을 받는다)



eclipse run configuration을 통하여 argument가 입력된다.



* 앱이 실행중에 입력받기

```java
public static void main(String[] args) {
        try {
            File file = new File("out.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextInt()) {
                System.out.println(sc.nextInt()*1000); 
            }
            sc.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }    
    }
```













