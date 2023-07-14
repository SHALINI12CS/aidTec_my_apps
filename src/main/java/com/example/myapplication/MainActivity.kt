package com.example.calculator2

import android.R
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.navigateUp
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val appBarConfiguration: AppBarConfiguration? = null
    private val binding: ActivityMainBinding? = null
    var e1: EditText? = null
    var e2: EditText? = null
    var t1: TextView? = null
    var num1 = 0
    var num2 = 0// converting string to int.

    // converting string to int.
//checkAndClear();//checkAndClear();
    //checkAndClear();
    // defining the edit text 1 to e1

    // defining the edit text 2 to e2

    // defining the text view to t1

    // taking input from text box 1
    val numbers: Boolean
        // taking input from text box 2
        get() {

            //checkAndClear();
            // defining the edit text 1 to e1
            e1 = findViewById<View>(R.id.button1) as EditText

            // defining the edit text 2 to e2
            e2 = findViewById<View>(R.id.button2) as EditText

            // defining the text view to t1
            t1 = findViewById<View>(R.id.summary) as TextView

            // taking input from text box 1
            val s1 = e1!!.text.toString()

            // taking input from text box 2
            val s2 = e2!!.text.toString()
            if (s1 == "Please enter value 1" && s2 == null) {
                val result = "Please enter value 2"
                e2!!.setText(result)
                return false
            }
            if (s1 == null && s2 == "Please enter value 2") {
                val result = "Please enter value 1"
                e1!!.setText(result)
                return false
            }
            if (s1 == "Please enter value 1" || s2 == "Please enter value 2") {
                return false
            }
            if (s1 != null && s2 == null || s1 != "" && s2 == "") {
                val result = "Please enter value 2"
                e2!!.setText(result)
                return false
            }
            if (s1 == null && s2 != null || s1 == "" && s2 != "") {
                //checkAndClear();
                val result = "Please enter value 1"
                e1!!.setText(result)
                return false
            }
            if (s1 == null && s2 == null || s1 == "" && s2 == "") {
                //checkAndClear();
                val result1 = "Please enter value 1"
                e1!!.setText(result1)
                val result2 = "Please enter value 2"
                e2!!.setText(result2)
                return false
            } else {
                // converting string to int.
                num1 = s1.toInt()

                // converting string to int.
                num2 = s2.toInt()
            }
            return true
        }

    fun doSum(v: View?) {

        // get the input numbers
        if (numbers) {
            val sum = num1 + num2
            t1!!.text = Integer.toString(sum)
        } else {
            t1!!.text = "Error Please enter Required Values"
        }
    }

    fun clearTextNum1(v: View?) {

        // get the input numbers
        e1!!.text.clear()
    }

    fun clearTextNum2(v: View?) {

        // get the input numbers
        e2!!.text.clear()
    }

    fun doPow(v: View?) {

        //checkAndClear();
        // get the input numbers
        if (numbers) {
            val sum = Math.pow(num1.toDouble(), num2.toDouble())
            t1!!.text = java.lang.Double.toString(sum)
        } else {
            t1!!.text = "Error Please enter Required Values"
        }
    }

    // a public method to perform subtraction
    fun doSub(v: View?) {
        //checkAndClear();
        // get the input numbers
        if (numbers) {
            val sum = num1 - num2
            t1!!.text = Integer.toString(sum)
        } else {
            t1!!.text = "Error Please enter Required Values"
        }
    }

    // a public method to perform multiplication
    fun doMul(v: View?) {
        //checkAndClear();
        // get the input numbers
        if (numbers) {
            val sum = num1 * num2
            t1!!.text = Integer.toString(sum)
        } else {
            t1!!.text = "Error Please enter Required Values"
        }
    }

    // a public method to perform Division
    fun doDiv(v: View?) {
        //checkAndClear();
        // get the input numbers
        if (numbers) {

            // displaying the text in text view assigned as t1
            val sum = num1 / (num2 * 1.0)
            t1!!.text = java.lang.Double.toString(sum)
        } else {
            t1!!.text = "Error Please enter Required Values"
        }
    }

    // a public method to perform modulus function
    fun doMod(v: View?) {
        //checkAndClear();
        // get the input numbers
        if (numbers) {
            val sum = (num1 % num2).toDouble()
            t1!!.text = java.lang.Double.toString(sum)
        } else {
            t1!!.text = "Error Please enter Required Values"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_item)
        e1 = findViewById<View>(R.id.button1) as EditText
        // defining the edit text 2 to e2
        e2 = findViewById<View>(R.id.button2) as EditText
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId
        return if (id == R.id.accessibilitySystemActionBack) {
            true
        } else super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(this, R.id.cut)
        return (navigateUp(navController, appBarConfiguration!!)
                || super.onSupportNavigateUp())
    }
}