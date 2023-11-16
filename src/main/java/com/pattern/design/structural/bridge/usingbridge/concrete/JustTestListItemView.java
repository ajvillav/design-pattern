package com.pattern.design.structural.bridge.usingbridge.concrete;

import com.pattern.design.structural.bridge.usingbridge.abstraction.IViewModel;
import com.pattern.design.structural.bridge.usingbridge.abstraction.ListItemView;

public class JustTestListItemView extends ListItemView {
    public JustTestListItemView(IViewModel viewModel) {
        super(viewModel);
    }
    @Override
    public void render() {
        System.out.println("------------------------------");
        System.out.println(String.format("Just render title: %s", this.viewModel.title()));
        System.out.println("------------------------------");
        System.out.println("\n");
    }
}
