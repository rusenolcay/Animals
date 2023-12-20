package com.rusen.animalsproject.animals.reptiles

import androidx.annotation.DrawableRes
import com.rusen.animalsproject.animals.Besin
import com.rusen.animalsproject.animals.Habitat
import com.rusen.animalsproject.R

class Yilan(
    adi: String,
    @DrawableRes resmi: Int = R.drawable.ic_yilan,
    besin: Besin = Besin.ET,
    habitat: Habitat = Habitat.KARA_VE_SU,
    pulRengi: String = "Siyah"
) : Reptiles(adi, resmi, besin, habitat, pulRengi) {

    override fun sesCikar() = "Issss ısss "

    override fun solunumTipi() = "Akciğer"
}