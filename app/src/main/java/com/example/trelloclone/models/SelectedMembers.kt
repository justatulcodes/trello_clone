package com.example.trelloclone.models

import android.os.Parcel
import android.os.Parcelable


/**
 * Represents an object of a member that is selected for a card as a member
 *
 * @property id
 * @property image
 */

data class SelectedMembers (
    val id: String  = "",
    val image : String = ""
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest)  {
        writeString(id)
        writeString(image)
    }

    companion object CREATOR : Parcelable.Creator<SelectedMembers> {
        override fun createFromParcel(parcel: Parcel): SelectedMembers {
            return SelectedMembers(parcel)
        }

        override fun newArray(size: Int): Array<SelectedMembers?> {
            return arrayOfNulls(size)
        }
    }
}