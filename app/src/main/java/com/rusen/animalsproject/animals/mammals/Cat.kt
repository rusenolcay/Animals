package com.rusen.animalsproject.animals.mammals

import android.os.Parcelable
import androidx.annotation.DrawableRes
import com.rusen.animalsproject.animals.Food
import com.rusen.animalsproject.animals.Habitat
import com.rusen.animalsproject.R
import com.rusen.animalsproject.animals.Walkable
import kotlinx.parcelize.Parcelize


@Parcelize
class Cat(
    override val name: String,
    @DrawableRes override val picture: Int = R.drawable.ic_kedi,
    override val food: Food = Food.ET,
    override val habitat: Habitat = Habitat.KARA,
    override val skinColor: String = "Kahverengi"
) : Mammals(name, picture, food, habitat, skinColor), Parcelable, Walkable {

    override fun makeVoice() = "Miyav miyav"

    override fun breathingtype() = "Akciğer"

    override val runningSpeed: Int
        get() = 60
}