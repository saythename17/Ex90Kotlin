package com.icandothisallday2020.ex90kotlin

fun main(){
    //1. 클래스 선언 및 객체 생성 : new 키워드 없음
    var obj=MyClass()
    obj.show()
    //1.1 다른 .kt 파일에 class 만들기 [.kt]
    var obj2=TestKtClass()
    obj2.show()


    //2. 생성자;;;
    //Kotlin 에서는 생성자가 두종류가 있음
    // 주생성자 , 보조 생성자
    //2.1 주생성자 [ Primary Constructor ]
    var s=Simple()//생성자 호출

    //2.2 주생성자의 목적(대부분 파라미터를 전달받아 값 저장)
    //주생성자에 값 전달하기 [ 오버로딩 불가 ]
    var s2=Simple2(10,20)
    s2.show()

    //2.3 만약 생성자 오버로딩을 구현하고 싶다면
    //보조생성자 활용[c,java 와 가장 흡사]
    var s3=Simple3()
    //보조생성자만 구현해도 주 생성자는 원래부터 존재
    var s4=Simple3(100)//오버로딩 함수 호출

    //2.4 주생성자 & 보조생성자 동시사용 [ 주 생성자를 만들어 놓고 나중에 오버로딩 할 때 ]
    var s5=Simple4()// 주생성자 호출
    var s6=Simple4(200)//오버로딩된 보조생성자 호출

    //****
    var s7=Simple5()


}













//클래스 선언 [ Field(멤버변수)를 Property(속성)이라고 함 ]
class MyClass{
    //Property- 반드시 초기화 되어있어야 함
    var a :Int = 0;
    //메소드 : Method(class 안에있으면 method , class 밖에 있으면 함수)
    fun show(){
        println("show : $a")
        println()
    }

}

//2.1 Primary Constructor : 클래스명 옆 constructor() 명시
//주생성자는 {}가 없기에 코드작성 불가
class Simple constructor(){
    init {//주생성자를 위한 별도 초기화 블럭
        println("Simple's Primary Constructor")
        println()
    }
}

//2.2주생성자 파라미터 받기
class Simple2 constructor(var num:Int, num2:Int){//var 키워드를 사용-> num : property 로 저장
    //var 키워드가 없는 num2 는 매개 변수==지역변수
    init {
        println("Simple2 생성")
        println("num : $num")//멤버변수
        println("num2 : $num2")//매개변수
    }

    fun show(){
        println("show method num : $num")//num : property
//        println("show method num2 :$num2")//ERROR---num2 : 생성자의 지역 변수
        println()
    }

    //멤버변수에 매개변수 값을 대입- 생성자 블럭에서 하지 않아도 됨
    var n:Int =num2//변수 대입하듯 주생성자의 매개변수 대입가능
}

//2.3 보조 생성자
class Simple3{//클래스 안에 construct() 블럭 구현
init {
    println("여기는 객체 처음 만들 때 무조건 실행")
}
    //보조생성자
    constructor(){
        println("Simple3 의 Secondary 생성자")
        println()
    }
    //보조 생성자는 오버로딩 가능 [보조생성자 var 키워드로 한번에 Property 를 만들 수는 없음]
    constructor(num: Int){
        println("Simple3 의 Secondary 생성자 : $num")
        println()
    }
}


//2.4 주생성자+보조 생성자
class Simple4 constructor()/*called*/{
    init {
        println("Simple4 init-s5")
        println()
    }
    //보조생성자를 추가하고 싶다면 명시적으로 주 생성자를 호출하는 코드가 옆에 있으면 됨
    constructor(num: Int):this()/*call*/{
        println("Simple4 secondary constructor-s6")
        println()
    }
}


//*****constructor() 키워드 : 접근제한자 or 어노테이션이 없다면 생략 가능
class Simple5 (){//constructor 생략
    init {
        println("Simple5 주 생성자")
    }
}