package com.salsabila.idn.samaquran.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "bookmark")
class BookmarkEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    @field:ColumnInfo(name = "namaLatin")
    val namaLatin: String,

    @field:ColumnInfo(name = "arti")
    val arti: String,

    @field:ColumnInfo(name = "bookmarked")
    var isBookmarked: Boolean
)