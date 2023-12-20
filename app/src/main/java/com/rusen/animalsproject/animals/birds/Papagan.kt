package com.rusen.animalsproject.animals.birds

import androidx.annotation.DrawableRes
import com.rusen.animalsproject.animals.Besin
import com.rusen.animalsproject.animals.Flyable
import com.rusen.animalsproject.animals.Habitat
import com.rusen.animalsproject.R

class Papagan(
    adi: String,
    @DrawableRes resmi: Int = R.drawable.ic_papagan,
    besin: Besin = Besin.OT,
    habitat: Habitat = Habitat.KARA,
    tuyRengi: String = "Yesil"
) : Birds(adi, resmi, besin, habitat, tuyRengi), Flyable {

    override fun sesCikar() = "Merhaba cici kuş"

    override fun solunumTipi() = "Akciğer"

    override val flyingSpeed: Int
        get() = 30
}