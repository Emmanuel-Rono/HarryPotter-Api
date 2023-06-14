package com.emmanuel_rono.harry_potter_api

import android.os.Parcel
import android.os.Parcelable

data class CharactersItem(
    val actor: String,
    val alive: Boolean,
    val alternate_actors: List<String>,
    val alternate_names: List<String>,
    val ancestry: String,
    val dateOfBirth: String,
    val eyeColour: String,
    val gender: String,
    val hairColour: String,
    val hogwartsStaff: Boolean,
    val hogwartsStudent: Boolean,
    val house: String,
    val id: String,
    val image: String,
    val name: String,
    val patronus: String,
    val species: String,
    val wizard: Boolean,
    val yearOfBirth: Int
): Parcelable {

    // Implement the writeToParcel() function to write the object's data to the Parcel
    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(actor)
        dest.writeByte(if (alive) 1 else 0)
        dest.writeStringList(alternate_actors)
        dest.writeStringList(alternate_names)
        dest.writeString(ancestry)
        dest.writeString(dateOfBirth)
        dest.writeString(eyeColour)
        dest.writeString(gender)
        dest.writeString(hairColour)
        dest.writeByte(if (hogwartsStaff) 1 else 0)
        dest.writeByte(if (hogwartsStudent) 1 else 0)
        dest.writeString(house)
        dest.writeString(id)
        dest.writeString(image)
        dest.writeString(name)
        dest.writeString(patronus)
        dest.writeString(species)
        dest.writeByte(if (wizard) 1 else 0)
        dest.writeInt(yearOfBirth)
    }

    // Implement the describeContents() function
    override fun describeContents(): Int {
        return 0
    }

    // Create a companion object to provide the necessary CREATOR for Parcelable
    companion object CREATOR : Parcelable.Creator<CharactersItem> {
        // Implement the createFromParcel() function to recreate the object from the Parcel
        override fun createFromParcel(parcel: Parcel): CharactersItem {
            return CharactersItem(
                actor = parcel.readString() ?: "",
                alive = parcel.readByte() != 0.toByte(),
                alternate_actors = parcel.createStringArrayList() ?: emptyList(),
                alternate_names = parcel.createStringArrayList() ?: emptyList(),
                ancestry = parcel.readString() ?: "",
                dateOfBirth = parcel.readString() ?: "",
                eyeColour = parcel.readString() ?: "",
                gender = parcel.readString() ?: "",
                hairColour = parcel.readString() ?: "",
                hogwartsStaff = parcel.readByte() != 0.toByte(),
                hogwartsStudent = parcel.readByte() != 0.toByte(),
                house = parcel.readString() ?: "",
                id = parcel.readString() ?: "",
                image = parcel.readString() ?: "",
                name = parcel.readString() ?: "",
                patronus = parcel.readString() ?: "",
                species = parcel.readString() ?: "",
                wizard = parcel.readByte() != 0.toByte(),
                yearOfBirth = parcel.readInt()
            )
        }

        // Implement the newArray() function to create an array of the Parcelable class
        override fun newArray(size: Int): Array<CharactersItem?> {
            return arrayOfNulls(size)
        }
    }
}




