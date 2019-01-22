package me.involve.involveme

import com.google.android.gms.maps.model.LatLng

public final class DataHolder {

    var arrInitiative: ArrayList<Initiative> = ArrayList()

        fun getArrInitiatives() : ArrayList<Initiative> {

            arrInitiative.add(Initiative("55","Renovate schoolyard",
                    Tag.architecture,
                    "It is crucial for success of our education - to have proper place to learn. I present to you...",
                    LatLng(18.0,42.0),
                    R.drawable.measuring , 0.3))

            arrInitiative.add(Initiative("56","We need plants!",
                    Tag.nature,
                    "There is no color in our neighbourhood, we should buy some plants.",
                    LatLng(21.0,40.0),
                    R.drawable.flowers, 3.4))

            arrInitiative.add(Initiative("2","Cleaning playground every monday",
                    Tag.nature,
                    "There is too much garbage in our neighbourhood. " +
                            "There is too much garbage in our neighbourhood." +
                            "There is too much garbage in our neighbourhood." +
                            "There is too much garbage in our neighbourhood.",
                    LatLng(25.0,43.0),
                    R.drawable.garbage, 5.0))

            arrInitiative.add(Initiative("59","New party event",
                    Tag.entertainment,
                    "New party eventNew party eventNew party eventNew party eventNew party eventNew party event" +
                            "New party eventNew party eventNew party eventNew party eventNew party eventNew party event" +
                            "New party eventNew party eventNew party eventNew party eventNew party eventNew party event" +
                            "New party eventNew party eventNew party eventNew party eventNew party eventNew party event" +
                            "New party eventNew party eventNew party eventNew party eventNew party eventNew party event",
                    LatLng(25.2,40.0),
                    R.drawable.karaoke, 5.0))

            return arrInitiative;
        }

}