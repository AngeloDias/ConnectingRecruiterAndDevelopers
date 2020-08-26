package br.com.training.android.connectingjobs.model.repository

import android.content.Context
import br.com.training.android.connectingjobs.model.database.RecruiterEntity
import br.com.training.android.connectingjobs.model.domain.Recruiter
import br.com.training.android.connectingjobs.model.mapper.ListMapper

class RecruiterRepositoryImpl(
    private val listRecruiterMapper: ListMapper<RecruiterEntity, Recruiter>
): MainRepository<RecruiterEntity> {

    override fun getEntityFromDatabase(context: Context): RecruiterEntity {
        TODO("Not yet implemented")
    }

    override fun getEntitiesFromDatabase(context: Context): List<RecruiterEntity> {
        TODO("Not yet implemented")
    }

    override fun insertEntityIntoDatabase(entity: RecruiterEntity) {
        TODO("Not yet implemented")
    }

}
