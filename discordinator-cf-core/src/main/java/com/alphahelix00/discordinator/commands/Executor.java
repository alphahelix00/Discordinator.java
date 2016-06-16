package com.alphahelix00.discordinator.commands;

import java.util.LinkedList;

/**
 * Created on: 6/15/2016
 * Author:     Kevin Xiao
 */
@FunctionalInterface
public interface Executor {

    void execute(LinkedList<String> args) throws Exception;
}
