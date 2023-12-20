package com.rusen.animalsproject.animals.mammals

import androidx.annotation.DrawableRes
import com.rusen.animalsproject.animals.Besin
import com.rusen.animalsproject.animals.Habitat
import com.rusen.animalsproject.R
import com.rusen.animalsproject.animals.Walkable

class Zurafa(
    adi: String,
    @DrawableRes resmi: Int = R.drawable.ic_zurafa,
    besin: Besin = Besin.OT,
    habitat: Habitat = Habitat.KARA,
    deriRengi: String = "Siyahbeyaz"
) : Mammals(adi, resmi, besin, habitat, deriRengi), Walkable {

    override fun sesCikar() = "Zuuu Zuuu"

    override fun solunumTipi() = "Akciğer"

    override val runningSpeed: Int
        get() = 20
}