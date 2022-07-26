package com.example.firebase2

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {

    private val CHANNEL_ID = "channel_id"
    private val notificationId= 101



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        createNotificationChannel()

        val totalQuestions = intent.getIntExtra(MusicQ.TOTAL_QUESTIONS,0)
        val correctAnswers = intent.getIntExtra(MusicQ.CORRECT_ANSWERS,0)

        tv_score.text= "Your Score is $correctAnswers out of $totalQuestions"

        btn_finish.setOnClickListener{
                val builder = NotificationCompat.Builder(this,CHANNEL_ID)
                    .setSmallIcon(R.drawable.quizz)
                    .setContentTitle("Result")
                    .setContentText("Your Score is $correctAnswers out of $totalQuestions")
                    .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                with(NotificationManagerCompat.from(this)) {
                    notify(notificationId, builder.build())
                }
            startActivity(Intent(this, HomePage::class.java))
            finish()
        }
    }

    private fun createNotificationChannel(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val name= "Notification Title"
            val descriptionText= "Notification Description"
            val importance= NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
                description=descriptionText
            }
            val notificationManager: NotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }
}