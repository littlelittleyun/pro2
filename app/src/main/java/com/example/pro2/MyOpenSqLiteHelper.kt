package com.example.pro2

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

const val DB_NAME = "mydb.db"
const val TABLE_NAME = "history"

class MyOpenSqLiteHelper(context:Context,version:Int): SQLiteOpenHelper(context, DB_NAME,null,version) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("create table $TABLE_NAME(_id integer primary key autoincrement, num1 integer, num2 integer,sum int)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

}