package br.com.training.android.connectingjobs.model.repository

interface MainRepository<in I, out O> {

    fun getEntityFromDatabase(key: Long): O

    fun getEntitiesFromDatabase(): List<O>

    fun insertEntityIntoDatabase(entity: I)

    fun updateEntity(entity: I)

    fun deleteEntity(entity: I)

}
