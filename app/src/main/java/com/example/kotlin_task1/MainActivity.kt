package com.example.kotlin_task1

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var button: Button? = null
    var text: TextView? = null

    //Вывел значение DataClass на экран
    var kotlinData: Data = Data("Семь", 7)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        button?.setOnClickListener(this)
        text = findViewById(R.id.textView)
        //Клонирование(copy) Object
        //Вывел на экран
        val data1 = Data("fild",7)
        val data2 = data1.copy()
        data2.int = 6
        if (text != null) text?.setText(
            "Значение первого поля DataClass:\n ${kotlinData.fildd}\n" +
                    "Значение второго поля DataClass:\n ${kotlinData.int}\n"+
                    "Значение поля ориг:\n ${data1.int}\n" +
                    "Значение поля копии:\n ${data2.int}\n" )


//Вынес значение через цикл
        val weatherOfWeek =
            listOf("SUNNY", "RAINY", "CLOUDY", "MISTY", "SNOWY", "HAILY")
        for (week in weatherOfWeek) {
            Log.d("myLogs", "$week")
        }

    }




    //Log.d("mylongs","${data2.int}")



        //Повесли на кнопку ClickListener
        override fun onClick(view: View?) {
            if ((view != null) && (view?.id == R.id.button)) {
                Toast.makeText(
                    view.context,
                    "Работает",
                    Toast.LENGTH_LONG
                ).show()


            }


        }


    }




