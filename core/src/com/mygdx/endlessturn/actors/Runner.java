package com.mygdx.endlessturn.actors;

import com.badlogic.gdx.physics.box2d.Body;
import com.mygdx.endlessturn.box2d.RunnerUserData;

public class Runner extends GameActor {

    private boolean jumping;

    public Runner(Body body) {
        super(body);
    }

    @Override
    public RunnerUserData getUserData() {
        return (RunnerUserData) userData;
    }

    public void jump() {

        if (!jumping) {
            body.applyLinearImpulse(getUserData().getJumpingLinearImpulse(), body.getWorldCenter(), true);
            jumping = true;
        }

    }

    public void landed() {
        jumping = false;
    }

}