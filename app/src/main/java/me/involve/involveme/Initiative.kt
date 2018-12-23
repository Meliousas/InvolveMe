package me.involve.involveme

import com.google.android.gms.maps.model.LatLng

data class Initiative(var name: String, var tagged: Enum<Tag>, var description: String, var location: LatLng, var logo: Int) {
}