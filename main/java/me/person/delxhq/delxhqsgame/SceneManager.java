package me.person.delxhq.delxhqsgame;

import android.graphics.Canvas;
import android.view.MotionEvent;

import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by delxh on 01/05/2017.
 */

public class SceneManager {
    private AbstractList<Scene> scenes = new ArrayList<>();
    public static int ACTIVE_SCENE;

    public SceneManager() {
        ACTIVE_SCENE = 0;
        scenes.add(new GameplayScene());
    }

    public void receiveTouch(MotionEvent event) {

        scenes.get(ACTIVE_SCENE).receiveTouch(event);
    }

    public void update() {

        scenes.get(ACTIVE_SCENE).update();
    }

    void draw(Canvas canvas) {

        scenes.get(ACTIVE_SCENE).draw(canvas);
    }
}