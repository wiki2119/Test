package com.example.textviewrotatedemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	//The animation that rotates the Button and the TextView  
    Animation animation;  
  
    //Some View elements to be rotated  
    TextView tv;  

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tv = (TextView)findViewById(R.id.textView1);
    }

    @Override
    protected void onStart() {
    	// TODO Auto-generated method stub
    	super.onStart();
    	
/*    	 tv.startAnimation( 
    		        AnimationUtils.loadAnimation( this, 
    		            R.anim.rotatetext ) );
*/    	
    	/*//Initialize the Animation object  
        animation = new RotateAnimation(0, new Random().nextInt()*90f, 0, 0);  
        //"Save" the results of the animation  
        animation.setFillAfter(true);  
        //Set the animation duration to zero, just in case  
        animation.setDuration(0);
        
        //Assign the animation to the TextView  
        tv.setAnimation(animation);  */
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
