package com.rusen.animalsproject.animals.fish

import android.os.Parcelable
import androidx.annotation.DrawableRes
import com.rusen.animalsproject.animals.Animals
import com.rusen.animalsproject.animals.Food
import com.rusen.animalsproject.animals.Habitat
import com.rusen.animalsproject.animals.Swimmable

abstract class Fish(
    name: String,
    @DrawableRes picture: Int,
    food: Food,
    habitat: Habitat,
    open val  flakeColor: String
) : Animals(name, picture, food, habitat),Parcelable, Swimmable {
}
