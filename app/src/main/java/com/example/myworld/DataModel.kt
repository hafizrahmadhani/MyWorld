package com.example.myworld

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataModel (
        val imgBig_received : Int?,
        val title_received : String?,
        val desc_received : String?,
        val imgFlag : Int?,
        val motto_received : String?,
        val capital_received : String?,
        val language_received : String?,
        val gov_received : String?,
        val population_received : String?,
        val currency_received : String?
): Parcelable
