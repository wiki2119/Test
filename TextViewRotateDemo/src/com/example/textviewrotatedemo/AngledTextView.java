package com.example.textviewrotatedemo;

import java.util.Random;

import android.content.Context;  
import android.graphics.Canvas;  
import android.util.AttributeSet;  
import android.widget.TextView;  
  
public class AngledTextView extends TextView  
{  
    public AngledTextView(Context context, AttributeSet attrs)  
    {  
        super(context, attrs);  
  
    }  
  
    @Override  
    protected void onDraw(Canvas canvas)  
    {  
    	Random rnd = new Random();
        //Save the current matrix  
        canvas.save();  
        //Rotate this View at its center  
        canvas.rotate(rnd.nextInt()*90, this.getWidth()/2, this.getHeight()/2);  
        //Draw it  
        super.onDraw(canvas);  
        //Restore to the previous matrix  
        canvas.restore();  
    }  
}  
