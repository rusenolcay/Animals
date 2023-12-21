package com.rusen.animalsproject.animals.birds

import android.os.Parcelable
import androidx.annotation.DrawableRes
import com.rusen.animalsproject.animals.Food
import com.rusen.animalsproject.animals.Flyable
import com.rusen.animalsproject.animals.Habitat
import com.rusen.animalsproject.R
import kotlinx.parcelize.Parcelize

@Parcelize
class Eagle(
    override val name: String,
    @DrawableRes override val picture: Int = R.drawable.ic_kartal,
    override val food: Food = Food.ET,
    override val habitat: Habitat = Habitat.KARA,
    override val featherColor: String = "Siyah"
) : Birds(name, picture, food, habitat, featherColor),Parcelable, Flyable {

    override fun makeVoice() = "Ciyak ciyak"

    override fun breathingtype() = "Akciğer"

    override val flyingSpeed: Int
        get() = 80
}