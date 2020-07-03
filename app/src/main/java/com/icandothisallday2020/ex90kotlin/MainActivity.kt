package com.icandothisallday2020.ex90kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

//코틀린은 기본 Java 와 100% 호환 가능 Java Library & JDK 사용가능

class MainActivity : AppCompatActivity() {//extends == :

    override fun onCreate(savedInstanceState: Bundle?) {//@annotation X -> keyword
        // fun : function (리턴타입 X)// (변수명 : 자료형)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View) {//무조건 함수는 fun
        //XML 에서 뷰에 지정한 id 를 변수명으로 사용
        //※※ import kotlinx.android.synthetic.main.activity_main.* 가 되어있어야
        //알아서 find view by id
        tv.setText("Nice to meet Kotlin!")
    }


    //Override method : ※반드시 fun 앞에 'override' 키워드와 함께 있어야 함
    override fun onResume(){
        super.onResume()
        Toast.makeText(this,"onResume",Toast.LENGTH_LONG).show()
    }
}
