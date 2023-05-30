package com.emmanuel_rono.harry_potter_api

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.NonDisposableHandle
import kotlinx.coroutines.NonDisposableHandle.parent

class characterAdapter(var characters:List<CharactersItem>) :RecyclerView.Adapter<characterAdapter.characterViewHolder>()
{
    inner class characterViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        var Title_Text:TextView=itemView.findViewById(R.id.title_Tv)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): characterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.character_layout,parent,false)
        return characterViewHolder(view)
    }

    override fun onBindViewHolder(holder: characterViewHolder, position: Int) {
val character=characters[position]
        holder.Title_Text.text=character.name
    }

    override fun getItemCount(): Int {
       return characters.size
    }
}