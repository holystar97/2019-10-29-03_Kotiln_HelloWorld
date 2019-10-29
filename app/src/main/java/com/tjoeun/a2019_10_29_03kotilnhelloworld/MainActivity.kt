package com.tjoeun.a2019_10_29_03kotilnhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       Log.d("코틀린 기초", "Hello World!! ")
        Log.d("코틀린 기초" ,"제 이름은 김민경입니다.")

        // q1 변수 num1을 만들고 10으로 초기화

        var num1=10
        Log.d("코틀린 기초", String.format("%d",num1));

        // log는 내용이 반드 시 string 이어야한다. num1 은 자동으로 int로 할당되어서 내용으로 직접 들어갈 수 없다

        // q2. 상수 pi를 만드록 3.14로 초기화

        val Pi=3.14
        //Pi=31.4 -> val 로 만든 상수 값은 수정 불가

        Log.d("코틀린기초",String.format("%f",Pi))

        //q3. 정수형 변수 num2를 만들고 , 초기화 x . 다음줄에서 20으로 대입

        var num2:Int
        //Log.d("코틀린기초", String.format("%d",num2))-> 초기화 안된 변수는 아예 사용도 못하게 컴파일단에서 막는다
        num2=20 // -> 미리 타입을 지정해두면 해당 타입의 값을 나중에 대입 가능
        // num2=3.14 -> 타입이 다른 값은 넣을 수 없다

        Log.d("코틀린기초", String.format("%d",num2))

        // 코틀린 에서는 모든 변수가 참조형 변수이므로 int 와 같은 기본형으로 추정되는 변수도 메쏘드. 속성을 보유하고 있다

        num2=num2.plus(10)

        Log.d("코틀린기초", String.format("%d",num2))

        var num3:Int? =null // ?를 붙이면 , 이 변수는 null일 가능성을 내포하고 잇따고 알려주는 역할
//        var num4 :Int=null ? 를 붙이지 않은 타입의 변수는 null 담기를 거부한다

        var num5=null // 애초에 null로 초기화 하는건 가능 -> type이 지정되지 않은 상태로 유지
        




    }
}
