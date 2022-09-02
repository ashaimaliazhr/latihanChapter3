package asha.binar.latihanchapter3

import android.os.Parcel
import android.os.Parcelable


data class DataDua(
    val name : String?,
    val nickname : String?,
    val age : Int?,
    val address : String?,
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(nickname)
        parcel.writeValue(age)
        parcel.writeString(address)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DataDua> {
        override fun createFromParcel(parcel: Parcel): DataDua {
            return DataDua(parcel)
        }

        override fun newArray(size: Int): Array<DataDua?> {
            return arrayOfNulls(size)
        }
    }
}
