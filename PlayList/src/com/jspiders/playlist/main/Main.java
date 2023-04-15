package com.jspiders.playlist.main;

import com.jspiders.playlist.resource.Menu;

public class Main {
	public static void main(String[] args) {
		Menu menu =new Menu();
		
		menu.loadPlaylist();
		menu.runMenu();
	}

}
