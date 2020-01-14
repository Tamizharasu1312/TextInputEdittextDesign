package com.quebotic.textinputedittextdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val aEditText: TextInputEditText =findViewById(R.id.form_inflate_edit_EDT)
        val aTextInputLayout: TextInputLayout =findViewById(R.id.form_inflate_edit_TL)
        val aButton: Button =findViewById(R.id.bt_click)

        aButton.setOnClickListener{
            if(aEditText.text.toString().trim().isEmpty()){
              //  aEditText.setError("Please")
                aTextInputLayout.setError("Please")

            }
        }

    }
}
