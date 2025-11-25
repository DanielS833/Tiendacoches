package com.example.tiendarecyclerview

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tiendarecyclerview.controler.Controller
import com.example.tiendarecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var controller : Controller
    lateinit var binding : ActivityMainBinding
    // lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate( layoutInflater)
        setContentView( binding.root)
        init()
    }
    fun init(){
        initRecyclerView()
        controller = Controller(this)
        controller.setAdapter()
    }
    private fun initRecyclerView() {
        binding.myrecyclerview.layoutManager = LinearLayoutManager(this)
    }

}