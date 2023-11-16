package com.pattern.design.structural.bridge.usingbridge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.pattern.design.structural.bridge.usingbridge.abstraction.ListItemView;
import com.pattern.design.structural.bridge.usingbridge.concrete.JustTestListItemView;
import com.pattern.design.structural.bridge.usingbridge.concrete.StreamViewModel;
import com.pattern.design.structural.bridge.usingbridge.concrete.VideoViewModel;
import com.pattern.design.structural.bridge.usingbridge.concrete.WithThumbnailListItemView;

public class Main {
    public static void main(String[] args) {
        List<Map<String, String>> content = Arrays.asList(
            Map.of("type", "video",
                    "title","Casa del miedo",
                    "image", "Amazing image"),

            Map.of("type", "stream",
                    "title","Jugando pokemon",
                    "image", "Amazing image",
                    "viewers", "10"),

            Map.of("type", "stream",
                    "title","Aprendiendo Golang",
                    "image", "Amazing image",
                    "viewers", "1399"),

            Map.of("type", "video",
                    "title","Viajando a Tokio",
                    "image", "Amazing image"),

            Map.of("type", "video",
                    "title","Jesus vs Zeus",
                    "image", "Amazing image")
        );


        List<ListItemView> listViews = new ArrayList();
        for(Map<String, String> item : content) {

            if(item.get("type").equals("video")) {
                listViews.add(
                        Math.random() > 0.5  ?
                                new WithThumbnailListItemView(new VideoViewModel(item)) :
                                new JustTestListItemView(new VideoViewModel(item))
                );
            } else if (item.get("type").equals("stream")) {
                listViews.add(
                        Math.random() > 0.5  ?
                                new WithThumbnailListItemView(new StreamViewModel(item)) :
                                new JustTestListItemView(new StreamViewModel(item))
                );
            }
        }

        for(ListItemView view : listViews) {
            view.render();
        }
    }
}