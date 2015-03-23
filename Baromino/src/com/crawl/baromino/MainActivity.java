package com.crawl.baromino;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback{


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		//addLavsToMap();
	}

	//private void addLavsToMap() {
		//LatLng pos = new LatLng(54.5889131,-5.9342878);
		//googlemap.addMarker(new MarkerOptions()
				//.title("LAVERYS")
				//.snippet("LAVS WOOO")
				//.icon(BitmapDescriptorFactory
						//.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)).position(pos));

	//}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onMapReady(GoogleMap googleMap) {
		
		
	}

}