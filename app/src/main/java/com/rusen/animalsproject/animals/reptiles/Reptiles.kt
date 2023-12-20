package com.rusen.animalsproject.animals.reptiles

import androidx.annotation.DrawableRes
import com.rusen.animalsproject.animals.Animals
import com.rusen.animalsproject.animals.Besin
import com.rusen.animalsproject.animals.Habitat

abstract class Reptiles(
    adi: String,
    @DrawableRes resmi: Int,
    besin: Besin,
    habitat: Habitat,
    pulRengi: String
) : Animals(adi, resmi, besin, habitat)

