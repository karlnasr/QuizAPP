package com.example.firebase2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    private lateinit var database: FirebaseDatabase
    private  lateinit var reference: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        database= FirebaseDatabase.getInstance()
        reference= database.getReference("User")
        reg_btn.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }

//        button2.setOnClickListener {
//            getData()
//        }

        sign_btn.setOnClickListener {
            login()
        }
    }

    private fun login() {
        var name= emailfield.text.toString()
        var pwd= pwfield.text.toString()
        reference.child(name).get().addOnSuccessListener {
            if (it.child("username").value==name
                && it.child("password").value==pwd){
                Toast.makeText(this@Login, "Success", Toast.LENGTH_SHORT).show()
                val intent= Intent(this@Login, HomePage::class.java)
                intent.putExtra("Username", name)
                startActivity(intent)
            }
        }.addOnFailureListener {
            Toast.makeText(this@Login, "Failed", Toast.LENGTH_SHORT).show()
        }
    }

//    private fun getData(){
//        var name = emailfield.text.toString()
//        reference.child(name).get().addOnSuccessListener {
//            if (it.exists()){
//                val fname= it.child("usermame").value
//                val pswd= it.child("password").value
//                Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
//                textView.text= fname.toString()
//                textView2.text= pswd.toString()
//            } else {
//                Toast.makeText(this, "User not ex", Toast.LENGTH_SHORT).show()
//            }
//        }.addOnFailureListener {
//            Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
//        }
//    }
}