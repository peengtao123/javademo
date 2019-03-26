package org;

import java.util.logging.Level;

public abstract class Handler {
    private Handler nextHanler;

    public void setNextHanler(Handler hanler)
    {
        this.nextHanler = hanler;
    }
    protected abstract Level getHandlerLevel();
}
