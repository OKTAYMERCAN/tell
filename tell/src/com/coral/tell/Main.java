package com.coral.tell;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	private final String HELLO_MESSAGE = "Hello world! This plugin (tell) Made by Oktay Mercan";
	private final String GOODBYE_MESSAGE = "Goodbye world!";
	
	@Override
	public void onEnable ()
	{
		getLogger().info (HELLO_MESSAGE);
	}
	
	@Override
	public void onDisable ()
	{
		getLogger().info (GOODBYE_MESSAGE);
	}

}