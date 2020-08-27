package br.com.training.android.connectingjobs.model.repository

import android.content.Context
import br.com.training.android.connectingjobs.model.database.MainRoomDatabase
import br.com.training.android.connectingjobs.model.database.RecruiterEntity
import br.com.training.android.connectingjobs.model.domain.Recruiter
import br.com.training.android.connectingjobs.model.mapper.ListMapper
import br.com.training.android.connectingjobs.model.mapper.Mapper

class RecruiterRepositoryImpl(
    private val singleRecruiterMapper: Mapper<RecruiterEntity, Recruiter>,
    private val listRecruiterMapper: ListMapper<RecruiterEntity, Recruiter>,
    context: Context
): MainRepository<RecruiterEntity, Recruiter> {
    private val recruiterDatabaseDao = MainRoomDatabase.getInstance(context).recruiterDatabaseDao

    override fun getEntityFromDatabase(key: Long): Recruiter {
        val recruiter = recruiterDatabaseDao.get(key)

        return singleRecruiterMapper.map(recruiter)
    }

    override fun getEntitiesFromDatabase(): List<Recruiter> {
        return listRecruiterMapper.map(recruiterDatabaseDao.getAll())
    }

    override fun insertEntityIntoDatabase(entity: RecruiterEntity) {
        recruiterDatabaseDao.insertAll(entity)
    }

    override fun updateEntity(entity: RecruiterEntity) {
        TODO("Not yet implemented")
    }

    override fun deleteEntity(entity: RecruiterEntity) {
        TODO("Not yet implemented")
    }

}
