package com.example.medicard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login_page.*


class LoginPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)
    }

    fun LoginButtonClicked(view: View) {
        //val nameEntered = username.editableText.toString()
        val intent = Intent(this, RamanMedicalRecord::class.java)
        startActivity(intent)
        //Toast.makeText(this, "Login Attempt for $nameEntered",Toast.LENGTH_SHORT).show()
    }
}