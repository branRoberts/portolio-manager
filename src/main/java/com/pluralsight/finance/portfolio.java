package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class portfolio {
    private String name;
    private String owner;
    private List<Valuable> assets;

    public portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }
    public void add(Valuable asset) {
        assets.add(asset);
    }
    public double getValue(){
        double valueTotal = 0;
        for (Valuable asset : assets) {
            valueTotal += asset.getValue();
        }
    return valueTotal; }
    public Valuable getMostValuable(){
        Valuable mostValuableAsset = assets.get(0);
        double mostValuableAssetValue = mostValuableAsset.getValue();
        for (Valuable asset : assets) {
            double currentAssetValue = asset.getValue();
            if (currentAssetValue > mostValuableAssetValue) {
                mostValuableAsset = asset;
                mostValuableAssetValue = currentAssetValue;
            }
        }
    return mostValuableAsset;}
    public Valuable getLeastValuable(){
        Valuable leastValuableAsset = assets.get(0);

    }
}

