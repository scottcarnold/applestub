package com.apple.eawt;

public class Application {
	
	private static final Application application = new Application();
	
	public static Application getApplication() {
		return application;
	}
	
	@Deprecated
	public void addApplicationListener(ApplicationAdapter adapter) {
	}
	
	@Deprecated
	public void addAboutMenuItem() {
	}
	
	@Deprecated
	public void addPreferencesMenuItem() {
	}
	
	@Deprecated
	public void setEnabledAboutMenu(boolean enabled) {
	}
	
	@Deprecated
	public void setEnabledPreferencesMenu(boolean enabled) {
	}
	
	public void setPreferencesHandler(PreferencesHandler handler) {
	}
	
	public void setAboutHandler(AboutHandler handler) {
	}
	
	public void setQuitHandler(QuitHandler handler) {
	}
}
