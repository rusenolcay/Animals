package com.rusen.animalsproject.animals.mammals

import android.os.Parcelable
import androidx.annotation.DrawableRes
import com.rusen.animalsproject.animals.Food
import com.rusen.animalsproject.animals.Habitat
import com.rusen.animalsproject.R
import com.rusen.animalsproject.animals.Walkable
import kotlinx.parcelize.Parcelize


@Parcelize
class Giraffe(
    override val name: String,
    @DrawableRes override val picture: Int = R.drawable.ic_zurafa,
    override val food: Food = Food.OT,
    override val habitat: Habitat = Habitat.KARA,
    override val skinColor: String = "Siyahbeyaz"
) : Mammals(name, picture, food, habitat, skinColor), Parcelable, Walkable {

    override fun makeVoice() = "Zuuu Zuuu"

    override fun breathingtype() = "Akciğer"

    override val runningSpeed: Int
        get() = 20
}