package com.example.diapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.help_detail_sfsu.*
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapsInitializer
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class HelpDetailSFSU : AppCompatActivity() {

    //val position = LatLng(37.723732, -122.492705)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.help_detail_sfsu)

        btnBack.setOnClickListener {
            startActivity(Intent(this, HelpHome::class.java))
        }

        mapView.setOnClickListener {
            startActivity(Intent(this, MapsActivity::class.java))
        }



        //with(mapView) {4
            // Initialise the MapView
            //onCreate(null)
            // Set the map ready callback to receive the GoogleMap object
            //getMapAsync{
                //MapsInitializer.initialize(applicationContext)
                //setMapLocation(it)
            //}
        //}
    }
    //private fun setMapLocation(map : GoogleMap) {
        //with(map) {
            //moveCamera(CameraUpdateFactory.newLatLngZoom(position, 13f))
            //addMarker(MarkerOptions().position(position))
            //mapType = GoogleMap.MAP_TYPE_NORMAL
            //setOnMapClickListener {
                //Toast.makeText(this@HelpDetailSFSU, "Clicked on map", Toast.LENGTH_SHORT).show()
            //}
        //}
    //}
}
