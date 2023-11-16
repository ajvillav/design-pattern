package com.pattern.design.structural.bridge.usingbridge.abstraction;

public abstract class ListItemView {
    protected IViewModel viewModel;  // Esto es el bridge
    public ListItemView(IViewModel viewModel) {
        this.viewModel = viewModel;
    }
    public void render() {
        System.out.println("default abstract render");
    }
}