package bbs.app;

import bbs.manager.BoardManager;

public class BoardApp {
	public static void main(String[] args) {
		BoardManager manager = new BoardManager();
		manager.list();
	}
}
