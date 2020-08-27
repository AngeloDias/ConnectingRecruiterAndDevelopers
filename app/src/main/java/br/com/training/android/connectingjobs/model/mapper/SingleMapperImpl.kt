package br.com.training.android.connectingjobs.model.mapper

class SingleMapperImpl<I, O>(private val mapper: Mapper<I, O>): Mapper<I, O> {

    override fun map(input: I): O {
        return mapper.map(input)
    }

}
