package com.rusen.animalsproject.animals

import android.os.Parcelable
import androidx.annotation.DrawableRes

abstract class Animals(
    open val name: String,
    @DrawableRes open val picture: Int,
    open val food: Food,
    open val habitat: Habitat
) : Parcelable {
    abstract fun makeVoice(): String?

    abstract fun breathingtype(): String

    override fun toString(): String {
        return "Animals(adi='$name', resmi=$picture, besin=$food, habitat=$habitat)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Animals

        if (name != other.name) return false
        if (picture != other.picture) return false
        if (food != other.food) return false
        if (habitat != other.habitat) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + picture
        result = 31 * result + food.hashCode()
        result = 31 * result + habitat.hashCode()
        return result
    }
}