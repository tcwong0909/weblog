package com.tcwong.pattern.delegate;

public class Boss {

    private Leader leader;

    public Boss() {
        leader = new Leader();
    }

    public void command(String command) {
        leader.command(command);
    }
}
