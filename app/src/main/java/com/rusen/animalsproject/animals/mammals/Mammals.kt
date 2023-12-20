package com.rusen.animalsproject.animals.mammals

import androidx.annotation.DrawableRes
import com.rusen.animalsproject.animals.Animals
import com.rusen.animalsproject.animals.Besin
import com.rusen.animalsproject.animals.Habitat

abstract class Mammals(
    adi: String,
    @DrawableRes resmi: Int,
    besin: Besin,
    habitat: Habitat,
    deriRengi: String
) : Animals(adi, resmi, besin, habitat)