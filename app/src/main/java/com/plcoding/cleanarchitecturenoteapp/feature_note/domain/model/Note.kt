package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.plcoding.cleanarchitecturenoteapp.ui.theme.*

@Entity(tableName = "tbl_notes")
data class Note(
    val title:String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey
    val id:Int? = null
) {
    // define a list of colors, a note can have
    companion object{
        val noteColors = listOf(
            RedOrange,
            LightGreen,
            Violet,
            BabyBlue,
            RedPink
        )
    }
}
