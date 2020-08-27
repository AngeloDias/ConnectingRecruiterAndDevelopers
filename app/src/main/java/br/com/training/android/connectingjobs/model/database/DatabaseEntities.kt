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

@Entity
data class DeveloperEntity(
    @PrimaryKey
    var developerId: Int,
    var name: String,
    var email: String,
    var linkedInAddress: String,
    var skills: List<String>
)
