package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util


/**
 * defines, wether the sort order is acending or descending
 */
sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
