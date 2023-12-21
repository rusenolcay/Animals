package com.rusen.animalsproject.animals.fish

import android.os.Parcelable
import androidx.annotation.DrawableRes
import com.rusen.animalsproject.animals.Food
import com.rusen.animalsproject.animals.Habitat
import com.rusen.animalsproject.R
import com.rusen.animalsproject.animals.Swimmable
import kotlinx.parcelize.Parcelize

@Parcelize
class Dolphin(
    override val name: String,
    @DrawableRes override val picture: Int = R.drawable.ic_yunus,
    override val food: Food = Food.ET,
    override val habitat: Habitat = Habitat.SU,
    override val flakeColor: String = "Mavi"
) : Fish(name, picture, food, habitat, flakeColor),Parcelable, Swimmable {

    override fun makeVoice() = "Zyak zyak"

    override fun breathingtype() = "Akciğer"

    override val swimmingSpeed: Int
        get() = 70
}