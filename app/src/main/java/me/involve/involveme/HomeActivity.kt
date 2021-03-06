package me.involve.involveme

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import java.util.stream.Collector

/**
 * Created by Mela on 2018-12-21.
 */

class HomeActivity : Fragment(), OnMapReadyCallback {
    private lateinit var mMap: GoogleMap
    val d: DataHolder = DataHolder()
    var arrInitiative: ArrayList<Initiative> =  d.getArrInitiatives()

    override fun onMapReady(p0: GoogleMap) {
        mMap = p0

       for (i in arrInitiative) {
           val latlong = i.location!!
           mMap.addMarker(MarkerOptions().position(latlong).title(i.name))
           mMap.moveCamera(CameraUpdateFactory.newLatLng(latlong))
       }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var mapFragment: SupportMapFragment?=null
        mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var view: View = inflater.inflate(R.layout.fragment_home, container, false)

        return view
    }
}