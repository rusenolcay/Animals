package com.rusen.animalsproject.animals.mammals

import androidx.annotation.DrawableRes
import com.rusen.animalsproject.animals.Besin
import com.rusen.animalsproject.animals.Habitat
import com.rusen.animalsproject.R
import com.rusen.animalsproject.animals.Walkable

class Fil(
    adi: String,
    @DrawableRes resmi: Int = R.drawable.ic_fil,
    besin: Besin = Besin.OT,
    habitat: Habitat = Habitat.KARA,
    deriRengi: String = "Gri"
) : Mammals(adi, resmi, besin, habitat, deriRengi), Walkable {

    override fun sesCikar() = "Booo Booo"

    override fun solunumTipi() = "Akciğer"

    override val runningSpeed: Int
        get() = 50
}