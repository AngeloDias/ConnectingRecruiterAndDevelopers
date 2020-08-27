package br.com.training.android.connectingjobs.model.mapper

import br.com.training.android.connectingjobs.model.database.DeveloperEntity
import br.com.training.android.connectingjobs.model.domain.Developer

class DeveloperDataMapper: Mapper<DeveloperEntity, Developer> {

    override fun map(input: DeveloperEntity): Developer {
        return Developer(
            id = input.developerId,
            name = input.name,
            email = input.email,
            linkedInAddress = input.linkedInAddress,
            skills = input.skills
        )
    }

}
