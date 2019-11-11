package com.example.login_best_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up.*

class LoginActivity : AppCompatActivity() {

    lateinit var txt_name: EditText
    lateinit var txt_email: EditText
    lateinit var txt_password: EditText
    lateinit var txt_forgetpass: EditText
    lateinit var btn_register: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val sharedPreference: SharedPreference = SharedPreference(this)

        txt_name = findViewById(R.id.txt_name)
        txt_email = findViewById(R.id.txt_email)
        txt_password = findViewById(R.id.txt_password)
        txt_forgetpass = findViewById(R.id.txt_forgetpass)
        btn_register = findViewById(R.id.btn_register)


        // this code allow the user to login
        btn_login.setOnClickListener {
            if (sharedPreference.getValueString("name")!=null) {
                txt_name.hint = sharedPreference.getValueString("name")!!
                showHomePage()
                Toast.makeText(this,"Data Retrieved",Toast.LENGTH_SHORT).show()
            }else{
                txt_name.hint="NO value found"
            }
            if (sharedPreference.getValueString("email")!=null) {
                txt_email.hint = sharedPreference.getValueString("email")!!
            }else{
                txt_email.hint="Email is not found"
            }
            if(sharedPreference.getValueString("password")!=null) {
                txt_password.hint = sharedPreference.getValueString("password")

            }else{
                txt_password.hint = "  passord is not found"
            }
        }

    }
    // this function allow the user to get to the home page when it is succefull
    private  fun showHomePage(){
        var intent = Intent(applicationContext , MainActivity::class.java)
        startActivities(arrayOf(intent))
    }
}
