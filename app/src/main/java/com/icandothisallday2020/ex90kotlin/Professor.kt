package com.icandothisallday2020.ex90kotlin

//보조생성자 활용
class Professor : Person{
    var subject:String?=null
    //보조생성자 - 파라미터로 property 생성불가
    constructor(name: String, age:Int, subject: String):super(name, age){
        this.subject=subject
        println("Create Professor Class")
    }

    override fun show() {
        println("name : $name   age : $age   subject : $subject")
    }
}