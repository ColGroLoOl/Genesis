package com.colgrolool.genesis.commands;

import meteordevelopment.meteorclient.systems.commands.Commands;

public class GCommands {
    public static void register() {
        Commands commands = Commands.get();

        commands.add(new CommandExample());
    }
}
