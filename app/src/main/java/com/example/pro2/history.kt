package com.example.pro2

import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_history.*


class history : AppCompatActivity() {
/*
    lateinit var adapter: MyRecyclerViewAdapter
    lateinit var cursor: Cursor
    lateinit var db: SQLiteDatabase


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

      //  val openSqLiteHelper = MyOpenSqLiteHelper(this,1)
       // db = openSqLiteHelper.writableDatabase
     //   val cursor = db.query(TABLE_NAME,null,null,null,null,null,null)
        adapter = MyRecyclerViewAdapter(cursor)
       // recyclerView.adapter = adapter
    }
    class MyRecyclerViewAdapter(var cursor: Cursor): RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder>() {
        fun swapCursor(newCursor: Cursor) {
            if (cursor == newCursor) return
            cursor.close()
            cursor = newCursor
            notifyDataSetChanged()
        }

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            TODO("Not yet implemented")
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            TODO("Not yet implemented")
        }

        override fun getItemCount(): Int {
            TODO("Not yet implemented")
        }
    }*/}