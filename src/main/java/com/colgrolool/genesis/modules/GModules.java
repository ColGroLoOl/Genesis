package com.colgrolool.genesis.modules;

import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;

public class GModules {
    public static final Category GMISC = new Category("GMisc");

    public static void register() {
        Modules modules = Modules.get();

        modules.add(new ModuleExample());
    }

    public static void registerCategories() {
        Modules.registerCategory(GMISC);
    }
}
