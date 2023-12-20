package com.rusen.animalsproject.animals.mammals

import androidx.annotation.DrawableRes
import com.rusen.animalsproject.animals.Besin
import com.rusen.animalsproject.animals.Habitat
import com.rusen.animalsproject.R
import com.rusen.animalsproject.animals.Walkable

class Aslan(
    adi: String,
    @DrawableRes resmi: Int = R.drawable.ic_aslan,
    besin: Besin = Besin.ET,
    habitat: Habitat = Habitat.KARA,
    deriRengi: String = "Sari"
) : Mammals(adi, resmi, besin, habitat, deriRengi), Walkable {

    override fun sesCikar() = "HUAA"

    override fun solunumTipi() = "Akciger"

    override val runningSpeed: Int
        get() = 70
}