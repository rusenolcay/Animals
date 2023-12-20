package com.rusen.animalsproject.animals.fish

import androidx.annotation.DrawableRes
import com.rusen.animalsproject.animals.Besin
import com.rusen.animalsproject.animals.Habitat
import com.rusen.animalsproject.R
import com.rusen.animalsproject.animals.Swimmable

class Fok(
    adi: String,
    @DrawableRes resmi: Int = R.drawable.ic_fok,
    besin: Besin = Besin.ET,
    habitat: Habitat = Habitat.SU,
    pulRengi: String = "Gri"
) : Fish(adi, resmi, besin, habitat, pulRengi), Swimmable {

    override fun sesCikar() = "Fok fok"

    override fun solunumTipi() = "Akciğer"

    override val swimmingSpeed: Int
        get() = 40
}