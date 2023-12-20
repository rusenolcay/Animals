package com.rusen.animalsproject.animals

import androidx.annotation.DrawableRes

abstract class Animals(
    val adi: String,
    @DrawableRes val resmi: Int,
    val besin: Besin,
    val habitat: Habitat
) {
    abstract fun sesCikar(): String?

    abstract fun solunumTipi(): String

    override fun toString(): String {
        return "Animals(adi='$adi', resmi=$resmi, besin=$besin, habitat=$habitat)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Animals

        if (adi != other.adi) return false
        if (resmi != other.resmi) return false
        if (besin != other.besin) return false
        if (habitat != other.habitat) return false

        return true
    }

    override fun hashCode(): Int {
        var result = adi.hashCode()
        result = 31 * result + resmi
        result = 31 * result + besin.hashCode()
        result = 31 * result + habitat.hashCode()
        return result
    }
}