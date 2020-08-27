package br.com.training.android.connectingjobs.model.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [RecruiterEntity::class, DeveloperEntity::class], version = 1)
abstract class MainRoomDatabase: RoomDatabase() {
    abstract val recruiterDatabaseDao: RecruiterDatabaseDao
    abstract val developerDatabaseDao: DeveloperDatabaseDao

    companion object{
        @Volatile
        private var INSTANCE: MainRoomDatabase? = null

        fun getInstance(context: Context): MainRoomDatabase {

            synchronized(this) {
                var instance = INSTANCE

                if(instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        MainRoomDatabase::class.java,
                        "main_history_database"
                    ).fallbackToDestructiveMigration().build()
                    INSTANCE = instance
                }

                return instance
            }

        }
    }

}
