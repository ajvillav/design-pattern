package com.pattern.design.structural.bridge.usingbridge.concrete;

import com.pattern.design.structural.bridge.usingbridge.abstraction.IViewModel;

import java.util.Map;

public class StreamViewModel implements IViewModel {
    private Map<String, String> stream;
    public StreamViewModel(Map<String, String> stream) {
        this.stream = stream;
    }

    @Override
    public String title() {
        return String.format("(STREAM) %s Currently viewing %s", this.stream.get("title"), this.stream.get("viewers"));
    }

    @Override
    public String image() {
        return String.format("(STREM) %s", this.stream.get("image"));
    }
}
