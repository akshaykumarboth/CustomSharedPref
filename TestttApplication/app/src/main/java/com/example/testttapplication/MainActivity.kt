package com.example.testttapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.testttapplication.ui.theme.TestttApplicationTheme
import com.example.testttapplication.sharedpreff.presentation.CustomSharedPref
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

class MainActivity : ComponentActivity() {


    private val pref : CustomSharedPref by inject()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestttApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {}
            }
        }

        testPref()
    }

    private fun testPref() {

        GlobalScope.launch {
            pref.putString("AkshayString", "test")
            Log.i("Pref Logs", pref.getString("AkshayString") ?: "")

            pref.putString("AkshayString", "test1")
            Log.i("Pref Logs", pref.getString("AkshayString") ?: "")

            pref.putInt("AkshayInt", 1)
            val valueint = pref.getInt("AkshayInt") ?: -1
            Log.i("Pref Logs", "" + valueint)

            pref.putDouble("AkshayDouble", 1.2)
            val valueDouble = pref.getDouble("AkshayDouble") ?: -1.4
            Log.i("Pref Logs", "" + valueDouble)
        }
    }

}

