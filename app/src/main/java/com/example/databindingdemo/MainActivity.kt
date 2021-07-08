package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var aPerson  : Person = Person(name = "ali", NRICNo = "000621100208", email = "abc@gmaill.com" , address = "Kelantan")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



       binding =  DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.personData = aPerson

        binding.btnUpdate.setOnClickListener(){
            aPerson.email ="def@gmail.com"
            aPerson.address = "123 Jalan XYZ"

            binding.apply { invalidateAll() }


        }


       // data binding with the data class
       /* binding.textView9.text = aPerson.name
        binding.textView10.text = aPerson.NRICNo
        binding.textView11.text = aPerson.email
        binding.textView12.text = aPerson.address
        */





        // without data binding
        /*val tvName: TextView = findViewById(R.id.textView9)
      */

        //with data binding but no create data class file
        /*binding.textView9.text  = "Ali"
        binding.textView10.text  = "000621100208"
        binding.textView11.text  = "ali@gmail.com"
        binding.textView12.text  = "Kelantan"*/



    }
}