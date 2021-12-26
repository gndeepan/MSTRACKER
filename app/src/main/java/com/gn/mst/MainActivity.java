package com.gn.mst;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;

import android.os.StrictMode;
import android.provider.Settings;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.android.volley.Network;
import com.android.volley.RequestQueue;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;

import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.libraries.places.api.Places;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.imaginativeworld.oopsnointernet.callbacks.ConnectionCallback;
import org.imaginativeworld.oopsnointernet.dialogs.pendulum.DialogPropertiesPendulum;
import org.imaginativeworld.oopsnointernet.dialogs.pendulum.NoInternetDialogPendulum;
import org.imaginativeworld.oopsnointernet.dialogs.signal.DialogPropertiesSignal;
import org.imaginativeworld.oopsnointernet.dialogs.signal.NoInternetDialogSignal;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import org.json.JSONException;



public class MainActivity extends AppCompatActivity {

    private String data;

    private static Context mContext;
    private GoogleMap mMap;
    private GoogleMap gMap;

    private String json;
    private String lat = "9.235940";
    private String lon = "78.760240";

    private Double lati;
    private Double loni;
    private String speed = "00";
    private String time = "Updating";
    private String driver_num = "012345678";
    private String main_power="123";

    private TextView sped;
    private TextView date;
    private TextView loc;
    private TextView bus_number;
    private MapView mapview1;
    private GoogleMapController _mapview1_controller;


    private boolean isFirstTime = true;

    private FloatingActionButton click;
    private FloatingActionButton call;

    private String bus="355172102729710";
    private Integer num = 12;


    private Timer _timer = new Timer();
    private Timer timer = new Timer();

    private boolean miss_you_error_404 = false;

    private LinearLayout bgbg;
    private ConstraintLayout linear41;
    private ConstraintLayout bg;




    private ImageView imageview7;
    private TextView textview3;
    private TextView mob_num;
    private TextView vaccinate;
    private TextView driver_details;

    private TextView textview9;
    private LinearLayout top;

    private LinearLayout down;
    private LinearLayout linear54;
    private ImageView drawer;
    private ImageView home;

    private LinearLayout left;


    private TimerTask times;
    private TimerTask t;
    private ObjectAnimator anim = new ObjectAnimator();
    private Intent ti = new Intent();
    private TimerTask tsj;
    private Window w;
    private LottieAnimationView power;
    public Marker marker;
    private LatLng start;
    private LatLng end;
    private Integer markerCnt=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        overridePendingTransition(0,0);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // ...
        NoInternetDialogSignal.Builder builder = new NoInternetDialogSignal.Builder(
                this,
                getLifecycle()
        );

        DialogPropertiesSignal properties = builder.getDialogProperties();

        properties.setConnectionCallback(new ConnectionCallback() { // Optional
            @Override
            public void hasActiveConnection(boolean hasActiveConnection) {
                // ...
            }
        });

        properties.setCancelable(false); // Optional
        properties.setNoInternetConnectionTitle("No Internet"); // Optional
        properties.setNoInternetConnectionMessage("Check your Internet connection and try again"); // Optional
        properties.setShowInternetOnButtons(true); // Optional
        properties.setPleaseTurnOnText("Please turn on"); // Optional
        properties.setWifiOnButtonText("Wifi"); // Optional
        properties.setMobileDataOnButtonText("Mobile data"); // Optional

        properties.setOnAirplaneModeTitle("No Internet"); // Optional
        properties.setOnAirplaneModeMessage("You have turned on the airplane mode."); // Optional
        properties.setPleaseTurnOffText("Please turn off"); // Optional
        properties.setAirplaneModeOffButtonText("Airplane mode"); // Optional
        properties.setShowAirplaneModeOffButtons(true); // Optional

        builder.build();


        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putString("intent","done" );
        myEdit.commit();


        initialize(savedInstanceState);

