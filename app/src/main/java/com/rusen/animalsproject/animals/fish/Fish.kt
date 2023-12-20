package com.rusen.animalsproject.animals.fish

import androidx.annotation.DrawableRes
import com.rusen.animalsproject.animals.Animals
import com.rusen.animalsproject.animals.Besin
import com.rusen.animalsproject.animals.Habitat
import com.rusen.animalsproject.animals.Swimmable

abstract class Fish(
    adi: String,
    @DrawableRes resmi: Int,
    besin: Besin,
    habitat: Habitat,
    pulRengi: String
) : Animals(adi, resmi, besin, habitat), Swimmable {
}
