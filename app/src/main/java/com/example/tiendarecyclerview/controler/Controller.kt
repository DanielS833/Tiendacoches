package com.example.tiendarecyclerview.controler

import android.content.Context
import android.widget.Toast
import com.example.tiendarecyclerview.MainActivity
import com.example.tiendarecyclerview.adapter.Adaptercoche
import com.example.tiendarecyclerview.dao.DaoCoches
import com.example.tiendarecyclerview.models.Coche

class Controller(val context: Context) {
    lateinit var listCoches : MutableList<Coche>
    private lateinit var adapterCoche : Adaptercoche
    init {
        initData()
    }
    fun initData(){
        listCoches = DaoCoches. myDao.getDataCoches(). toMutableList() //llamamos al singleton.
    }
    fun loggOut() {
        Toast.makeText( context, "He mostrado los datos en pantalla", Toast. LENGTH_LONG).show()
        listCoches.forEach{
            println (it)
        }
    }
    fun setAdapter() {
        val myActivity = context as MainActivity
        adapterCoche = Adaptercoche(
            listCoches,
            {
                    pos-> delCoche(pos)
            },
            {
                    pos-> updateCoche(pos)
            }
        )
        myActivity.binding.myrecyclerview.adapter = adapterCoche
        crearCoche()
    }
    fun delCoche(pos : Int){
        Toast.makeText( context, "Borraremos el coche de posición $pos",
            Toast.LENGTH_LONG).show()
        listCoches.removeAt(pos)
        adapterCoche.notifyItemRemoved(pos)
    }

    fun updateCoche(pos : Int){
        Toast.makeText( context, "Actualizar el coche de posición $pos",
            Toast.LENGTH_LONG).show()
    }

    fun crearCoche(){
        val mainActivity = context as MainActivity

        mainActivity.binding.crear.setOnClickListener {
            Toast.makeText(context, "CREAR COCHE", Toast.LENGTH_SHORT).show()
        }
    }
}