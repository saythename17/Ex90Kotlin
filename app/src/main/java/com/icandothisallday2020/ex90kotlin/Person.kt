package com.icandothisallday2020.ex90kotlin

//주생성자의 파라미터에 var 키워드 삽입 :: property 가 됨
open class Person constructor(var name:String?,  var age:Int){
    init {
        println("Create Person Class")
    }

    open fun show(){
        println("name : $name")
        println("age : $age")
    }
}