package com.example.databinding1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding1.databinding.ActivityMainBinding
import com.example.databinding1.objects.Student

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.student = getStudent()
        binding.apply {
            btnSubmit.setOnClickListener {
                showEditText()
            }
            btnGoToCount.setOnClickListener {
                goToCountActivity()
            }
            btnGoToAdd.setOnClickListener {
                goToAddActivity()
            }
            btnGoToTwoWay.setOnClickListener {
                goToTwoWayDataBinding()
            }
        }
    }
    private fun goToTwoWayDataBinding(){
        val intent = Intent(this, TwoWayDataBindingActivity::class.java)
        startActivity(intent)
    }
    private fun goToCountActivity(){
        val intent = Intent(this, ViewModelTestActivity::class.java)
        startActivity(intent)
    }
    private fun goToAddActivity(){
        val intent = Intent(this, AddRecursivelyActivity::class.java)
        startActivity(intent)
    }
    private fun showEditText(){
        binding.apply {
            tvView.text = editTxt.text
        }
    }
    private fun getStudent(): Student {
        return Student("Kabir","kabir@gmail.com")
    }
}