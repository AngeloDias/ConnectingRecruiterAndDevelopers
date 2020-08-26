package br.com.training.android.connectingjobs.model.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import br.com.training.android.connectingjobs.model.domain.Developer
import br.com.training.android.connectingjobs.model.domain.Recruiter

@Entity
data class RecruiterEntity(
    @PrimaryKey
    val recruiterId: Int,
    var name: String,
    var email: String,
    var linkedInAddress: String
)

fun List<RecruiterEntity>.asRecruiterModel(): List<Recruiter> {
    return map{
        Recruiter(
            id = it.recruiterId,
            name = it.name,
            email = it.email,
            linkedInAddress = it.linkedInAddress
        )
    }
}

@Entity
data class DeveloperEntity(
    @PrimaryKey
    var id: Int,
    var name: String,
    var email: String,
    var linkedInAddress: String,
    var skills: List<String>
)

fun List<DeveloperEntity>.asDeveloperModel(): List<Developer> {
    return map{
        Developer(
            id = it.id,
            name = it.name,
            email = it.email,
            linkedInAddress = it.linkedInAddress,
            skills = it.skills
        )
    }
}