        initializeLogic();
        animation();
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED,
                WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED);






    }

    private void animation() {
        drawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {

                w.setStatusBarColor(0xFF580E8C);
                if (miss_you_error_404) {
                    miss_you_error_404 = false;
                    animation._TransitionManager(bgbg, 300);
                    linear41.setVisibility(View.GONE);

                    animation._Animator(bg, "translationX", 0, 300);
                    times = new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    animation._Animator(bg, "scaleX", 1, 300);
                                    animation._Animator(bg, "scaleY", 1, 300);
                                    animation._Animator(bg, "translationY", 0, 300);
                                }
                            });
                            return;
                        }
                    };
                    _timer.schedule(times, (int)(200));
                    times = new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                  //  animation._shape(0, 0, 0, 0, "#f4f4fa", "#ffffff", 0, bg);
                                }
                            });
                        }
                    };
                    _timer.schedule(times, (int)(400));
                    anim.setTarget(drawer);
                    anim.setPropertyName("rotation");
                    anim.setDuration((int)(175));
                    anim.setFloatValues((float)(0));
                    anim.setInterpolator(new LinearInterpolator());
                    anim.start();
                    drawer.setImageResource(R.drawable.menu);
                    tsj = new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    w.setStatusBarColor(0xFF382751);
                                    bgbg.setBackgroundColor( getResources().getColor(R.color.whitetop));
                                    bg.setBackgroundColor( getResources().getColor(R.color.whitetop));
                                }
                            });
                        }
                    };
                    _timer.schedule(tsj, (int)(660));
                    bg.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT,android.widget.LinearLayout.LayoutParams.MATCH_PARENT));
                }
                else {
                    miss_you_error_404 = true;
                    animation._TransitionManager(bgbg, 300);
                    linear41.setVisibility(View.VISIBLE);
                    String  cl=getString(R.string.whitetops);
                    animation._shape(Util.getDip(getApplicationContext(), (int)(25)), Util.getDip(getApplicationContext(), (int)(25)), Util.getDip(getApplicationContext(), (int)(25)), Util.getDip(getApplicationContext(), (int)(25)), cl, "#ffffff", 0, bg);
                    animation._Animator(bg, "scaleX", 0.7d, 300);
                    animation._Animator(bg, "scaleY", 0.7d, 300);
                    animation._Animator(bg, "translationY", Util.getDip(getApplicationContext(), (int)(-5)), 300);
                    animation._Animator(bg, "translationX", Util.getDip(getApplicationContext(), (int)(-50)), 300);
                    anim.setTarget(drawer);
                    anim.setPropertyName("rotation");
                    anim.setDuration((int)(175));
                    anim.setFloatValues((float)(360));
                    anim.setInterpolator(new LinearInterpolator());
                    anim.start();
                    times = new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    drawer.setImageResource(R.drawable.ic_clear_white);
                                }
                            });
                        }
                    };
                    _timer.schedule(times, (int)(100));
                    animation._UI_GradientLR(bgbg, "#580e8c", "#0b0538", 0, 0, 0, 0, 0, "#000000", 0, "#bdbdbd");
                    animation._setHeight(bg, Util.getDip(getApplicationContext(), (int)(900)), Util.getDip(getApplicationContext(), (int)(400)));
                }
            }
        });
    }


    private void initialize(Bundle savedInstanceState) {

        //
        //
        //declare ****************************************
        //

        //


        bgbg = (LinearLayout) findViewById(R.id.bgbg);
        linear41 = (ConstraintLayout) findViewById(R.id.linear41);
        bg = (ConstraintLayout) findViewById(R.id.bg);
        imageview7 = (ImageView) findViewById(R.id.imageview7);
        textview3 = (TextView) findViewById(R.id.textview3);
        mob_num = (TextView) findViewById(R.id.mob_num);
        vaccinate = (TextView) findViewById(R.id.vaccinate);
        driver_details = (TextView) findViewById(R.id.driver_details);
        textview9 = (TextView) findViewById(R.id.textview9);
        drawer = (ImageView) findViewById(R.id.drawer);
        home = (ImageView) findViewById(R.id.home);
        left = (LinearLayout) findViewById(R.id.left);
        sped = (TextView) findViewById(R.id.speed);
        date = (TextView) findViewById(R.id.date);
        loc = (TextView) findViewById(R.id.loc);
        bus_number = (TextView) findViewById(R.id.bus_number);
        click = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        call = (FloatingActionButton) findViewById(R.id.call);
        sped.setText("00");
        date.setText("Updating");
        getAddress(Double.parseDouble(lat), Double.parseDouble(lon));
        mapview1 = (MapView) findViewById(R.id.map);
        mapview1.onCreate(savedInstanceState);
        power=(LottieAnimationView) findViewById(R.id.power);

        w = this.getWindow();
        w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        w.setStatusBarColor(0xFF382751);


        drawer.setColorFilter(0xFFFF0869, PorterDuff.Mode.MULTIPLY);

        home.setColorFilter(0xFFFF0869, PorterDuff.Mode.MULTIPLY);




        linear41.setVisibility(View.GONE);




        //
        //
        // map set up ***************************************************
        //
        //
        _mapview1_controller = new GoogleMapController(mapview1, new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                mMap = googleMap;
                gMap = googleMap;
                _mapview1_controller.setGoogleMap(mMap);



                int nightModeFlags = mapview1.getContext().getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;
                switch (nightModeFlags) {
                    case Configuration.UI_MODE_NIGHT_YES:
                        try {
                            boolean success = googleMap.setMapStyle(
                                    MapStyleOptions.loadRawResourceStyle(
                                            MainActivity.this, R.raw.mapstyle));


                            if (!success) {

                                Log.e("MainActivity", "Style parsing failed.");
                            }
                        } catch (Resources.NotFoundException e) {
                            Log.e("MainActivity", "Can't find style. Error: ", e);
                        }

                        break;

                    case Configuration.UI_MODE_NIGHT_NO:
                        try {
                            boolean success = googleMap.setMapStyle(
                                    MapStyleOptions.loadRawResourceStyle(
                                            MainActivity.this, R.raw.lightmode));


                            if (!success) {

                                Log.e("MainActivity", "Style parsing failed.");
                            }
                        } catch (Resources.NotFoundException e) {
                            Log.e("MainActivity", "Can't find style. Error: ", e);
                        }

                        break;

                    case Configuration.UI_MODE_NIGHT_UNDEFINED:

                        break;
                }



                LatLng college = new LatLng(9.2346424d, 78.7596154d);
                mMap.addMarker(new MarkerOptions().position(college).icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.common_marker)).title("Our College").snippet("Mohamad Sathak Engineering College"));
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(college.latitude, college.longitude)).zoom(16).build();
                mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
              marker = mMap.addMarker(new MarkerOptions().position(new LatLng(Double.parseDouble(lat), Double.parseDouble(lon)))
                      .icon(BitmapDescriptorFactory.fromResource(R.drawable.common_marker)).title("Update").snippet("Speed :" + speed + " - " + "Time :" + time));




                // Add a marker in Sydney and move the camera

            }

        });

    }


    //
    ///
    /// initializeLogic **************************************
    //
    //
    public void initializeLogic(){

        textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/poppins.ttf"), Typeface.BOLD);
        textview9.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), Typeface.BOLD);
        mob_num.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/poppins.ttf"), Typeface.BOLD);
        vaccinate.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/poppins.ttf"), Typeface.BOLD);
        driver_details.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/poppins.ttf"), Typeface.BOLD);




        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);
         bus = sh.getString("bus", "");
         num = sh.getInt("no", 0);

        url_data(bus,num);




        final Handler handler = new Handler();

        TimerTask doAsynchronouslyTask = new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            url_data(bus,num);
                        }catch (Exception e) {
                            Toast.makeText(getApplicationContext(), e.toString(),Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        };
        timer.schedule(doAsynchronouslyTask, 0, 5000);




        //
        //
        // fab button on click ***************************************************
        //
        //


        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                _mapview1_controller.moveCamera(Double.parseDouble(lat), Double.parseDouble(lon));

                mMap.animateCamera(CameraUpdateFactory.zoomIn());
                mMap.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
                LatLng mountainView = new LatLng(Double.parseDouble(lat), Double.parseDouble(lon));
                CameraPosition cameraPosition = new CameraPosition.Builder()
                        .target(mountainView)
                        .zoom(15)
                        .bearing(180)
                        .tilt(55)
                        .build();
                mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));



            }
        });


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + driver_num));
                startActivity(intent);
            }
        });




        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this,
                        HomeActivity.class);
                //Intent is used to switch from one activity to another.

                startActivity(i);
                //invoke the SecondActivity.
                timer.cancel();

                finish();
                //the current activity will get finished.
            }
        });







    }

    //
    //
    // data request **********************************************
    //



    private void url_data (String bus_num,Integer num){

        RequestQueue requestQueue;



        DiskBasedCache cache = new DiskBasedCache(getCacheDir(), 50024 * 50024); // 1MB cap
        Network network = new BasicNetwork(new HurlStack());
        requestQueue = new RequestQueue(cache, network);
        requestQueue.start();

        String url = "http://104.237.9.130/bus_data/?device_id="+bus_num;


        RequestQueue queue = Volley.newRequestQueue(this);

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                response -> {
                    if (response.length() > 0) {

                        //Toast.makeText(getApplicationContext(), response,Toast.LENGTH_SHORT).show();
                        JSONArray arr = null;
                        try {
                            arr = new JSONArray(response);
                            JSONObject jObj = arr.getJSONObject(0);
                            String tmp_lat = jObj.getString("lati");
                            String tmp_long = jObj.getString("longi");
//                            while(jObj.length() == 0) { }
                            System.out.println(bus_num+" "+"bus"+ num+(tmp_lat.equals(lat) && tmp_long.equals(lon)));

                          //  start= new LatLng(Double.parseDouble(tmp_lat),Double.parseDouble(tmp_long));
                           // Log.e("ADebugTag", bus_num+" "+"bus"+ num+(tmp_lat.equals(lat) && tmp_long.equals(lon)));
                            if(tmp_lat.equals(lat) && tmp_long.equals(lon) ){
                                time = jObj.getString("dt");
                                main_power = jObj.getString("MainPower");



                            }
                            else {
                                bus_number.setText("Msec Bus No "+num);
                                main_power = jObj.getString("MainPower");

                                if(main_power.equals("1")){
                                    power.setAnimation("on.json");

                                    power.playAnimation();
                                }


                               else if(main_power.equals("0"))

                                {
                                    power.setAnimation("off.json");

                                    power.playAnimation();

                                }
                                time = jObj.getString("dt");
                                lat = jObj.getString("lati");
                                lon = jObj.getString("longi");
                                speed = jObj.getString("speed");

                                String extensionRemoved = speed.split("\\.")[0];
                                sped.setText(extensionRemoved + '\n' + "Kph");

                                String[] newStr = time.split("\\s+");

                                date.setText(newStr[1]);



                                marker.setTitle("Update");
                                marker.setSnippet("Speed :" + speed + " - " + "Time :" + time);





                                int resourceId = this.getResources().getIdentifier("bus_"+num+"_marker_icon", "drawable", this.getPackageName());
////
                                marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.bus_marker));


                                if(markerCnt == 0){
                                    markerCnt += 1;
                                    start= new LatLng(Double.parseDouble(lat),Double.parseDouble(lon));
                                    end = new LatLng(Double.parseDouble(lat),Double.parseDouble(lon));
                                    LatLng def =new LatLng(Double.parseDouble(lat),Double.parseDouble(lon));
                                    marker.setPosition(def);
                                    CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(Double.parseDouble(lat),Double.parseDouble(lon))).zoom(16).build();
                                    mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                                }
                                else{
                                    start = end;
                                    end = new LatLng(Double.parseDouble(lat),Double.parseDouble(lon));
                                    CarMoveAnim.startcarAnimation(marker,mMap,start,end,1000,null);

                                }


                              //  CarMoveAnim.startcarAnimation(marker,mMap,start,end,1000,null);


                                getAddress(Double.parseDouble(lat), Double.parseDouble(lon));


//
//
//
//                                LatLng sydney = new LatLng(Double.parseDouble(lat), Double.parseDouble(lon));
//                                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(sydney.latitude, sydney.longitude)).zoom(16).build();
//                                mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
//
//
//                                // Creating a marker
//                                MarkerOptions markerOptions = new MarkerOptions();
//
//
//                                int resourceId = this.getResources().getIdentifier("bus_"+num+"_marker_icon", "drawable", this.getPackageName());
////
//                                // Setting the position for the marker
//                                markerOptions.position(sydney);
//                                markerOptions.icon(BitmapDescriptorFactory
//                                        .fromResource(resourceId));
//
//                                // Setting the title for the marker.
//                                // This will be displayed on taping the marker
//                                markerOptions.title("Speed :" + speed + " - " + "Time :" + time);
//
//                                // Clears the previously touched position
//                                mMap.clear();
//
//                                // Animating to the touched position
////                            mMap.animateCamera(CameraUpdateFactory.newLatLng(sydney));
//
//                                // Placing a marker on the touched position
//                                mMap.addMarker(markerOptions);
                              //  int resourceId = this.getResources().getIdentifier("bus_"+num+"_marker_icon", "drawable", this.getPackageName());
////





                            }
                            //driver_num = jObj.getString("driver_num");

                        } catch (JSONException e) {
                            e.printStackTrace();

                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        error.printStackTrace();
                       // Toast.makeText(getApplicationContext(), error.toString(), Toast.LENGTH_SHORT).show();
                    }
                });
        queue.add(stringRequest);



    }







    //
    //
    // get address **********************************************
    //


    public void getAddress(double lat, double lng) {
        Geocoder geocoder = new Geocoder(getApplicationContext(), Locale.getDefault());
        try {
            List<Address> addresses = geocoder.getFromLocation(lat, lng, 1);
            Address obj = addresses.get(0);
            String add = obj.getAddressLine(0);
//            add = add + "\n" + obj.getCountryName();
//            add = add + "\n" + obj.getCountryCode();
//            add = add + "\n" + obj.getAdminArea();
//            add = add + "\n" + obj.getPostalCode();
//            add = add + "\n" + obj.getSubAdminArea();
//            add = add + "\n" + obj.getLocality();
//            add = add + "\n" + obj.getSubThoroughfare();

            Log.v("IGA", "Address" + add);
          // Toast.makeText(this, "" + add,Toast.LENGTH_SHORT).show();
            loc.setText(add);




            //   MapsActivity.showDialog(add);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
           // Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }







    //
    //
    // other functions ******************************************
    //
    //
    //



    @Override
    public void onDestroy() {
        super.onDestroy();
        mapview1.onDestroy();
    }

    @Override
    public void onStart() {
        super.onStart();
        mapview1.onStart();
    }

    @Override
    public void onPause() {
        super.onPause();
        mapview1.onPause();
    }
    @Override
    public void onResume() {
        super.onResume();
        mapview1.onResume();
    }

    @Override
    public void onStop() {
        super.onStop();
        mapview1.onStop();
    }





    @Deprecated
    public void showMessage(String _s) {
        Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();

        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putString("intent","not" );
        myEdit.putString("start","done" );
        myEdit.commit();
        timer.cancel();
        finish();

    }


}





