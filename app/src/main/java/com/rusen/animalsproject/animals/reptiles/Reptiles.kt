package com.rusen.animalsproject.animals.reptiles

import android.os.Parcelable
import androidx.annotation.DrawableRes
import com.rusen.animalsproject.animals.Animals
import com.rusen.animalsproject.animals.Food
import com.rusen.animalsproject.animals.Habitat

abstract class Reptiles(
    name: String,
    @DrawableRes picture: Int,
    food: Food,
    habitat: Habitat,
    open val flakeColor: String
) : Animals(name, picture, food, habitat),Parcelable

