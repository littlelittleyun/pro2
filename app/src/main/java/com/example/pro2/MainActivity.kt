package com.example.pro2

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
   // lateinit var adapter: MyRecyclerViewAdapter

    var num_1 = 0
    var num_2 = 0
    var sum = 0/*
    lateinit var db: SQLiteDatabase
    lateinit var cursor: Cursor*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //    val openSqLiteHelper = MyOpenSqLiteHelper(this,1)
    //    db = openSqLiteHelper.writableDatabase

        add_button.setOnClickListener {
            num_1 = Integer.parseInt(num1.text.toString())
            num_2 = Integer.parseInt(num2.text.toString())
            sum = num_1+num_2
            sum_text.text = sum.toString()

            //保存状态：
           // var seconds = 0

/*
               // setContentView(R.layout.activity_4)
                if(savedInstanceState != null){
                    num_1 = savedInstanceState.getInt("num_1")
                    num_2 = savedInstanceState.getInt("num_2")
                    sum = savedInstanceState.getInt("sum")
                }

*/

            //通知
            val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            val builder: Notification.Builder
            val Channel_ID = "my channel"
            val Notification_ID = 1
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

                val notificationChannel = NotificationChannel(Channel_ID,"test",
                    NotificationManager.IMPORTANCE_DEFAULT)
                notificationManager.createNotificationChannel(notificationChannel)
                builder = Notification.Builder(this,Channel_ID)
            }else {
                builder = Notification.Builder(this)
            }

            val intent = Intent(this,MainActivity::class.java)
            val pendingIntent = PendingIntent.getActivity(this,1,intent, PendingIntent.FLAG_UPDATE_CURRENT)


            val notification2 = builder.setSmallIcon(R.drawable.ic_launcher_foreground)
                .setContentTitle("加法器")
                .setContentText("the result is $sum")
                .setContentIntent(pendingIntent)//点击通知跳转应用
                .setAutoCancel(true)//点击后自动清空
                .build()

            notificationManager.notify(Notification_ID,notification2)
/*
            val contentValues = ContentValues().apply {
                put("num1",num_1)
                put("num2",num_2)
                put("sum",sum)
            }
            db.insert(TABLE_NAME,null,contentValues)

*/
        }



        history_button.setOnClickListener {
            val intent = Intent(this,history::class.java)


            startActivity(intent)
        }
    }
/*
override fun onSaveInstanceState(outState: Bundle) {
    super.onSaveInstanceState(outState)
    outState.putInt("num_1",num_1)
    outState.putInt("num_2",num_2)
    outState.putInt("sum",sum)


}
*/
}



