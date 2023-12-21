package com.rusen.animalsproject.animals.reptiles

import android.os.Parcelable
import androidx.annotation.DrawableRes
import com.rusen.animalsproject.animals.Food
import com.rusen.animalsproject.animals.Habitat
import com.rusen.animalsproject.R
import kotlinx.parcelize.Parcelize


@Parcelize
class Crocodile(
    override val name: String,
    @DrawableRes override val picture: Int = R.drawable.ic_timsah,
    override val food: Food = Food.ET,
    override val habitat: Habitat = Habitat.KARA_VE_SU,
    override val flakeColor: String = "Siyah"
) : Reptiles(name, picture, food, habitat, flakeColor),Parcelable {

    override fun makeVoice() = "Hööö hööö"

    override fun breathingtype() = "Akciğer"
}