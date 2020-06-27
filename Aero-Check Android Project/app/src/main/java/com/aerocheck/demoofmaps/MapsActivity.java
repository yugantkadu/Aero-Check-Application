package com.aerocheck.demoofmaps;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import static com.aerocheck.demoofmaps.R.id.map;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        //MAHARASHTRA

        LatLng CivilLinesNagpur = new LatLng(21.150995,79.071108);
        //sendAqi(id);
        //displayAqi(aqi,status);

        mMap.addMarker(new MarkerOptions().position(CivilLinesNagpur).title("AQI : 163  Status : Moderate"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CivilLinesNagpur));

       LatLng MorechowkwalujAurangabad = new LatLng(19.839206,75.246579);
        mMap.addMarker(new MarkerOptions().position(MorechowkwalujAurangabad).title("AQI : 247  Status : "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MorechowkwalujAurangabad));

        LatLng BandraWestMumbai = new LatLng(19.055827, 72.829908);
        mMap.addMarker(new MarkerOptions().position(BandraWestMumbai).title("AQI : 105 Status : Moderately polluted "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(BandraWestMumbai));

        LatLng KTHMCollegeNashik = new LatLng(20.007601,73.778442);
        mMap.addMarker(new MarkerOptions().position(KTHMCollegeNashik).title("AQI :  151  Status : Moderately polluted "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KTHMCollegeNashik));

        LatLng KarveRoadPune  = new LatLng(18.502875,73.818135);
        mMap.addMarker(new MarkerOptions().position(KarveRoadPune ).title("AQI :  95  Status : Satisfactory "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KarveRoadPune));

        LatLng PimpleshwarMandirDombivliThane  = new LatLng(19.193933,73.094976);
        mMap.addMarker(new MarkerOptions().position(PimpleshwarMandirDombivliThane).title("AQI :  153  Status : Moderately polluted "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(PimpleshwarMandirDombivliThane));

        LatLng AiroliNaviMumbai  = new LatLng(19.161895,73.001587);
        mMap.addMarker(new MarkerOptions().position(AiroliNaviMumbai ).title("AQI : 70 Status :  Satisfactory "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AiroliNaviMumbai));

        LatLng Chandrapur   = new LatLng(19.995442,79.259059);
        mMap.addMarker(new MarkerOptions().position(Chandrapur).title("AQI : 133  Status :  Moderately polluted "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Chandrapur ));

        LatLng Solapur = new LatLng(17.660803,75.903165);
        mMap.addMarker(new MarkerOptions().position(Solapur  ).title("AQI :  133  Status : Moderately polluted "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Solapur ));

        //ANDHRA PRADESH

        LatLng GVMCRamNagarVisakhapatnam   = new LatLng(17.723266,83.308281);
        mMap.addMarker(new MarkerOptions().position(GVMCRamNagarVisakhapatnam  ).title("AQI :  73  Status : Satisfactory "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GVMCRamNagarVisakhapatnam ));

        LatLng TirumalaTirupati   = new LatLng(13.678303,79.351201);
        mMap.addMarker(new MarkerOptions().position(TirumalaTirupati).title("AQI : 101  Status : Moderately polluted "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(TirumalaTirupati));

        //BIHAR

        LatLng IGSCPlanetariumComplexPatna = new LatLng(25.610729,85.131977);
        mMap.addMarker(new MarkerOptions().position(IGSCPlanetariumComplexPatna).title("AQI :  263  Status : Poor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(IGSCPlanetariumComplexPatna));

        LatLng MuzaffarpurCollectorate = new LatLng(26.116781,85.388655);
        mMap.addMarker(new MarkerOptions().position(MuzaffarpurCollectorate).title("AQI : 241 Status : Poor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MuzaffarpurCollectorate));

        LatLng GayaCollectorate   = new LatLng(24.794298,85.005513);
        mMap.addMarker(new MarkerOptions().position(GayaCollectorate).title("AQI : 330 Status : Very Poor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GayaCollectorate ));

        //DELHI

        LatLng Shadipur   = new LatLng(28.651779, 77.156666);
        mMap.addMarker(new MarkerOptions().position(Shadipur).title("AQI :  190  Status : Moderately polluted "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Shadipur));

        LatLng IHBAS    = new LatLng(28.681199,77.305216);
        mMap.addMarker(new MarkerOptions().position(IHBAS ).title("AQI :  0  Status : Good "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(IHBAS ));

        LatLng NSITDwarka = new LatLng(28.609089, 77.034581);
        mMap.addMarker(new MarkerOptions().position(NSITDwarka).title("AQI :  176 Status : Moderately polluted"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(NSITDwarka));

        LatLng MandirMarkDPCC  = new LatLng(28.636881,77.200949);
        mMap.addMarker(new MarkerOptions().position(MandirMarkDPCC).title("AQI : 165 Status : Moderately polluted "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MandirMarkDPCC));

        LatLng AnandViharDPCC = new LatLng(28.646926,77.315953);
        mMap.addMarker(new MarkerOptions().position(AnandViharDPCC).title("AQI :  241 Status : Poor "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AnandViharDPCC));

        LatLng RKPuramDPCC  = new LatLng(28.559483,77.184090);
        mMap.addMarker(new MarkerOptions().position(RKPuramDPCC).title("AQI :  241  Status : Poor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(RKPuramDPCC));

        LatLng PunjabiBaghDPCC = new LatLng(28.673901,77.126777);
        mMap.addMarker(new MarkerOptions().position(PunjabiBaghDPCC).title("AQI :  216 Status : Poor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(PunjabiBaghDPCC));

        LatLng IOT = new LatLng(28.630942,77.250512);
        mMap.addMarker(new MarkerOptions().position(IOT).title("AQI :  205  Status : Poor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(IOT));

        LatLng DTU = new LatLng(28.750207,77.117633);
        mMap.addMarker(new MarkerOptions().position(DTU).title("AQI : 252 Status : Poor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(DTU));

        LatLng Sirifort  = new LatLng(28.551405, 77.227568);
        mMap.addMarker(new MarkerOptions().position(Sirifort ).title("AQI : 186 Status : Moderately polluted "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Sirifort ));

        //GUJARAT

        LatLng ManinagarAhmedabad = new LatLng(22.996451, 72.600716);
        mMap.addMarker(new MarkerOptions().position(ManinagarAhmedabad).title("AQI : 253 Status : Poor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ManinagarAhmedabad));

        //HARYANA

        LatLng Sector16AFaridabad = new LatLng(28.408993,77.317976);
        mMap.addMarker(new MarkerOptions().position(Sector16AFaridabad).title("AQI : 260 Status : Poor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Sector16AFaridabad));

        LatLng Sector6Panchkula = new LatLng(30.705983,76.853218);
        mMap.addMarker(new MarkerOptions().position(Sector6Panchkula).title("AQI : 112  Status : Moderately polluted"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Sector6Panchkula));

        LatLng VikasSadanGurgaon = new LatLng(28.450162,77.028440);
        mMap.addMarker(new MarkerOptions().position(VikasSadanGurgaon ).title("AQI : 143 Status : Moderately polluted"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(VikasSadanGurgaon ));

        LatLng MDUniversityRohtak = new LatLng(28.877451,76.622098);
        mMap.addMarker(new MarkerOptions().position(MDUniversityRohtak).title("AQI : 67 Status :  Satisfactory "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MDUniversityRohtak));

        //KARNATAKA

        LatLng BTMlayoutBengaluru = new LatLng(12.916454,77.610832);
        mMap.addMarker(new MarkerOptions().position(BTMlayoutBengaluru).title("AQI : 56 Status : Satisfactory"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(BTMlayoutBengaluru ));

        LatLng PeenyaBengaluru  = new LatLng(13.028204,77.518536);
        mMap.addMarker(new MarkerOptions().position(PeenyaBengaluru).title("AQI : 56 Status : Satisfactory "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(PeenyaBengaluru));

        LatLng BWSSBKadabesanahalli = new LatLng(12.934827,77.690488);
        mMap.addMarker(new MarkerOptions().position(BWSSBKadabesanahalli).title("AQI : 39 Status : Good "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(BWSSBKadabesanahalli));

        LatLng CityRailwayStationKSPCB  = new LatLng(12.978401,77.568398);
        mMap.addMarker(new MarkerOptions().position(CityRailwayStationKSPCB).title("AQI : 74 Status : Satisfactory "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CityRailwayStationKSPCB));

        LatLng SaneguruvaHalliKSPCB  = new LatLng(12.990669,77.544855);
        mMap.addMarker(new MarkerOptions().position(SaneguruvaHalliKSPCB).title("AQI : 51 Status : Satisfactory "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SaneguruvaHalliKSPCB));

        //RAJASTHAN

        LatLng CollectorateJodhpur = new LatLng(26.291813, 73.036722);
        mMap.addMarker(new MarkerOptions().position(CollectorateJodhpur).title("AQI : 186 Status : Moderately polluted"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CollectorateJodhpur));

        LatLng VKIndustrialAreaJaipur = new LatLng(26.987036,75.779692);
        mMap.addMarker(new MarkerOptions().position(VKIndustrialAreaJaipur).title("AQI : 120 Status : Moderately polluted "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(VKIndustrialAreaJaipur));

        //TAMILNADU

        LatLng AlandurBusDepot = new LatLng(12.997112, 80.191506);
        mMap.addMarker(new MarkerOptions().position(AlandurBusDepot).title("AQI : 52 Status : Satisfactory "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AlandurBusDepot));

        LatLng IIT = new LatLng(12.991272, 80.233155);
        mMap.addMarker(new MarkerOptions().position(IIT).title("AQI : 51 Status : Satisfactory "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(IIT));

        LatLng Manali = new LatLng(13.193641, 80.270522);
        mMap.addMarker(new MarkerOptions().position(Manali).title("AQI : 42 Status : Good "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Manali));

        //TELENGANA

        LatLng SanathnagarHyderabad  = new LatLng(17.452793, 78.442957);
        mMap.addMarker(new MarkerOptions().position(SanathnagarHyderabad ).title("AQI : 87 Status : Satisfactory "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SanathnagarHyderabad ));

        LatLng ZooParkBahadurpuraWestHyderabad = new LatLng(13.193641, 80.270522);
        mMap.addMarker(new MarkerOptions().position(ZooParkBahadurpuraWestHyderabad).title("AQI : 180 Status : Moderately polluted"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ZooParkBahadurpuraWestHyderabad));

        LatLng IDAPashamylaramTSPCBHyderabad = new LatLng(17.533592, 78.194014);
        mMap.addMarker(new MarkerOptions().position(IDAPashamylaramTSPCBHyderabad).title("AQI : 78 Status : Satisfactory "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(IDAPashamylaramTSPCBHyderabad));

        LatLng BollaramIndustrialAreaHyderabad  = new LatLng(17.543048, 78.351649);
        mMap.addMarker(new MarkerOptions().position(BollaramIndustrialAreaHyderabad ).title("AQI : 99 Status : Satisfactory "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(BollaramIndustrialAreaHyderabad ));

        LatLng ICRISATPatancheruHyderabad = new LatLng(17.511037, 78.275183);
        mMap.addMarker(new MarkerOptions().position(ICRISATPatancheruHyderabad).title("AQI : 68 Status : Satisfactory "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ICRISATPatancheruHyderabad));

        //UTTAR PRADESH

        LatLng SanjayPalaceAgra = new LatLng(27.199450, 78.006055);
        mMap.addMarker(new MarkerOptions().position(SanjayPalaceAgra).title("AQI : 149 Status : Moderately polluted "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SanjayPalaceAgra));

        LatLng NehruNagarKanpur = new LatLng(26.471221, 80.323587);
        mMap.addMarker(new MarkerOptions().position(NehruNagarKanpur).title("AQI : 240 Status : Poor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(NehruNagarKanpur));

        LatLng LalbaghWestLucknow = new LatLng(26.848034, 80.940095);
        mMap.addMarker(new MarkerOptions().position(LalbaghWestLucknow).title("AQI : 168 Status : Moderately polluted"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(LalbaghWestLucknow));

        LatLng CentralSchoolLucknow = new LatLng(26.837861, 80.885753);
        mMap.addMarker(new MarkerOptions().position(CentralSchoolLucknow).title("AQI : 213 Status : Poor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CentralSchoolLucknow));

        LatLng TalkatoraDistrictIndustriesCenter = new LatLng(26.835055, 80.902273);
        mMap.addMarker(new MarkerOptions().position(TalkatoraDistrictIndustriesCenter).title("AQI : 248 Status : Poor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(TalkatoraDistrictIndustriesCenter));

        LatLng ArdhaliBazarVaranasi = new LatLng(25.347760, 82.980822);
        mMap.addMarker(new MarkerOptions().position(ArdhaliBazarVaranasi).title("AQI : 273 Status : Poor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ArdhaliBazarVaranasi));

        //WEST BENGAL

        LatLng VictoriaKolkata = new LatLng(22.552515, 88.343702);
        mMap.addMarker(new MarkerOptions().position(VictoriaKolkata).title("AQI : 431 Status : Worst"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(VictoriaKolkata));

        LatLng RabindraBharatiUniversityKolkata = new LatLng(22.584974, 88.359071);
        mMap.addMarker(new MarkerOptions().position(RabindraBharatiUniversityKolkata).title("AQI : 98 Status :  Satisfactory "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(RabindraBharatiUniversityKolkata));

        LatLng Howrah = new LatLng(22.596832, 88.262371);
        mMap.addMarker(new MarkerOptions().position(Howrah).title("AQI : 60 Status : Satisfactory "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Howrah));

        LatLng Haldia  = new LatLng(22.064148, 88.072551);
        mMap.addMarker(new MarkerOptions().position(Haldia ).title("AQI : 0 Status : Good "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Haldia ));

        LatLng SindhuKanhuIndoorStadiumDurgapur = new LatLng(23.540376, 87.291347);
        mMap.addMarker(new MarkerOptions().position(SindhuKanhuIndoorStadiumDurgapur).title("AQI : 185 Status : Moderately polluted"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SindhuKanhuIndoorStadiumDurgapur));
    }

 public void lisst(View v){
  Intent i = new Intent(this, change.class);
  startActivity(i);
 }
}
