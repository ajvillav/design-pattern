package com.pattern.design.structural.bridge.usingbridge.concrete;

import com.pattern.design.structural.bridge.usingbridge.abstraction.IViewModel;

import java.util.Map;

public class VideoViewModel implements IViewModel {

    private Map<String, String> video;

    public VideoViewModel(Map<String, String> video) {
        this.video = video;
    }

    @Override
    public String title() {
        return String.format("(VIDEO) %s", this.video.get("title"));
    }

    @Override
    public String image() {
        return String.format("(VIDEO) %s", this.video.get("image"));
    }
}
