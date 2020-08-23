package kr.co.tjoeun.loginlogictest_20200823

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {


            val inputID = idEdt.text.toString()
            val inputPW = passwordEdt.text.toString()


            if (inputID == "admin@test.com" && inputPW == "qwer") {
                Toast.makeText(this, "관리자 로그인 입니다", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }
        }

    }

}