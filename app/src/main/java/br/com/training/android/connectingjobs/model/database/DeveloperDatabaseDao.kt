package br.com.training.android.connectingjobs.model.database

import androidx.room.*

@Dao
interface DeveloperDatabaseDao {

    @Query("SELECT * FROM DeveloperEntity")
    fun getAll(): List<DeveloperEntity>

    @Query("SELECT * FROM DeveloperEntity WHERE developerId = :key")
    fun get(key: Long): DeveloperEntity

    @Update
    fun update(developerEntity: DeveloperEntity): DeveloperEntity

    @Insert
    fun insertAll(vararg developerEntity: DeveloperEntity)

    @Delete
    fun delete(developerEntity: DeveloperEntity)

    /**
     * Deletes all values from the table and only the values, not the table.
     */
    @Query("DELETE FROM DeveloperEntity")
    fun clear()
}