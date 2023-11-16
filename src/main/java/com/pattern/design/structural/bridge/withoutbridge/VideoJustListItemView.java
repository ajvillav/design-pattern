package com.pattern.design.structural.bridge.withoutbridge;

import java.util.Map;

public class VideoJustListItemView extends ListItemView {

    private Map<String, String> video;

    public VideoJustListItemView() {
    }

    @Override
    public void render() {
        System.out.println("------------------------------");
        System.out.println(String.format("Just render title: %s", title()));
        System.out.println("------------------------------");
        System.out.println("\n");
    }

    public String title() {
        return String.format("(VIDEO) %s", this.video.get("title"));
    }

    public String image() {
        return String.format("(VIDEO) %s", this.video.get("image"));
    }
}