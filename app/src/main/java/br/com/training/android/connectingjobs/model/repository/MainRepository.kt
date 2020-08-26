package br.com.training.android.connectingjobs.model.repository

import android.content.Context

interface MainRepository<T> {

    fun getEntityFromDatabase(context: Context): T

    fun getEntitiesFromDatabase(context: Context): List<T>

    fun insertEntityIntoDatabase(entity: T)

}
