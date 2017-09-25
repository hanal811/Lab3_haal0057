package com.example.hannes.lab3_haal0057;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.gesture.Gesture;
import android.widget.TextView;

import static android.view.GestureDetector.*;

public class MainActivity extends AppCompatActivity
        implements OnGestureListener, OnDoubleTapListener {

    private static TextView txt;
    private GestureDetectorCompat gest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gest = new GestureDetectorCompat(this, this);
        gest.setOnDoubleTapListener(this);
        txt = (TextView) findViewById(R.id.txten);
    }

    @Override
    public boolean onTouchEvent (MotionEvent event) {
        gest.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        txt.setText("Single tap");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        txt.setText("Double tap");
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        txt.setText("Double tap");
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        txt.setText("Scrolling");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        txt.setText("Long press");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        txt.setText("Fling");
        return false;
    }
}
