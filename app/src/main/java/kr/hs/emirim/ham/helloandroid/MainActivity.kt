package kr.hs.emirim.ham.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = Student("홍길동", 1234)
        student.name = "또치"
        student.studentNumber = 1213
        Log.e("테스트", student.name)
        Log.e("테스트", "" + student.studentNumber)

        var stu1 = Student("또치",1331)
        stu1 = Student("아하하",1331)

    }
}