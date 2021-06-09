package com.perf.timer;

import org.openjdk.jmh.annotations.GenerateMicroBenchmark;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CompareTimerJMH {

    @GenerateMicroBenchmark
    public void makeObjectWithSize() {
        HashMap<String, String> map = new HashMap<>(10);
        List<String> list = new ArrayList<>(10);
    }
}
