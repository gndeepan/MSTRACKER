package com.gn.mst;



import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.util.*;
import android.animation.*;

import java.util.*;

import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;
import android.graphics.Typeface;


import org.json.JSONException;
import org.json.JSONObject;


public class HomeActivity extends Activity {
    private final Timer _timer = new Timer();

    private boolean boolean1 = false;
    private boolean boolean2 = false;
    private Window w;

    private LinearLayout linear1;
    private ScrollView vscroll1;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private LinearLayout linear13;
    private LinearLayout linear14;
    private ImageView imageview8;
    private TextView textview15;
    private TextView textview14;
    private LinearLayout linear5;
    private LinearLayout linear6;


    private LinearLayout bus_no_1;
    private LinearLayout bus_no_2;
    private LinearLayout bus_no_3;
    private LinearLayout bus_no_4;
    private LinearLayout bus_no_5;
    private LinearLayout bus_no_6;
    private LinearLayout bus_no_7;
    private LinearLayout bus_no_8;
    private LinearLayout bus_no_9;
    private LinearLayout bus_no_10;
    private LinearLayout bus_no_11;
    private LinearLayout bus_no_12;
    private LinearLayout bus_no_13;
    private LinearLayout bus_no_14;
    private LinearLayout bus_no_15;

    private ImageView imageview1;
    private TextView textview1;
    private ImageView imageview3;
    private TextView textview5;
    private ImageView imageview5;
    private TextView textview9;
    private ImageView imageview2;
    private TextView textview3;
    private ImageView imageview4;
    private TextView textview7;
    private ImageView imageview6;
    private TextView textview11;
    private TextView textview12;
    private TextView textview13;
    private TextView textview144;
    private TextView textview1544;
    private TextView textview1144;

    private TextView textview11444;
    private TextView textview4411;


