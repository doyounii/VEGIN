package com.example.vegan;

import android.Manifest;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import java.util.ArrayList;

public class MapActivity extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        return inflater.inflate(R.layout.activity_map, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

//    private NaverMap naverMap;
//    private FusedLocationSource;
//    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1000;
//    private static final String[] PERMISSIONS = {
//            Manifest.permission.ACCESS_FINE_LOCATION,
//            Manifest.permission.ACCESS_COARSE_LOCATION
//    };
//    List<LatLng> lstLatLng = new ArrayList<>();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        FragmentManager fm = getSupportFragmentManager();
//        MapFragment mapFragment = (MapFragment)fm.findFragmentById(R.id.map);
//        if (mapFragment == null) {
//            fm.beginTransaction().add(R.id.map, mapFragment).commit();
//        }
//        mapFragment.getMapAsync(this);
//        locationSource = new FusedLocationSource(this, LOCATION_PERMISSION_REQUEST_CODE);
//
//    }
//
//    @Override
//    public void onMapReady(@NonNull NaverMap naverMap) {
//        this.naverMap = naverMap;
//
//        naverMap.setLocationSource(locationSource);
//        ActivityCompat.requestPermissions(this, PERMISSIONS, LOCATION_PERMISSION_REQUEST_CODE);
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//
//        if (locationSource.onRequestPermissionsResult(requestCode, permissions, grantResults)) {
//            if (!locationSource.isActivated()) {
//                naverMap.setLocationTrackingMode(LocationTrackingMode.None);
//                return;
//            } else {
//                naverMap.setLocationTrackingMode(LocationTrackingMode.Follow);
//            }
//        }
//
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//    }
}