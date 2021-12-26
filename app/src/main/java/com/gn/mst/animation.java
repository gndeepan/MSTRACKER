package com.gn.mst;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Timer;
import java.util.TimerTask;

public class animation {
    private static Timer _timer;
    private static  TimerTask t;


    public static void _UI_GradientLR(final View _view, final String _left, final String _right, final double _lt, final double _rt, final double _lb, final double _rb, final double _str, final String _str_color, final double _ele, final String _ripple) {
        android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
        int clrs[] = new int[]{
                Color.parseColor(_left), Color.parseColor(_right)
        };
        gd.setColors(clrs);
        gd.setOrientation(android.graphics.drawable.GradientDrawable.Orientation.TL_BR);
        gd.setStroke((int)_str, Color.parseColor(_str_color));
        gd.setCornerRadii(new float[] {(float)_lt, (float)_lt, (float)_rt, (float)_rt, (float)_rb, (float)_rb, (float)_lb, (float)_lb});
        _view.setElevation((int)_ele);
        android.content.res.ColorStateList clrbs = new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor(_ripple)});
        android.graphics.drawable.RippleDrawable ripdrb = new android.graphics.drawable.RippleDrawable(clrbs , gd, null);
        _view.setBackground(ripdrb);
    }


    public  static void _Animator (final View _view, final String _propertyName, final double _value, final double _duration) {
        ObjectAnimator anim = new ObjectAnimator();
        anim.setTarget(_view);
        anim.setPropertyName(_propertyName);
        anim.setFloatValues((float)_value);
        anim.setDuration((long)_duration);
        anim.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        anim.start();
    }


    public  static void _TransitionManager (final View _view, final double _duration) {
        LinearLayout viewgroup =(LinearLayout) _view;

        android.transition.AutoTransition autoTransition = new android.transition.AutoTransition(); autoTransition.setDuration((long)_duration); android.transition.TransitionManager.beginDelayedTransition(viewgroup, autoTransition);
    }


    public  static void _setHeight (final View _view, final double _heightValue, final double _widthValue) {
        _view.getLayoutParams().height = (int)_heightValue;
        _view.requestLayout();
        _view.getLayoutParams().width = (int)_widthValue;
        _view.requestLayout();
    }


    public  static void _FadeOut (final View _view, final double _duration) {
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

            public void runOnUiThread(Runnable runnable) {
            }
        };
        _timer.schedule(t, (int)(_duration));
    }

    public static  void _shape (final double _top1, final double _top2, final double _bottom2, final double _bottom1, final String _inside_color, final String _side_color, final double _side_size, final View _view) {
        Double tlr = _top1;
        Double trr = _top2;
        Double blr = _bottom2;
        Double brr = _bottom1;
        Double sw = _side_size;
        android.graphics.drawable.GradientDrawable s = new android.graphics.drawable.GradientDrawable();
        s.setShape(android.graphics.drawable.GradientDrawable.RECTANGLE);
        s.setCornerRadii(new float[] {tlr.floatValue(),tlr.floatValue(), trr.floatValue(),trr.floatValue(), blr.floatValue(),blr.floatValue(), brr.floatValue(),brr.floatValue()});

        s.setColor(Color.parseColor(_inside_color));
        s.setStroke(sw.intValue(), Color.parseColor(_side_color));
        _view.setBackground(s);
    }

}
