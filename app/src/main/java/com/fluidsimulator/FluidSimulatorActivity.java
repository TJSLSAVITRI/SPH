package com.fluidsimulator;

import com.badlogic.gdx.backends.android.AndroidApplication;

import fluidsimulator.FluidSimulatorStarter;

public class FluidSimulatorActivity extends AndroidApplication {
    public void onCreate (android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initialize(new FluidSimulatorStarter(), true);
    }
}