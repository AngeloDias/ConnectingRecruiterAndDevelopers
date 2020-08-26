package br.com.training.android.connectingjobs.model.mapper

interface Mapper<I, O> {
    fun map(input: I): O
}