package com.beerpong.game.model;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.beerpong.game.model.entities.SimpleModel;

import static com.beerpong.game.view.GameView.VIEWPORT_WIDTH;


/**
 * Created by Sofia on 5/27/2017.
 */

public class GameModel extends Stage {
    private static GameModel instance;

    private SimpleModel ball;

    private SimpleModel ground;
    private SimpleModel roof;
    private SimpleModel leftWall;
    private SimpleModel rightWall;
    private SimpleModel cup;

    public static GameModel getInstance() {
        if (instance == null)
            instance = new GameModel();
        return instance;
    }

    private GameModel() {


        float ratio = ((float) Gdx.graphics.getHeight() / (float) Gdx.graphics.getWidth());
        ball = new SimpleModel(  VIEWPORT_WIDTH *ratio *0.2f,VIEWPORT_WIDTH/2 ,0);
        cup = new SimpleModel(  VIEWPORT_WIDTH *0.8f, VIEWPORT_WIDTH *0.1f ,0);

        ground = new SimpleModel(0,0,0);
        leftWall = new SimpleModel(0,0,0);
        roof = new SimpleModel(0,VIEWPORT_WIDTH *ratio,0);
        rightWall = new SimpleModel(VIEWPORT_WIDTH ,0,0);


    }

    public SimpleModel getBall(){
        return ball;
    }

    public SimpleModel getCup() {return cup;}

    public SimpleModel getGround(){return ground;}
    public SimpleModel getRoof(){return roof;}
    public SimpleModel getLeftWall(){return leftWall;}
    public SimpleModel getRightWall(){return rightWall;}

}
