package br.com.training.android.connectingjobs.model.mapper

import br.com.training.android.connectingjobs.model.database.RecruiterEntity
import br.com.training.android.connectingjobs.model.domain.Recruiter

class RecruiterDataMapper: Mapper<RecruiterEntity, Recruiter> {

    override fun map(input: RecruiterEntity): Recruiter {
        return Recruiter(
            id = input.recruiterId,
            name = input.name,
            email = input.email,
            linkedInAddress = input.linkedInAddress
        )
    }

}
