package com.colgrolool.genesis;

import com.colgrolool.genesis.commands.GCommands;
import com.colgrolool.genesis.modules.GModules;
import com.colgrolool.genesis.utils.misc.MathUtils;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import org.slf4j.Logger;

public class Genesis extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        LOG.info("Initializing Genesis");
        long start = MathUtils.now();

        GModules.register();
        GCommands.register();

        LOG.info("Initialized in " + MathUtils.msPassedRound(start) + "ms");
    }

    @Override
    public void onRegisterCategories() {
        GModules.registerCategories();
    }

    @Override
    public String getPackage() {
        return "com.colgrolool.genesis";
    }
}
