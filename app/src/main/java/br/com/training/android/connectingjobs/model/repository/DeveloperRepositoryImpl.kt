package br.com.training.android.connectingjobs.model.repository

import android.content.Context
import br.com.training.android.connectingjobs.model.database.DeveloperEntity
import br.com.training.android.connectingjobs.model.database.MainRoomDatabase
import br.com.training.android.connectingjobs.model.domain.Developer
import br.com.training.android.connectingjobs.model.mapper.ListMapper
import br.com.training.android.connectingjobs.model.mapper.Mapper

class DeveloperRepositoryImpl(
    private val singleDeveloperMapper: Mapper<DeveloperEntity, Developer>,
    private val listDeveloperMapper: ListMapper<DeveloperEntity, Developer>,
    context: Context
): MainRepository<DeveloperEntity, Developer> {
    private val developerDatabaseDao = MainRoomDatabase.getInstance(context).developerDatabaseDao

    override fun getEntityFromDatabase(key: Long): Developer {
        return singleDeveloperMapper.map(developerDatabaseDao.get(key))
    }

    override fun getEntitiesFromDatabase(): List<Developer> {
        return listDeveloperMapper.map(developerDatabaseDao.getAll())
    }

    override fun insertEntityIntoDatabase(entity: DeveloperEntity) {
        developerDatabaseDao.insertAll(entity)
    }

    override fun updateEntity(entity: DeveloperEntity) {
        developerDatabaseDao.update(entity)
    }

    override fun deleteEntity(entity: DeveloperEntity) {
        developerDatabaseDao.delete(entity)
    }

}
