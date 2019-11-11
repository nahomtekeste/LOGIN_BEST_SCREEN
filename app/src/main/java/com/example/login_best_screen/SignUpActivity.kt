package com.example.login_best_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.content.SharedPreferences as SharedPreferences1

class SignUpActivity : AppCompatActivity() {

    lateinit var txt_name: EditText
    lateinit var txt_email: EditText
    lateinit var txt_password: EditText
    lateinit var btn_register: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sharedPreference: SharedPreference = SharedPreference(this)

        txt_name = findViewById(R.id.txt_name)
        txt_email = findViewById(R.id.txt_email)
        txt_password = findViewById(R.id.txt_password)
        btn_register = findViewById(R.id.btn_register)


        // this btn allow the user to sava the data in side a shared preference
        btn_register.setOnClickListener {

            val name = txt_name.editableText.toString()
            val email = txt_email.editableText.toString()
            val password = txt_password.editableText.toString()
            sharedPreference.save("name", name)
            sharedPreference.save("email", email)
            sharedPreference.save("password" , password)
            Toast.makeText(this, "Data Stored", Toast.LENGTH_SHORT).show()
            showLoginPage()
            //to save an Int
//            sharedPreference.save("intval",1)
            //to save boolien
//            sharedPreference.save("bool",true)
            Toast.makeText(this, "Saved to shared pref", Toast.LENGTH_SHORT).show()

        }


    }
    // this function allow the user allow to get very easy to the main page
   private fun showLoginPage(){
        var intent = Intent(application , LoginActivity:: class.java)
        startActivities(arrayOf(intent))
    }
}