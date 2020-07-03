package com.icandothisallday2020.ex90kotlin

//코틀린 언어 기본문법
//***코틀린 문법 주요 특징
//*1. 문장의 끝을 나타내는 세미콜론(;)을 쓰지 않음(써도 되나 무시됨)
//*2. 변수를 만들때 자료형을 사용하지 않고 var 키워드 사용(단, 자료형은 존재, 자동 형변환 불가==정적타입언어)
//*3. 함수형 언어 :  함수를 객체처럼 사용(변수로 참조가능, 파라미터로 넘겨주는 작업가능) [객체지향 X]
//*4. 프로그램의 시작함수인  main 함수가 반드시 있어야
//*5. 함수를 정의할 때 리턴타입 위치에 fun 키워드(function) 사용

 fun main(){
     //화면 출력
     println("Hello Kotlin")
     println(10)
     println('A')
     println(true)
     println(5*3)
     //; 이 종료가 아니라 엔터가 종료

     //자료형과 변수
     //기본자료형 : Boolean, Char, Byte, Short, Int, Long, Float, Double, String, Any(Object - Java)
     //코툴인은 모든 변수가 기본적으로 객체 (모두 참조변수)

     //변수선언 문법 [ var ]
     var a=10//;이 없으므로 변수의 초기화가 없으면 ERROR
     var b=10.5
     var c=3.14f
     var d=true
     var e= 'a'
     var f="Hello"
     //대입될 때 자료형이 결정됨
     //변수이므로 값 변경 가능
     a=20
     b=20.5
     println(a)
     println(b)
     //초기화시 대입했던 자료형과 다른 자료형은 대입 불가

     //자동형변환 X --> 명시적 형변환  [ .toXXX() ]
     // **(Double)과 같은 문법은 X
     a=3.14.toInt()
     b=50.toDouble()
     println(a)
     println(b)

     //자료형을 변수선언시 명시 할 수 있음
     var g:Int =10//
     var h:Boolean//자료형을 명시하면 초기화 생략가능
     //println(h)//ERROR 초기화가 되어있지 않으면 사용 불가

     //+) 정수 표현식
     var i=10_000_000//보기 편하게

     //화면출력 format 만들기 [문자열 결합]
     println("이름" + "나이")
     //println(10+"dallars")//정수형이 결합연산자에의해 문자열이 되지 않음
     println(""+10+"dallars")//문자열이 먼저있으면 문자열 결합 연산 가능
     println(10.toString() + "dallars")

     var num1=50
     var num2=30
     println(""+num1 + "+" + num2 + "=" +(num1+num2))

     println("$num1 + $num2 = ${num1+num2}")//php 문법과 같이  $로 변수 구분

     var name="sam"
     var age=20
     println("이름 : $name \n 나이 : $age")

     //Any Type : [모든 타입]
     var j: Any
     j=10
     println(j)
     j=10.8
     println(j)
     j='A'
     println(j)
     j=true
     println(j)
     //단 자료형을 특정하기 어려울 때만 Any 타입을 쓰는 것이 좋음(가급적 사용 자제)

     //null
     var k=null
     println(k)
     //자료형을 명시하면 null 값 지정 불가
     //var l:String=null//ERROR
     //null 저장도 가능하다는 명시적 표기가 있어야 가능
     var m:String? =null // [ ? ]가 변수명에 있으면 null 값 저장도 가능
     println(m)

     //상수 [ val ] (value)
     val M=10 // M의 값을 바꿀 수 없는 상수
     val K:Int//단 상수값 지정시 명시적 자료형을 사용하면
     K=50//다음 줄에서 값 대입가능

     //연산자
     //숫자타입간 - 자동형변환 가능[작은 수의 자료형->큰 수 자료형]
     println(10+3.14)//10(Int)->10.0(Double)
     //println(10+true)ERROR
     //println(10+'A')ERROR






     //is 연산자
     var n=10
     if( n is Int){
         println("${n}은 정수입니다.")
     }
     //다른 자료형 검사는 에러
     //if(n is String){ERROR    }
     //유일하게 Any 타입일 때 사용
     var obj:Any
     obj=10.5
     if(obj is Int) println("${obj}는  Int")
     if (obj is Double) println("${obj}는 Double")

     //사용자 정의 클래스 ≒자바의 instanceOf
     class Person{
         //코틀린에서는 멤버변수를 속성[Property]라고 명명
         //※일반변수와 다르게 Property 는 반드시 초기화 되어 있어야 함(null 값을 가질 수 없음)
         var name="sam"
         var age:Int=20
     }

     var p=Person()//new 키워드로 생성 X-new 키워드 없음
     if(p is Person){
         println(p.name + "  "+ p.age)
         println("이름 : ${p.name} \t 나이 : ${p.age}")
     }

     obj = Person() //객체 생성
     if(obj is Person){
         println("obj is Person")
     }






     //제어문
     //var o=(10>5)? "BIG" : "small"--ERROR//삼항연산자 없음
     //대신 if문 을 삼항 연산자(조건 연산문)처럼
     var str=if(10>5) "aaa" else "bbb"//if-else 문을 값 대입에 활용
     println(str)

     str= if (10>5){
         "A"
         println("wow")
         "K"//중괄호 내에 여러개가 있으면 마지막 값이 들어감
     }else{
         "B"
     }
     //이런 특징으로 인해 if 문을 코틀린에서는 제어문이 아닌 if 표현식이라고 함

     //switch 문법 없음 [ when ]
     var r=30
     var q:Any? = null
     q=17
     when(q){
         10-> println("10이다")
         17-> println("17이다")
         20-> println("20이다")
         "Hello"-> println("안녕하세요")//자료 형이 다른 것도 동시 체크 가능
         true-> println("아 진짜?")
         r-> print("30이다")
         //두개 이상의 조건을 묶을 수도 있음
         40,50-> println("중년이다")
         else -> {//default 같은 역할
             println("blahblahblah")
             println("bowowbowowbo")
         }
     }
     //when 을 특정 수식으로 제어 가능
     n=85
     when{//수식 비교시에는 ()가 없어야 함
         n>=90 && n<=100 -> println("A학점")
         n>=80 -> println("B학점")
         n>=70 -> println("C학점")
         else -> println("F학점")
     }
     q=20
     var result = when(q){
         10-> "Hello"
         20-> "Nice"
         else -> "Perfect"//값 대입시엔 반드시 else 문이 있어야 함
     }
     println(result)

     //when 에서 is 연산자도 사용 가능
     when(q){
         is Int-> println("Int")
         is Double -> println("Double")
         is Person -> println("Person")
     }

     //반복문 [ for - each 문과 비슷]
    //for(var i=0;i<10;i++){}--이런 표기 X
     for (i in 0..5){
         println(i)//i는 제어변수이자 for 문의 지역변수
     }
     println()
     for ( a in 3..10 ){//a는 저 위의 변수 a가 아님
         println(a)
     }
     println()
     for (i in 0 until 10){
         println(i)
     }
     println()

     //2씩 증가 [ step ]
     for (i in 0..10 step 2){
         println(i)
     }
     println()

     //감소 [ downTo ]
     for (i in 10 downTo 0){
         println(i)
     }
     println()

     //값을 2씩 감소
     for (i in 10 downTo 0 step 2){
         println(i)
     }
     println()

     //배열 Array- 생성방법이 달라짐
     var arr= arrayOf(10,20,30)
     println(arr[0])
     println(arr[1].toString()+"\t"+arr[2])

     //값 변경
     arr[0]=100
     println(arr[0])

     //배열의 특이점
     // List 와 같이 get(), set() 메소드 보유
     println(arr.get(0))
     arr.set(1,200)//1번 index 에 200 설정
     println(arr.get(1))
     //배열의 길이
     println("배열의 길이 ${arr.size}")//ArrayList 와 유사
     //한꺼번에 출력(출력 반복문)
     for (n in arr){//for-each 와 유사--요소값 출력
         println(n)
     }
     println()

     for( i in arr.indices){//인덱스값 출력
        println(i)
     }
     println()

     for( i in arr.indices){//인덱스값 & 요소값 출력
         println(""+i+" : "+arr[i])
     }
     println()

     //***인덱스 & 요소값
     for ((i,v)in arr.withIndex()){
         println("[$i] : $v")
     }
     println()

     //배열값 넣을 때 자료형을 명시하지 않으면 자동 Any 타입
     var arr2= arrayOf(10,"hello",3.14)
     for(t in arr2){
         println(t)
     }
     println()

     arr2[0]="Twenty"
     arr2[1]=20//Any 타입 이기에 String 이 저장되어있던 곳에 정수 저장 가능
     //단, 배열의 타입지정도 가능
     var arr3=arrayOf<Int>(10,20,30)//<Generic>으로 타입 지정
     //타입을 지정하면 다른 자료형과 함께 사용불가
     //var arr4= arrayOf<Int>(10,"Hi",true)//ERROR

     //명시적으로 타입을 지정하는 배열을 만드는 다른 방법
     var arr5= intArrayOf(1,2,3)
     var arr6= doubleArrayOf(1.1,2.2,3.3)//단, String 은 없음
     //초기값없이 null 값으로 배열 만들기
     var arr7= arrayOfNulls<Any>(5)
     for (t in arr7){
         println(t)
     }
     println()

     //배열 변수를 상수로 만들기
     val arr8= arrayOf(10,20,30)
     arr8[0]=100//값은 변경 가능 but
     //arr8=arrof(100,200,300)//다른 배열 참조 불가
     //ArrayList 만들기[배열요소의 추가, 삭제 기능]
     val arrayList= arrayListOf(10,"Hello",true)
     for(e in arrayList){
         println(e)
     }
     arrayList.add(0,"Nice")
     for (e in arrayList){
         println(e)
     }
     println()
     //처음 기존에 넣었던 자료형 외에는 추가 불가
     arrayList.add(100)
     arrayList.add(false)
     //arrayList.add(3.14)--ERROR
     //삭제
     arrayList.removeAt(0)//인덱스 번호로 삭제
     arrayList.remove(100)

     //set,get
     println("요소 개수 : ${arrayList.size}")
     arrayList.set(0,20)
     println("0번 요소값  : ${arrayList.get(0)}")
     println()
     //2차원 배열
     val arrays= arrayOf(arrayOf(10,20,30), arrayOf("hi","bye"), arrayOf(true,false))
     for (ar in arrays){
         for (e in ar){
             print(e)
             print(",")
         }
         println()
     }



     //***함수
     //기본 함수 호출(리턴 X , 파라미터 X)
     show()

     //####파라미터 전달하면서 함수 호출
     output(100,"Hello")

     //리턴받기
     var sum= add(5,3)
     println("sum : ${sum}")

     //+++참고
     var x= display()
     println(x)//자료형 kotlin.Unit


 }//main 함수

//***에서 호출하는 함수 - 함수 정의시 무조건 fun 키워드 사용
fun show(){
    println("show function")
    println()
}

//####파라미터 전달: 매개변수에는 var 키워드 사용X [변수명 : 자료형형]
fun output( a : Int, b : String){
    println(a)
    println(b)
    println()
}


//리턴하기 [리턴타입을 함수()와 {} 사이에 :작성]
fun add(x:Int ,y:Int):Int {
    return x+y
}

//+++참고 [리턴타입이 없으면 void 가 아닌 Unit 타입]
fun display(){
    println()
}

//Run *.kt [ Ctrl + Shift + F10 ]