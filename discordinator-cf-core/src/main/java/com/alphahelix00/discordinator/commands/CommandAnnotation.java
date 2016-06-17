package com.alphahelix00.discordinator.commands;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created on: 6/15/2016
 * Author:     Kevin Xiao
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CommandAnnotation {

    String prefix() default CommandDefaults.PREFIX;

    String[] subCommands() default {};

    boolean requireMention() default CommandDefaults.REQUIRE_MENTION;

    String perm() default CommandDefaults.PERMISSION;

    boolean allowPrivateMessage() default CommandDefaults.ALLOW_PRIVATE_MESSAGES;

    boolean allowChannelMessage() default CommandDefaults.ALLOW_CHANNEL_MESSAGES;

    boolean mainCommand() default CommandDefaults.MAIN_COMMAND;

    String name();

    String[] alias();

    String desc();

}