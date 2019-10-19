package com.example.mypractical1thurs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.Double.parseDouble
import java.lang.NumberFormatException
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countButton: Button = findViewById(R.id.count_button)
        countButton.setOnClickListener { countUp() }

        val sumButton: Button = findViewById(R.id.sum_button)
        sumButton.setOnClickListener { sumUp() }

        val rButton: Button = findViewById(R.id.reset_button)
        rButton.setOnClickListener { reset() }
    }

    private fun rollDice() {
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)
        resultText.text = "Dice Rolled!"
        val randomInt = Random().nextInt(6) + 1
        resultText.text = randomInt.toString()
        resultText1.text = "Dice Rolled!"
        val randomInt1 = Random().nextInt(6) + 1
        resultText1.text = randomInt1.toString()
        resultText2.text = "Dice Rolled!"
        val randomInt2 = Random().nextInt(6) + 1
        resultText2.text = randomInt2.toString()
    }

    private fun countUp(){
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
        val r: TextView = findViewById(R.id.result_text)
        val r1: TextView = findViewById(R.id.result_text1)
        val r2: TextView = findViewById(R.id.result_text2)
        var numeric = true
        var str: String = r.text.toString()
        var str1: String = r1.text.toString()
        var str2: String = r2.text.toString()
        try{
            val n = parseDouble(str)
            val n1 = parseDouble(str1)
            val n2 = parseDouble(str2)
        }
        catch(e: NumberFormatException){
            numeric = false
        }
        if(numeric){
            val n : Int = Integer.parseInt(str)
            val n1 : Int = Integer.parseInt(str1)
            val n2 : Int = Integer.parseInt(str2)
            if(n < 6){
                r.text = (n+1).toString()
                if(n1<6){
                    r1.text = (n1+1).toString()
                    if(n2<6){
                        r2.text = (n2+1).toString()

                    }
                    else{
                        r2.text = n2.toString()
                    }
                }
                else{
                    r1.text = n1.toString()
                    if(n2<6){
                        r2.text = (n2+1).toString()

                    }
                    else{
                        r2.text = n2.toString()
                    }
                }
            }
            else{
                r.text = n.toString()
                if(n1<6){
                    r1.text = (n1+1).toString()
                    if(n2<6){
                        r2.text = (n2+1).toString()

                    }
                    else{
                        r2.text = n2.toString()
                    }
                }
                else{
                    r1.text = n1.toString()
                    if(n2<6){
                        r2.text = (n2+1).toString()

                    }
                    else{
                        r2.text = n2.toString()
                    }
                }
            }
        }
        else{
            r.text = "Hello Word"
        }

    }

    private fun sumUp() {
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
        val r: TextView = findViewById(R.id.result_text)
        val r1: TextView = findViewById(R.id.result_text1)
        val r2: TextView = findViewById(R.id.result_text2)

        var n: Int = 0
        var n1: Int = 0
        var n2: Int = 0
        if(r!=null){
            n = r.text.toString().toInt()
        }
        if(r1!=null){
            n1 = r1.text.toString().toInt()
        }
        if(r2!=null){
            n2 = r2.text.toString().toInt()
        }

        var s: Int = n+n1+n2;
            r.text = "0"
            r1.text = s.toString()
            r2.text = "0"
    }

    private fun reset(){
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
        val r: TextView = findViewById(R.id.result_text)
        val r1: TextView = findViewById(R.id.result_text1)
        val r2: TextView = findViewById(R.id.result_text2)
        r.text = "Hello Word"
        r1.text = "Hello Word"
        r2.text = "Hello Word"
    }
}
