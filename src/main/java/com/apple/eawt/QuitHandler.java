package com.apple.eawt;

public interface QuitHandler {

	public void handleQuitRequestWith(AppEvent.QuitEvent e, QuitResponse response);
}
