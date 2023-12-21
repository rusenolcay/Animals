package com.rusen.animalsproject.animals.birds

import android.os.Parcelable
import androidx.annotation.DrawableRes
import com.rusen.animalsproject.animals.Food
import com.rusen.animalsproject.animals.Flyable
import com.rusen.animalsproject.animals.Habitat
import com.rusen.animalsproject.R
import kotlinx.parcelize.Parcelize

@Parcelize
class Parrot(
    override val name: String,
    @DrawableRes override val picture: Int = R.drawable.ic_papagan,
    override val food: Food = Food.OT,
    override val habitat: Habitat = Habitat.KARA,
    override val featherColor: String = "Yesil"
) : Birds(name, picture, food, habitat, featherColor),Parcelable, Flyable {

    override fun makeVoice() = "Merhaba cici kuş"

    override fun breathingtype() = "Akciğer"

    override val flyingSpeed: Int
        get() = 30
}