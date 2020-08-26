package br.com.training.android.connectingjobs.model.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [RecruiterEntity::class, DeveloperEntity::class], version = 1)
abstract class RecruiterDatabase: RoomDatabase() {
    abstract val databaseRecruiterDao: RecruiterDatabaseDao

    companion object{
        @Volatile
        private var INSTANCE: RecruiterDatabase? = null

        fun getInstance(context: Context): RecruiterDatabase {

            synchronized(this) {
                var instance = INSTANCE

                if(instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        RecruiterDatabase::class.java,
                        "recruiter_history_database"
                    ).fallbackToDestructiveMigration().build()
                    INSTANCE = instance
                }

                return instance
            }

        }
    }

}
