package com.mutia.rentalio

object RentalioData {

    private val names = arrayOf(
        "CITY",
        "SUV",
        "MPV",
        "JEEP",
        "MOPED",
        "SCOOTER",
        "CLASSIC",
        "TRAIL"
    )

    private val images = intArrayOf(
        R.drawable.img_city,
        R.drawable.img_suv,
        R.drawable.img_mpv,
        R.drawable.img_jeep,
        R.drawable.img_moped,
        R.drawable.img_scooter,
        R.drawable.img_classic,
        R.drawable.img_traill
    )

    val listDataRentalio: ArrayList<RentalioModel>

    get() {
        val list = arrayListOf<RentalioModel>()
        for (position in names.indices) {
            val rentalio = RentalioModel()
            rentalio.name = names[position]
            rentalio.image = images[position]
            list.add(rentalio)
        }
        return list
    }
}