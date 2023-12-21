package com.rusen.animalsproject.animals.birds

import android.os.Parcelable
import androidx.annotation.DrawableRes
import com.rusen.animalsproject.animals.Food
import com.rusen.animalsproject.animals.Flyable
import com.rusen.animalsproject.animals.Habitat
import com.rusen.animalsproject.R
import kotlinx.parcelize.Parcelize

@Parcelize
class Bat(
    override val name: String,
    @DrawableRes override val picture: Int = R.drawable.ic_yarasa,
    override val food: Food = Food.ET_VE_OT,
    override val habitat: Habitat = Habitat.KARA,
    override val featherColor: String = "Siyah"
) : Birds(name, picture, food, habitat, featherColor),Parcelable, Flyable {

    override fun makeVoice() = "Vik vik"

    override fun breathingtype() = "Akciğer"

    override val flyingSpeed: Int
        get() = 80
}