    private TimerTask t;
    private TimerTask timer;

    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        overridePendingTransition(0,0);
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.activity_home);

        w = this.getWindow();
        w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        w.setStatusBarColor(0xFF382751);
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        initialize(_savedInstanceState);
        initializeLogic();

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED,
                WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED);
    }

    private void initialize(Bundle _savedInstanceState) {
        linear1 = (LinearLayout) findViewById(R.id.linear1);
        vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
        linear2 = (LinearLayout) findViewById(R.id.linear2);
        linear3 = (LinearLayout) findViewById(R.id.linear3);
        linear4 = (LinearLayout) findViewById(R.id.linear4);
        linear13 = (LinearLayout) findViewById(R.id.linear13);
        linear14 = (LinearLayout) findViewById(R.id.linear14);
        imageview8 = (ImageView) findViewById(R.id.imageview8);
        textview15 = (TextView) findViewById(R.id.textview15);
        textview14 = (TextView) findViewById(R.id.textview14);
        linear5 = (LinearLayout) findViewById(R.id.linear5);
        linear6 = (LinearLayout) findViewById(R.id.linear6);





        bus_no_1 = (LinearLayout) findViewById(R.id.bus_no_1);
        bus_no_2 = (LinearLayout) findViewById(R.id.bus_no_2);
        bus_no_3 = (LinearLayout) findViewById(R.id.bus_no_3);
        bus_no_4 = (LinearLayout) findViewById(R.id.bus_no_4);
        bus_no_5 = (LinearLayout) findViewById(R.id.bus_no_5);
        bus_no_6 = (LinearLayout) findViewById(R.id.bus_no_6);
        bus_no_7 = (LinearLayout) findViewById(R.id.bus_no_7);
        bus_no_8 = (LinearLayout) findViewById(R.id.bus_no_8);
        bus_no_9 = (LinearLayout) findViewById(R.id.bus_no_9);
        bus_no_10 = (LinearLayout) findViewById(R.id.bus_no_10);
        bus_no_11 = (LinearLayout) findViewById(R.id.bus_no_11);
        bus_no_12 = (LinearLayout) findViewById(R.id.bus_no_12);
        bus_no_13 = (LinearLayout) findViewById(R.id.bus_no_13);
        bus_no_14 = (LinearLayout) findViewById(R.id.bus_no_14);
        bus_no_15 = (LinearLayout) findViewById(R.id.bus_no_15);



        imageview1 = (ImageView) findViewById(R.id.imageview1);
        textview1 = (TextView) findViewById(R.id.textview1);

        imageview3 = (ImageView) findViewById(R.id.imageview3);
        textview5 = (TextView) findViewById(R.id.textview5);

        imageview5 = (ImageView) findViewById(R.id.imageview5);
        textview9 = (TextView) findViewById(R.id.textview9);



        imageview2 = (ImageView) findViewById(R.id.imageview2);
        textview3 = (TextView) findViewById(R.id.textview3);

        imageview4 = (ImageView) findViewById(R.id.imageview4);
        textview7 = (TextView) findViewById(R.id.textview7);

        imageview6 = (ImageView) findViewById(R.id.imageview6);
        textview11 = (TextView) findViewById(R.id.textview11);
      //  linear3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0xFF40385A,0xFF382751, 0xFF382751}));

        bus_no_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
                SharedPreferences.Editor myEdit = sharedPreferences.edit();
                myEdit.putString("bus","355172102712450" );
                myEdit.putInt("no",16 );
                myEdit.commit();
                Intent i=new Intent(HomeActivity.this,
                        MainActivity.class);
                startActivity(i);
                finish();

            }
        });
        bus_no_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
                SharedPreferences.Editor myEdit = sharedPreferences.edit();
                myEdit.putString("bus","355172102729710" );
                myEdit.putInt("no",12 );
                myEdit.commit();
                Intent i=new Intent(HomeActivity.this,
                        MainActivity.class);
                startActivity(i);
                finish();

            }
        });
        bus_no_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
                SharedPreferences.Editor myEdit = sharedPreferences.edit();
                myEdit.putString("bus","355172102720164" );
                myEdit.putInt("no",14 );
                myEdit.commit();
                Intent i=new Intent(HomeActivity.this,
                        MainActivity.class);
                startActivity(i);
                finish();

            }
        });
        bus_no_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
                SharedPreferences.Editor myEdit = sharedPreferences.edit();
                myEdit.putString("bus","355172102729553" );
                myEdit.putInt("no",11 );
                myEdit.commit();
                Intent i=new Intent(HomeActivity.this,
                        MainActivity.class);
                startActivity(i);
                finish();

            }
        });
        bus_no_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
                SharedPreferences.Editor myEdit = sharedPreferences.edit();
                myEdit.putString("bus","355172102730361" );
                myEdit.putInt("no",29 );
                myEdit.commit();
                Intent i=new Intent(HomeActivity.this,
                        MainActivity.class);
                startActivity(i);
                finish();

            }
        });
        bus_no_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
                SharedPreferences.Editor myEdit = sharedPreferences.edit();
                myEdit.putString("bus","355172102720008" );
                myEdit.putInt("no",24 );
                myEdit.commit();
                Intent i=new Intent(HomeActivity.this,
                        MainActivity.class);
                startActivity(i);
                finish();

            }
        });
        bus_no_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
                SharedPreferences.Editor myEdit = sharedPreferences.edit();
                myEdit.putString("bus","355172102730080" );
                myEdit.putInt("no",22 );
                myEdit.commit();
                Intent i=new Intent(HomeActivity.this,
                        MainActivity.class);
                startActivity(i);
                finish();

            }
        });
        bus_no_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
                SharedPreferences.Editor myEdit = sharedPreferences.edit();
                myEdit.putString("bus","355172102725429" );
                myEdit.putInt("no",30 );
                myEdit.commit();
                Intent i=new Intent(HomeActivity.this,
                        MainActivity.class);
                startActivity(i);
                finish();

            }
        });
        bus_no_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
                SharedPreferences.Editor myEdit = sharedPreferences.edit();
                myEdit.putString("bus","355172102660139" );
                myEdit.putInt("no",31 );
                myEdit.commit();
                Intent i=new Intent(HomeActivity.this,
                        MainActivity.class);
                startActivity(i);
                finish();

            }
        });

        bus_no_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
                SharedPreferences.Editor myEdit = sharedPreferences.edit();
                myEdit.putString("bus","355172102717079" );
                myEdit.putInt("no",25 );
                myEdit.commit();
                Intent i=new Intent(HomeActivity.this,
                        MainActivity.class);
                startActivity(i);
                finish();

            }
        });

        bus_no_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
                SharedPreferences.Editor myEdit = sharedPreferences.edit();
                myEdit.putString("bus","355172102720107" );
                myEdit.putInt("no",19 );
                myEdit.commit();
                Intent i=new Intent(HomeActivity.this,
                        MainActivity.class);
                startActivity(i);
                finish();

            }
        });
        bus_no_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
                SharedPreferences.Editor myEdit = sharedPreferences.edit();
                myEdit.putString("bus","355172102717988" );
                myEdit.putInt("no",18 );
                myEdit.commit();
                Intent i=new Intent(HomeActivity.this,
                        MainActivity.class);
                startActivity(i);
                finish();

            }
        });
        bus_no_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
                SharedPreferences.Editor myEdit = sharedPreferences.edit();
                myEdit.putString("bus","355172102233887" );
                myEdit.putInt("no",6);
                myEdit.commit();
                Intent i=new Intent(HomeActivity.this,
                        MainActivity.class);
                startActivity(i);
                finish();

            }
        });
        bus_no_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
                SharedPreferences.Editor myEdit = sharedPreferences.edit();
                myEdit.putString("bus","355172102719976" );
                myEdit.putInt("no",21 );
                myEdit.commit();
                Intent i=new Intent(HomeActivity.this,
                        MainActivity.class);
                startActivity(i);
                finish();
             //   Toast.makeText(getApplicationContext(), "Bus Not installed Wait For Future Updates \uD83D\uDE15" ,Toast.LENGTH_SHORT).show();

            }
        });
        bus_no_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
                SharedPreferences.Editor myEdit = sharedPreferences.edit();
                myEdit.putString("bus","355172102711775" );
                myEdit.putInt("no",28 );
                myEdit.commit();
                Intent i=new Intent(HomeActivity.this,
                        MainActivity.class);
                startActivity(i);
                finish();
                //   Toast.makeText(getApplicationContext(), "Bus Not installed Wait For Future Updates \uD83D\uDE15" ,Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void initializeLogic() {
        _anim2();
        _anim();
        _UiDesign();






    }

    @Override
    protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
        super.onActivityResult(_requestCode, _resultCode, _data);
        switch (_requestCode) {

            default:
                break;
        }
    }

    public void _UiDesign () {
        textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), Typeface.BOLD);
        textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), Typeface.BOLD);
        textview5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), Typeface.BOLD);
        textview7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), Typeface.BOLD);
        textview9.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), Typeface.BOLD);
        textview11.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), Typeface.BOLD);
        textview15.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), Typeface.BOLD);
        textview14.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/poppins.ttf"), Typeface.BOLD);
        _setBackground(bus_no_3, 35, 20, "#EFF4FF", true);
        _setBackground(bus_no_2, 35, 20, "#EFF4FF", true);
        _setBackground(bus_no_1, 35, 20, "#EFF4FF", true);
        _setBackground(bus_no_6, 35, 20, "#EFF4FF", true);
        _setBackground(bus_no_5, 35, 20, "#EFF4FF", true);
        _setBackground(bus_no_4, 35, 20, "#EFF4FF", true);
        _setBackground(bus_no_7, 35, 20, "#EFF4FF", true);
        _setBackground(bus_no_8, 35, 20, "#EFF4FF", true);
        _setBackground(bus_no_9, 35, 20, "#EFF4FF", true);
        _setBackground(bus_no_10, 35, 20, "#EFF4FF", true);
        _setBackground(bus_no_11, 35, 20, "#EFF4FF", true);
        _setBackground(bus_no_12, 35, 20, "#EFF4FF", true);
        _setBackground(bus_no_13, 35, 20, "#EFF4FF", true);
        _setBackground(bus_no_14, 35, 20, "#EFF4FF", true);
        _setBackground(bus_no_15, 35, 20, "#EFF4FF", true);
    }


    public void _setBackground (final View _view, final double _radius, final double _shadow, final String _color, final boolean _ripple) {
        if (_ripple) {
            android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
            gd.setColor(Color.parseColor(_color));
            gd.setCornerRadius((int)_radius);
            _view.setElevation((int)_shadow);

            android.content.res.ColorStateList clrb = new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#463758")});
            android.graphics.drawable.RippleDrawable ripdrb = new android.graphics.drawable.RippleDrawable(clrb , gd, null);
            _view.setClickable(true);
            _view.setBackground(ripdrb);
        }
        else {
            android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
            gd.setColor(Color.parseColor(_color));
            gd.setCornerRadius((int)_radius);
            _view.setBackground(gd);
            _view.setElevation((int)_shadow);
        }
    }


    public void _Animator (final View _view, final String _propertyName, final double _value, final double _duration) {
        ObjectAnimator anim = new ObjectAnimator();
        anim.setTarget(_view);
        anim.setPropertyName(_propertyName);
        anim.setFloatValues((float)_value);
        anim.setDuration((long)_duration);
        anim.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        anim.start();
    }


    public void _anim () {
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        _FadeOut(bus_no_3, 400);
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(20));
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        bus_no_2.setVisibility(View.VISIBLE);
                        _FadeOut(bus_no_2, 400);
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(150));
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        bus_no_1.setVisibility(View.VISIBLE);
                        _FadeOut(bus_no_1, 400);
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(300));
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        bus_no_6.setVisibility(View.VISIBLE);
                        _FadeOut(bus_no_6, 400);
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(450));
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        bus_no_5.setVisibility(View.VISIBLE);
                        _FadeOut(bus_no_5, 400);
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(600));
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        bus_no_4.setVisibility(View.VISIBLE);
                        _FadeOut(bus_no_4, 400);
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(750));
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        _FadeOut(bus_no_3, 400);
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(20));
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        bus_no_7.setVisibility(View.VISIBLE);
                        _FadeOut(bus_no_7, 400);
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(150));
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        bus_no_8.setVisibility(View.VISIBLE);
                        _FadeOut(bus_no_8, 400);
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(300));
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        bus_no_9.setVisibility(View.VISIBLE);
                        _FadeOut(bus_no_9, 400);
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(450));
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        bus_no_10.setVisibility(View.VISIBLE);
                        _FadeOut(bus_no_10, 400);
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(600));
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        bus_no_11.setVisibility(View.VISIBLE);
                        _FadeOut(bus_no_11, 400);
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(20));
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        bus_no_12.setVisibility(View.VISIBLE);
                        _FadeOut(bus_no_12, 400);
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(150));
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        bus_no_13.setVisibility(View.VISIBLE);
                        _FadeOut(bus_no_13, 400);
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(300));
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        bus_no_14.setVisibility(View.VISIBLE);
                        _FadeOut(bus_no_14, 400);
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(350));
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        bus_no_14.setVisibility(View.VISIBLE);
                        _FadeOut(bus_no_15, 400);
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(750));

    }


    public void _FadeOut (final View _view, final double _duration) {
        _Animator(_view, "scaleX", 0, 200);
        _Animator(_view, "scaleY", 0, 200);
        t = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        _Animator(_view, "scaleX", 1, 200);
                        _Animator(_view, "scaleY", 1, 200);
                    }
                });
            }
        };
        _timer.schedule(t, (int)(_duration));
    }


    public void _anim2 () {
        bus_no_3.setScaleX((float)(0));
        bus_no_3.setScaleY((float)(0));
        bus_no_1.setScaleX((float)(0));
        bus_no_1.setScaleY((float)(0));
        bus_no_6.setScaleX((float)(0));
        bus_no_6.setScaleY((float)(0));
        bus_no_2.setScaleX((float)(0));
        bus_no_2.setScaleY((float)(0));
        bus_no_5.setScaleX((float)(0));
        bus_no_5.setScaleY((float)(0));
        bus_no_4.setScaleX((float)(0));
        bus_no_4.setScaleY((float)(0));
        bus_no_7.setScaleX((float)(0));
        bus_no_7.setScaleY((float)(0));
        bus_no_8.setScaleX((float)(0));
        bus_no_8.setScaleY((float)(0));
        bus_no_9.setScaleX((float)(0));
        bus_no_9.setScaleY((float)(0));
        bus_no_10.setScaleX((float)(0));
        bus_no_10.setScaleY((float)(0));
        bus_no_11.setScaleX((float)(0));
        bus_no_11.setScaleY((float)(0));
        bus_no_12.setScaleX((float)(0));
        bus_no_12.setScaleY((float)(0));
        bus_no_13.setScaleX((float)(0));
        bus_no_13.setScaleY((float)(0));
        bus_no_14.setScaleX((float)(0));
        bus_no_14.setScaleY((float)(0));
        bus_no_15.setScaleX((float)(0));
        bus_no_15.setScaleY((float)(0));
    }


    @TargetApi(Build.VERSION_CODES.P)
    public void _setBG (final View _view, final String _color1, final String _color2, final double _lt, final double _rt, final double _rb, final double _lb, final double _shadow, final String _shadowColor) {
        int[] colors = { Color.parseColor(_color1), Color.parseColor(_color2) }; android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, colors);
        gd.setCornerRadii(new float[]{(int)_lt,(int)_lt,(int)_rt,(int)_rt,(int)_rb,(int)_rb,(int)_lb,(int)_lb});
        _view.setBackground(gd);

        _view.setElevation((int)_shadow);
        _view.setOutlineSpotShadowColor(Color.parseColor(_shadowColor));
    }


    public void _sx2 (final View _view, final double _radius, final double _shadow, final String _color, final boolean _ripple) {
        if (_ripple) {
            android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
            gd.setColor(Color.parseColor(_color));
            gd.setCornerRadius((int)_radius);
            _view.setElevation((int)_shadow);

            android.content.res.ColorStateList clrb = new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#212121")});
            android.graphics.drawable.RippleDrawable ripdrb = new android.graphics.drawable.RippleDrawable(clrb , gd, null);
            _view.setClickable(true);
            _view.setBackground(ripdrb);
        }
        else {
            android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
            gd.setColor(Color.parseColor(_color));
            gd.setCornerRadius((int)_radius);
            _view.setBackground(gd);
            _view.setElevation((int)_shadow);
        }
    }


    public void _circularTransition (final View _view) {
        final int cx = _view.getMeasuredWidth()/2; final int cy =
                _view.getMeasuredHeight()/2; final int finalRadius =
                Math.max(_view.getWidth(),
                        _view.getHeight())/2;
        final Animator anim =
                ViewAnimationUtils.createCircularReveal(_view,cx,cy,0,finalRadius);
        _view.setVisibility(View.VISIBLE);
        anim.start();
    }


    @Deprecated
    public void showMessage(String _s) {
        Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
    }

    @Deprecated
    public int getLocationX(View _v) {
        int _location[] = new int[2];
        _v.getLocationInWindow(_location);
        return _location[0];
    }

    @Deprecated
    public int getLocationY(View _v) {
        int _location[] = new int[2];
        _v.getLocationInWindow(_location);
        return _location[1];
    }

    @Deprecated
    public int getRandom(int _min, int _max) {
        Random random = new Random();
        return random.nextInt(_max - _min + 1) + _min;
    }

    @Deprecated
    public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
        ArrayList<Double> _result = new ArrayList<Double>();
        SparseBooleanArray _arr = _list.getCheckedItemPositions();
        for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
            if (_arr.valueAt(_iIdx))
                _result.add((double)_arr.keyAt(_iIdx));
        }
        return _result;
    }

    @Deprecated
    public float getDip(int _input) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
    }

    @Deprecated
    public int getDisplayWidthPixels() {
        return getResources().getDisplayMetrics().widthPixels;
    }

    @Deprecated
    public int getDisplayHeightPixels() {
        return getResources().getDisplayMetrics().heightPixels;
    }
}
