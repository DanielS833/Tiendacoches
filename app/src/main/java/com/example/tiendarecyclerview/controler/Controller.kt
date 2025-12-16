package com.example.tiendarecyclerview.controler

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.tiendarecyclerview.MainActivity
import com.example.tiendarecyclerview.R
import com.example.tiendarecyclerview.adapter.Adaptercoche
import com.example.tiendarecyclerview.dao.DaoCoches
import com.example.tiendarecyclerview.models.Coche

class Controller(val context: Context, val recyclerView: RecyclerView) {

    lateinit var listCoches : MutableList<Coche>
    private lateinit var adapterCoche : Adaptercoche

    init {
        initData()
    }

    fun initData() {
        listCoches = DaoCoches.myDao.getDataCoches().toMutableList()
    }

    fun setAdapter() {
        adapterCoche = Adaptercoche(
            listCoches,
            { pos -> delCoche(pos) },
            { pos -> updateCoche(pos) }
        )
        recyclerView.adapter = adapterCoche
    }

    fun delCoche(pos : Int){
        Toast.makeText(context, "Borraremos el coche de posición $pos", Toast.LENGTH_LONG).show()
        listCoches.removeAt(pos)
        adapterCoche.notifyItemRemoved(pos)
    }

    fun updateCoche(pos: Int) {
        val coche = listCoches[pos]
        val layout = LayoutInflater.from(context).inflate(R.layout.dialog_edit_coche, null)

        val etName = layout.findViewById<EditText>(R.id.etName)
        val etBrand = layout.findViewById<EditText>(R.id.etBrand)
        val etPrice = layout.findViewById<EditText>(R.id.etPrice)
        val etImage = layout.findViewById<EditText>(R.id.etImage)

        etName.setText(coche.name)
        etBrand.setText(coche.brand)
        etPrice.setText(coche.price.toString())
        etImage.setText(coche.image)

        AlertDialog.Builder(context)
            .setTitle("Editar coche")
            .setView(layout)
            .setPositiveButton("Guardar") { _, _ ->
                coche.name = etName.text.toString()
                coche.brand = etBrand.text.toString()
                coche.price = etPrice.text.toString().toInt()
                coche.image = etImage.text.toString()

                adapterCoche.notifyItemChanged(pos)
            }
            .setNegativeButton("Cancelar", null)
            .show()
    }

    fun crearCoche(crearButton: ImageButton) {
        crearButton.setOnClickListener {
            val nuevoCoche = Coche(
                name = "Nuevo coche",
                brand = "Marca",
                price = 0,
                image = "https://via.placeholder.com/300"
            )
            listCoches.add(nuevoCoche)
            adapterCoche.notifyItemInserted(listCoches.size - 1)
            Toast.makeText(context, "Coche creado", Toast.LENGTH_SHORT).show()
        }
    }
}
