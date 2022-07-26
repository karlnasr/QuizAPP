package com.example.firebase2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {
    private lateinit var database: FirebaseDatabase
    private  lateinit var reference: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        database= FirebaseDatabase.getInstance()
        reference= database.getReference("User")

        reg_btn.setOnClickListener{
            sendData()
        }

        sign_btn.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }

    private fun sendData(){
        var name= emailfield.text.toString()
        var pwd= pwfield.text.toString()
        var user= User(name, pwd)
        reference.child(name).setValue(user).addOnSuccessListener {
            Toast.makeText(this@Register, "Success", Toast.LENGTH_SHORT).show()
            val intent= Intent(this, HomePage::class.java)
            //intent.putExtra("Username", name)
            startActivity(intent)
        }.addOnFailureListener {
            Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
        }

    }
}