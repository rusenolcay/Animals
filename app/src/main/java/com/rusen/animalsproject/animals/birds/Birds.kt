package com.rusen.animalsproject.animals.birds

import androidx.annotation.DrawableRes
import com.rusen.animalsproject.animals.Animals
import com.rusen.animalsproject.animals.Besin
import com.rusen.animalsproject.animals.Habitat

abstract class Birds(
    adi: String,
    @DrawableRes  resmi: Int,
    besin: Besin,
    habitat: Habitat,
    tuyRengi: String
): Animals(adi, resmi, besin, habitat){
}


