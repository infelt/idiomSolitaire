package com.infelt.core_data.room.bean

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "table_Idioms")
data class Idiom(@PrimaryKey @ColumnInfo(name = "id") var id: Long,
                 @ColumnInfo(name = "idiom") var idiom: String,
                 @ColumnInfo(name = "firstPinyin") var firstPinyin: String,
                 @ColumnInfo(name = "pinyin") var pinyin: String,
                 @ColumnInfo(name = "derivation") var derivation: String,
                 @ColumnInfo(name = "example") var example: String,
                 @ColumnInfo(name = "abbreviation") var abbreviation: String,
                 @ColumnInfo(name = "explanation") var explanation: String,
                 ) {
}