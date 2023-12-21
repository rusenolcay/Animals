package com.rusen.animalsproject.animals.birds

import android.os.Parcelable
import androidx.annotation.DrawableRes
import com.rusen.animalsproject.animals.Animals
import com.rusen.animalsproject.animals.Food
import com.rusen.animalsproject.animals.Habitat

abstract class Birds(
    override val name: String,
    @DrawableRes override val picture: Int,
    override val food: Food,
    override val habitat: Habitat,
    open val featherColor: String
): Animals(name, picture, food, habitat),Parcelable{
}


