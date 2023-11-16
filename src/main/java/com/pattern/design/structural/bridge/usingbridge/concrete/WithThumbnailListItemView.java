package com.pattern.design.structural.bridge.usingbridge.concrete;

import com.pattern.design.structural.bridge.usingbridge.abstraction.IViewModel;
import com.pattern.design.structural.bridge.usingbridge.abstraction.ListItemView;

public class WithThumbnailListItemView extends ListItemView {

    public WithThumbnailListItemView(IViewModel viewModel) {
        super(viewModel);
    }
    @Override
    public void render() {
        System.out.println("------------------------------");
        System.out.println(String.format("Here render amazing thumbnail: %s", this.viewModel.image()));
        System.out.println(String.format("%s", this.viewModel.title()));
        System.out.println("------------------------------");
        System.out.println("\n");
    }
}
