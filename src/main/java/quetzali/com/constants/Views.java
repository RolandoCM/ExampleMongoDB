package quetzali.com.constants;

public enum Views {
	USUARIOS("all_users"),
	USUARIO_DERALLE("user_details"),
	USER_REGISTRY("user_registry");
	
	private String view;
	private Views(String view) {
		this.view=view;
	}
	public String getView() {
		return view;
	}

}
