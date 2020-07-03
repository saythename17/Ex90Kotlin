package com.icandothisallday2020.ex90kotlin

fun main(){
    //3.
    //코틀린 상속
    var obj=Second()
    obj.show() //오버라이드된 Second 의 show()

    //상속 최종연습
    val p=Person("sam",20)
    p.show()
    val s=Student("robin",25,"android")
    s.show()
    val pro=Professor("hong",50,"optimization")
    pro.show()
    val alba=AlbaStudent("kim",28,"Web","management")
    alba.show()
}






//1.
//상속해줄 임의의 parent 클래스
//※ 반드시 open 키워드가 있어야 상속가능
// +)open 이 없다면?  default ==java 의 final class--상속 불가
open class First{
    //property
    var a:Int = 10//명시적 초기화 해야하기에 의미없는 값

    //override 될 메소드는 반드시 open 되어야 함
    //open 키워드가 없으면 java 의 final method 와 같음 (오버라이드 불가)
    open fun show(){
        println("a : $a")
    }
}



//2.
//상속받을 child class
//***상속 문법 [ 클래스명 : 부모클래스명() ] -> ※부모클래스명 뒤에 주생성자 호출()
class Second : First(){
    var b:Int = 20

    //상속받은 메소드의 기능 변경 : Override
    //기존 메소드와 같은 이름과 파라미터로 만든 메소드
    //override keyword 명시 ---가독성을 위함
    override fun show(){
        super.show()//부모의 메소드 활용
        println("b : $b")
    }

}