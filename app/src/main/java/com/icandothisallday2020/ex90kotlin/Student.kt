package com.icandothisallday2020.ex90kotlin

//상속받아 이미 존재하는 변수인 name,age 는 var 을 붙이지X
open class Student constructor(name:String, age:Int, var major:String): Person(name, age) {
    init {
        println("Create Student Class")
    }

    //override 키워드를 쓰면  자동 open method
    override fun show() {
        //super.show()

        println("name : $name   age : $age   major : $major")
    }
}