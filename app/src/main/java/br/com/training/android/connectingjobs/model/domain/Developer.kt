package br.com.training.android.connectingjobs.model.domain

data class Developer(
    var id: Int,
    var name: String,
    var email: String,
    var linkedInAddress: String,
    var skills: List<String>
)
