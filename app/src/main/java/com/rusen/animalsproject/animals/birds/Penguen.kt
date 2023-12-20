package com.rusen.animalsproject.animals.birds

import androidx.annotation.DrawableRes
import com.rusen.animalsproject.animals.Besin
import com.rusen.animalsproject.animals.Flyable
import com.rusen.animalsproject.animals.Habitat
import com.rusen.animalsproject.R

class Penguen(
    adi: String,
    @DrawableRes resmi: Int = R.drawable.ic_penguen,
    besin: Besin = Besin.ET,
    habitat: Habitat = Habitat.KARA_VE_SU,
    tuyRengi: String = "Beyaz"
) : Birds(adi, resmi, besin, habitat, tuyRengi), Flyable {

    override fun sesCikar() = "Bik bik"

    override fun solunumTipi() = "Akciğer"

    override val flyingSpeed: Int
        get() = 25
}