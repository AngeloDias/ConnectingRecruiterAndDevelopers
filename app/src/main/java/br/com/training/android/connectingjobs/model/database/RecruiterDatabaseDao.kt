package br.com.training.android.connectingjobs.model.database

import androidx.room.*

@Dao
interface RecruiterDatabaseDao {

    @Query("SELECT * FROM RecruiterEntity")
    fun getAll(): List<RecruiterEntity>

    @Query("SELECT * FROM RecruiterEntity WHERE recruiterId = :key")
    fun get(key: Long): RecruiterEntity

    @Update
    fun update(recruiterEntity: RecruiterEntity): RecruiterEntity

    @Insert
    fun insertAll(vararg recruiterEntities: RecruiterEntity)

    @Delete
    fun delete(recruiterEntity: RecruiterEntity)

    /**
     * Deletes all values from the table and only the values, not the table.
     */
    @Query("DELETE FROM RecruiterEntity")
    fun clear()
}
