package com.icandothisallday2020.ex90kotlin
//constructor 키워드 생략 가능
class AlbaStudent (name:String, age:Int,major:String, var task:String):Student(name, age, major){
    init {
        println("Create AlbaStudent Class")
    }

    override fun show() {
        println("name : $name   age : $age   major : $major   task : $task")
    }
}