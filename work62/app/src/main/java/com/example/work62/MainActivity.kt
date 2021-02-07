package com.example.work62

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var total0: TextView = findViewById(R.id.total)
        var gpa: TextView = findViewById(R.id.gpa)
        var sub1: EditText =findViewById(R.id.s1)
        var sub2: EditText =findViewById(R.id.s2)
        var sub3: EditText =findViewById(R.id.s3)
        var sub4: EditText =findViewById(R.id.s4)
        var sub5: EditText =findViewById(R.id.s5)
        var cre1: EditText =findViewById(R.id.c1)
        var cre2: EditText =findViewById(R.id.c2)
        var cre3: EditText =findViewById(R.id.c3)
        var cre4: EditText =findViewById(R.id.c4)
        var cre5: EditText =findViewById(R.id.c5)
        var point1: EditText =findViewById(R.id.p1)
        var point2: EditText =findViewById(R.id.p2)
        var point3: EditText =findViewById(R.id.p3)
        var point4: EditText =findViewById(R.id.p4)
        var point5: EditText =findViewById(R.id.p5)
        var btnok: Button =findViewById(R.id.ok)
        var btnclear: Button =findViewById(R.id.clear)
        btnok.setOnClickListener(){
            var sub1 = sub1.text.toString()
            var sub2 = sub2.text.toString()
            var sub3 = sub3.text.toString()
            var sub4 = sub4.text.toString()
            var sub5 = sub5.text.toString()
            var cre1 = cre1.text.toString()
            var cre2 = cre2.text.toString()
            var cre3 = cre3.text.toString()
            var cre4 = cre4.text.toString()
            var cre5 = cre5.text.toString()
            var po1 = point1.text.toString()
            var po2 = point2.text.toString()
            var po3 = point3.text.toString()
            var po4 = point4.text.toString()
            var po5 = point5.text.toString()
            var total1 = 0.00
            var total2 = 0.00
            var total3 = 0.00
            var total4 = 0.00
            var total5 = 0.00
            var total = 0.000
            var totalcre =0.00
            if(sub1 == "" || sub2 == "" || sub3 == "" || sub4 == "" || sub5 == "" ||
                    cre1 == "" || cre2 == "" || cre3 == "" || cre4 == "" || cre5 == "" ||
                    po1 == "" || po2 == "" || po3 == "" || po4 == "" || po5 == ""  ){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ข้อมูลให้ครบ", Toast.LENGTH_LONG)
                toast.show()
            }
            else{
                total1=cre1.toDouble()*po1.toDouble()
                total2=cre2.toDouble()*po2.toDouble()
                total3=cre3.toDouble()*po3.toDouble()
                total4=cre4.toDouble()*po4.toDouble()
                total5=cre5.toDouble()*po5.toDouble()
                totalcre =cre1.toDouble()+cre2.toDouble()+cre3.toDouble()+cre4.toDouble()+cre5.toDouble()
                total = (total1+total2+total3+total4+total5)/totalcre
                total0.setText(totalcre.toString())
                gpa.setText(total.toString())
            }
        }
        btnclear.setOnClickListener(){
            total0.setText("")
            gpa.setText("")
            sub1.setText("")
            sub2.setText("")
            sub3.setText("")
            sub4.setText("")
            sub5.setText("")
            cre1.setText("")
            cre2.setText("")
            cre3.setText("")
            cre4.setText("")
            cre5.setText("")
            point1.setText("")
            point2.setText("")
            point3.setText("")
            point4.setText("")
            point5.setText("")
        }
    }
}