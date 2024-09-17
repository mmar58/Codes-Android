package com.mmar.asis;
import android.view.View;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.content.Context;
import android.view.MotionEvent;
public class myView extends View
{   public myView(Context con){
	super(con);
}
	public myView(Context con,AttributeSet ar){
		super(con,ar);
	}

	@Override
	protected void onDraw(Canvas can)
	{
		// TODO: Implement this method
	}

	@Override
	public boolean onTouchEvent(MotionEvent event)
	{
		// TODO: Implement this method
		return true;
	}
	
}