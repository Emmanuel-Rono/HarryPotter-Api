package com.emmanuel_rono.harry_potter_api

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

lateinit var recyclerview:RecyclerView
lateinit var viewModel: dataviewModel

class MainActivity : AppCompatActivity() {
    companion object {
        //Defining the Key to use for passing data -PutExtra
        const val posts = "the_Posts"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val displayRecyclerview = findViewById<RecyclerView>(R.id.dataRecyclerview)
        displayRecyclerview.layoutManager = LinearLayoutManager(this)
        val adapter = characterAdapter(emptyList()) { post ->
            gotoDetailsScreen(post)
        }
        displayRecyclerview.adapter=adapter
        val repository=dataRepository()
        viewModel=ViewModelProvider(this,ViewModelfactory(repository)).get(dataviewModel::class.java)

    }
    fun gotoDetailsScreen(post:CharactersItem)
    {
        val intent=Intent(this,displaActivity::class.java)
        intent.putExtra(posts,post)
        startActivity(intent)
    }
}