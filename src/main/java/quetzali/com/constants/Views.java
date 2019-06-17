package quetzali.com.constants;

public enum Views {
	INDEX("index"),
	USUARIOS("all_users"),
	USUARIO_DERALLE("registry"),
	USER_REGISTRY("update");
	
	private String view;
	private Views(String view) {
		this.view=view;
	}
	public String getView() {
		return view;
	}

}
