package com.example.hellno

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

        val s1: EditText = findViewById(R.id.s1)
        val s2: EditText = findViewById(R.id.s2)
        val s3: EditText = findViewById(R.id.s3)
        val s4: EditText = findViewById(R.id.s4)
        val s5: EditText = findViewById(R.id.s5)
        val c1: EditText = findViewById(R.id.c1)
        val c2: EditText = findViewById(R.id.c2)
        val c3: EditText = findViewById(R.id.c3)
        val c4: EditText = findViewById(R.id.c4)
        val c5: EditText = findViewById(R.id.c5)
        val p1: EditText = findViewById(R.id.p1)
        val p2: EditText = findViewById(R.id.p2)
        val p3: EditText = findViewById(R.id.p3)
        val p4: EditText = findViewById(R.id.p4)
        val p5: EditText = findViewById(R.id.p5)
        val tc: TextView = findViewById(R.id.tc)
        val gpar: TextView = findViewById(R.id.gpa)
        val ok: Button = findViewById(R.id.ok)
        val clear: Button = findViewById(R.id.clear)

        clear.setOnClickListener {
                s1.setText(" ")
                s2.setText(" ")
                s3.setText(" ")
                s4.setText(" ")
                s5.setText(" ")
                c1.setText(" ")
                c2.setText(" ")
                c3.setText(" ")
                c4.setText(" ")
                c5.setText(" ")
                p1.setText(" ")
                p2.setText(" ")
                p3.setText(" ")
                p4.setText(" ")
                p5.setText(" ")
                tc.setText(" ")
                gpar.setText(" ")
        }
        ok.setOnClickListener {
            val credit1 = c1.text.toString().toFloatOrNull() ?: 0f
            val credit2 = c2.text.toString().toFloatOrNull() ?: 0f
            val credit3 = c3.text.toString().toFloatOrNull() ?: 0f
            val credit4 = c4.text.toString().toFloatOrNull() ?: 0f
            val credit5 = c5.text.toString().toFloatOrNull() ?: 0f


            val grade1 = p1.text.toString().toFloatOrNull() ?: 0f
            val grade2 = p2.text.toString().toFloatOrNull() ?: 0f
            val grade3 = p3.text.toString().toFloatOrNull() ?: 0f
            val grade4 = p4.text.toString().toFloatOrNull() ?: 0f
            val grade5 = p5.text.toString().toFloatOrNull() ?: 0f

            if (s1.text.isEmpty() || s2.text.isEmpty() || s3.text.isEmpty() || s4.text.isEmpty() || s5.text.isEmpty() ||
                c1.text.isEmpty() || c2.text.isEmpty() || c3.text.isEmpty() || c4.text.isEmpty() || c5.text.isEmpty() ||
                p1.text.isEmpty() || p2.text.isEmpty() || p3.text.isEmpty() || p4.text.isEmpty() || p5.text.isEmpty()
            ) {
                Toast. makeText(applicationContext,"กรุณากรอกให้ครบ", Toast. LENGTH_SHORT).show()
            }
            if (credit1 !in 1f..3f || credit2 !in 1f..3f || credit3 !in 1f..3f || credit4 !in 1f..3f || credit5 !in 1f..3f) {
                Toast. makeText(applicationContext,"กรุณากรอกcreditให้ถูกต้อง(1 - 3)", Toast. LENGTH_SHORT).show()
            }else{

            val totalCredits = credit1 + credit2 + credit3 + credit4 + credit5
            val totalGradePoints =
                (credit1 * grade1) + (credit2 * grade2) + (credit3 * grade3) + (credit4 * grade4) + (credit5 * grade5)
            val gpa = totalGradePoints / totalCredits
            tc.text = String.format(" %.2f", totalCredits)
            gpar.text = String.format("%.2f", gpa)}


        }
        }
        }







