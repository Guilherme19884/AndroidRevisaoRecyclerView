package com.guiga.RevisaoRecycleView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.guiga.RevisaoRecycleView.model.fakeEmails

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()

        recyclerView.adapter = EmailAdapter(fakeEmails())
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    fun setupView() {
        recyclerView = findViewById(R.id.rv_recycle_main)
    }
}


