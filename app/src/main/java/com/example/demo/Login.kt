package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnlogin.setOnClickListener {
            if (txtedUsername.text.toString().equals("admin")&& txtlogin.text.toString().equals("admin"))
            {
                Toast.makeText(this,"Login Successfull!!",Toast.LENGTH_LONG).show()
            }
            else{

                Toast.makeText(this,"Enter a data!!",Toast.LENGTH_LONG).show()
            }

        }
    }
}
