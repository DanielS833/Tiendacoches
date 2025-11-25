package com.example.tiendarecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tiendarecyclerview.R
import com.example.tiendarecyclerview.models.Coche

class Adaptercoche(
    var listcoche : MutableList<Coche>,
    var deleteOnClick: (Int) -> Unit,
    var updateOnClick: (Int) -> Unit
) :
    RecyclerView.Adapter<ViewHCoche>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHCoche{
        val layoutInflater = LayoutInflater.from(parent. context)//objeto para crear la vista.
        val layoutItemCoche = R.layout.vista2 //accedo al xml del item a crear.
        return ViewHCoche(
            layoutInflater.inflate(layoutItemCoche, parent, false),
            deleteOnClick,
            updateOnClick
        )
    }
    override fun onBindViewHolder(holder: ViewHCoche, position: Int) {
        holder.renderize(listcoche[position])
    }
    override fun getItemCount(): Int = listcoche.size
}