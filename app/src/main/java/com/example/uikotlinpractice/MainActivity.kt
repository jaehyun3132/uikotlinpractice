package com.example.uikotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        확인버튼이눌리면 이벤트를 달아주자.
        okBtn. setOnClickListener {
//            입련된 내용? ; contentEdt 의 text 의 값 조회
        //            조회(get)변수에 저장해두자
//            저장해둔 입력 값을 텍스트뷰에 반영(set)

            val inputContent =  contentEdt.text.toString()

            resultTxt.text = inputContent




       }
    }
}