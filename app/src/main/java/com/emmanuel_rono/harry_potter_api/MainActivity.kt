package com.emmanuel_rono.harry_potter_api

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

lateinit var recyclerview:RecyclerView
lateinit var viewModel: dataviewModel

class MainActivity : AppCompatActivity() {
    companion object {
        //Defining the Key to use for passing data -PutExtra
        const val POSTS_KEY = "the_Posts"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val displayRecyclerview = findViewById<RecyclerView>(R.id.dataRecyclerview)
        displayRecyclerview.layoutManager =LinearLayoutManager(this)
        //Grid layout Manager
        //displayRecyclerview.layoutManager=GridLayoutManager(this,2)
       // val adapter = characterAdapter(emptyList()) { characters ->
         //   gotoDetailsScreen(characters)
            val adapter = characterAdapter(emptyList()) { character ->
             //   gotoDetailsScreen(character as CharactersItem)
        }
        displayRecyclerview.adapter=adapter
        val repository=dataRepository()
        viewModel=ViewModelProvider(this,ViewModelfactory(repository)).get(dataviewModel::class.java)

        //Things that must me placed when working with recyclerviews
        //1.adapter,layoutManager,

    }
   /* private fun gotoDetailsScreen(character: CharactersItem) {
       // val intent = Intent(this, displaActivity::class.java)
       // intent.putExtra(POSTS_KEY, character)
       startActivity(intent)

    */
    }



