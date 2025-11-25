package com.example.tiendarecyclerview.dao

import com.example.tiendarecyclerview.interfaces.InterfaceDao
import com.example.tiendarecyclerview.models.Coche
import com.example.tiendarecyclerview.object_models.Repository

class DaoCoches private constructor() : InterfaceDao{
    companion object {
        val myDao: DaoCoches by lazy{
            DaoCoches()
        }
    }

    fun getDataCoches(): List<Coche> = Repository.listCoches
}