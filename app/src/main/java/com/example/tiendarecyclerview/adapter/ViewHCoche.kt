package com.example.tiendarecyclerview.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tiendarecyclerview.databinding.Vista2Binding
import com.example.tiendarecyclerview.models.Coche

class ViewHCoche(view : View,
                 var deleteOnClick: (Int) -> Unit,
                 var updateOnClick: (Int) -> Unit
    ) : RecyclerView.ViewHolder (view){
    lateinit var binding: Vista2Binding
    init {
        binding = Vista2Binding.bind(view)
    }

    fun renderize(coche : Coche){
        binding.txtviewName.setText(coche. name)
        binding.txtviewBrand.setText(coche. brand)
        binding.txtviewPrice.text = coche.price.toString()
        Glide
            .with(itemView.context)
            .load(coche. image)
            .centerCrop()
            .into(binding.ivCoche)

        binding.btnEdit.setOnClickListener {
            updateOnClick(position)
        }
        binding.btnDelete.setOnClickListener {
            deleteOnClick(position)
        }

    }
}