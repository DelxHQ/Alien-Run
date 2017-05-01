package me.person.delxhq.delxhqsgame;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;

/**
 * Created by delxh on 01/05/2017.
 */

public class RectPlayer implements GameObject {

    private Rect rectangle;
    public Rect getRectangle;
    private int color;


    public Rect getRectangle() {
        return rectangle;
    }

    public RectPlayer(Rect rectangle, int color) {
        this.rectangle = rectangle;
        this.color = color;
    }

    @Override
    public void draw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(color);
        canvas.drawRect(rectangle, paint);
    }

    @Override
    public void update() {

    }

    @Override
    public void update(Point point) {
        rectangle.set(point.x - rectangle.width()/2, point.y - rectangle.height()/2, point.x + rectangle.width()/2, point.y + rectangle.height()/2);

    }
}
