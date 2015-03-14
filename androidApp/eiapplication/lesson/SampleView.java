package com.example.taka.eiapplication.lesson;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

/**
 * Created by taka on 2015/03/14.
 */
public class SampleView extends View {

    private Paint paint = new Paint();

    public SampleView(Context context){
        super(context);
        setBackgroundColor(Color.WHITE);
    }
    @Override
    public void onDraw(Canvas canvas){

        paint.setColor(Color.RED);
        canvas.drawCircle(100, 100, 5, paint);
    }

}
