package com.example.delegateadapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.delegateadapter.adapter.HeaderAdapter
import com.example.delegateadapter.adapter.ImageAdapter
import com.example.delegateadapter.adapter.SwitchAdapter
import com.example.delegateadapter.delegateadapter.CompositeAdapter
import com.example.delegateadapter.vm.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    private val compositeAdapter by lazy {
        CompositeAdapter.Builder().add(HeaderAdapter()).add(SwitchAdapter()).add(ImageAdapter())
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]
        recyclerView = findViewById(R.id.recyclerViewMain)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = compositeAdapter
        mainViewModel.listItems.observe(this) {
            compositeAdapter.submitList(it)
        }
    }
}