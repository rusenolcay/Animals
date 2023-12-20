package com.rusen.animalsproject.animals.birds

import androidx.annotation.DrawableRes
import com.rusen.animalsproject.animals.Besin
import com.rusen.animalsproject.animals.Flyable
import com.rusen.animalsproject.animals.Habitat
import com.rusen.animalsproject.R

class Kartal(
    adi: String,
    @DrawableRes resmi: Int = R.drawable.ic_kartal,
    besin: Besin = Besin.ET,
    habitat: Habitat = Habitat.KARA,
    tuyRengi: String = "Siyah"
) : Birds(adi, resmi, besin, habitat, tuyRengi), Flyable {

    override fun sesCikar() = "Ciyak ciyak"

    override fun solunumTipi() = "Akciğer"

    override val flyingSpeed: Int
        get() = 80
}