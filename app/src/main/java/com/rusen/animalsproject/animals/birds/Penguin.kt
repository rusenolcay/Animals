package com.rusen.animalsproject.animals.birds

import android.os.Parcelable
import androidx.annotation.DrawableRes
import com.rusen.animalsproject.animals.Food
import com.rusen.animalsproject.animals.Flyable
import com.rusen.animalsproject.animals.Habitat
import com.rusen.animalsproject.R
import kotlinx.parcelize.Parcelize

@Parcelize
class Penguin(
    override val name: String,
    @DrawableRes override val picture: Int = R.drawable.ic_penguen,
    override val food: Food = Food.ET,
    override val habitat: Habitat = Habitat.KARA_VE_SU,
    override val featherColor: String = "Beyaz"
) : Birds(name, picture, food, habitat, featherColor),Parcelable, Flyable {

    override fun makeVoice() = "Bik bik"

    override fun breathingtype() = "Akciğer"

    override val flyingSpeed: Int
        get() = 25
}