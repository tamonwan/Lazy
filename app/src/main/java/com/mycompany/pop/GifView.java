package com.mycompany.pop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.view.View;

import java.io.InputStream;

/**
 * Created by Pop on 11/16/2015 AD.
 */
public class GifView extends View{

    Movie movie,movie1;
    InputStream is = null,is1 = null;
    long moviestart;

    public GifView(Context context){
        super(context);
        is = context.getResources().openRawResource(+R.drawable.giphy);
        movie = Movie.decodeStream(is);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        long now=android.os.SystemClock.uptimeMillis();
        System.out.println("now="+now);
        if (moviestart == 0) { // first time
            moviestart = now;

        }
        System.out.println("\tmoviestart="+moviestart);
        int relTime = (int)((now - moviestart) % movie.duration()) ;
        System.out.println("time="+relTime+"\treltime="+movie.duration());
        movie.setTime(relTime);
        movie.draw(canvas, this.getWidth() / 2 , this.getHeight() / 2);
        this.invalidate();
    }
}



