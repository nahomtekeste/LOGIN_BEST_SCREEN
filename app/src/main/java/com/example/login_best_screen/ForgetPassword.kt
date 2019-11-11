package com.example.login_best_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_forget_password.*

class ForgetPassword : AppCompatActivity() {

    lateinit var txt_emailForget: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)

        txt_emailForget = findViewById(R.id.txt_forgetEmail)

        // this code allow the user to get send to the passwrod
        btn_send.setOnClickListener {
            var intent = Intent (applicationContext , LoginActivity::class.java)
            startActivities(arrayOf(intent))
            Toast.makeText(this, " Password is being Sent to your Email", Toast.LENGTH_SHORT).show()
            // this code allow the user to clear the text from email
            txt_emailForget.setText("")

        }
    }
}
