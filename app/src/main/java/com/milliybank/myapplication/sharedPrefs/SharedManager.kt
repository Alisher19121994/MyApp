package com.milliybank.myapplication.sharedPrefs

import android.content.Context
import android.content.SharedPreferences

class SharedManager(context: Context) {
    private var prefs:SharedPreferences = context.getSharedPreferences("Bobur",Context.MODE_PRIVATE)

    companion object{
        const val USER_TOKEN = "user_token"
        const val ID = "ID"
        const val ISLOGGEDIN = "true"
    }

    // Save token data
    fun saveToken(token:String){
        val editor = prefs.edit()
        editor.putString(USER_TOKEN,token)
        editor.apply()
    }
    fun fetchData():String?{
        return prefs.getString(USER_TOKEN,null)
    }

    // Save id data
    fun saveId(id:Int){
        val editor = prefs.edit()
        editor.putInt(ID,id)
        editor.apply()
    }

    fun fetchId():Int{
        return prefs.getInt(ID,0)
    }

    // Save log in data
    fun saveLogIn(isLogged:Boolean){
        val editor = prefs.edit()
        editor.putBoolean(ISLOGGEDIN,isLogged)
        editor.apply()
    }

    fun fetchLogIn():String?{
        return prefs.getString(ISLOGGEDIN,null)
    }
}