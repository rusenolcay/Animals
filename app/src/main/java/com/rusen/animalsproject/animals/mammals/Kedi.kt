package com.rusen.animalsproject.animals.mammals

import androidx.annotation.DrawableRes
import com.rusen.animalsproject.animals.Besin
import com.rusen.animalsproject.animals.Habitat
import com.rusen.animalsproject.R
import com.rusen.animalsproject.animals.Walkable

class Kedi(
    adi: String,
    @DrawableRes resmi: Int = R.drawable.ic_kedi,
    besin: Besin = Besin.ET,
    habitat: Habitat = Habitat.KARA,
    deriRengi: String = "Kahverengi"
) : Mammals(adi, resmi, besin, habitat, deriRengi), Walkable {

    override fun sesCikar() = "Miyav miyav"

    override fun solunumTipi() = "Akciğer"

    override val runningSpeed: Int
        get() = 60
}