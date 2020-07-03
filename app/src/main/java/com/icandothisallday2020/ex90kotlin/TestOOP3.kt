package com.icandothisallday2020.ex90kotlin

fun main(){
    //안드로이드에서 가장 많이 사용되는 이너클래스 & 인터페이스 & 익명클래스
    
    //1. Inner Class
    val obj=AAA()// 이너클래스는 아우터에서만 생성가능
    val b=obj.getBBBInstance()// void== Unit
    b.show()

    //2. Interface (추상메소드:abstract 만 보유한 클래스)
    //val obj2= ClickListener()---인터페이스는 직접 객체생성 불가
    //인터페이스를 구현한 클래스를 만들어 그 클래스 안에서 인터페이스의 abstract 를 구현(override)
    val obj2=Click()
    obj2.onClick()

    //3. Anonymous [object 키워드 사용]
    val obj3=object:ClickListener{//()  X
        override fun onClick() {
            println("Anonymous Class onClick!!!")
        }
    }
    obj3.onClick()
}





//클래스안의 클래스 : inner class
class AAA{
    var a:Int = 0
    fun show(){
        println("AAA show")
        println()
    }

    //아웃터- 이너클래스 객체를 생성하여 리턴 해주는 메소드
    fun getBBBInstance(): BBB {
        val obj=BBB()//아웃터는 이너클래스 객체 생성 가능
        return obj
    }



    //inner class [ inner 키워드 ]--Outer 의 멤버를 내것인양 사용
    //*** inner 키워드가 없으면 Outer 의 멤버를 사용할 수 없음
    inner class BBB{
        fun show(){//override X--이너클래스는 상속관계가 아님
            println("Outer's Property a : $a")
            a=3

            //이너 안에서 아웃터의 this 사용
            this@AAA.show()//this@Mainactivity
        }
    }
}



//인터페이스는 자바와 같음
interface ClickListener{
    //abstract
    fun onClick()//추상메소드는 {} X
}

//인터페이스를 구현한 클래스
class Click : ClickListener{
    override fun onClick() {
        println("click!!")
        println()
    }

}