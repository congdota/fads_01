package com.framgia.action;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;

import com.framgia.model.User;
import com.framgia.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private UserService userService;
	private List<User> users;
	private User user;
	private String searchKeyword;
	private Integer id;
	private final String path = "/home/namnguyen/Desktop/upload/";
	private File fileUpload;
	private String fileUploadContentType;
	private String fileUploadFileName;
	private String confirmPassword;
	private String currentPass;
	private String newPass;
	private String reenterPass;
	private Map<String, Object> sessionAttributes;

	public String execute() {
		return SUCCESS;
	}

	public String changePasswordAction() {
		return SUCCESS;
	}

	@SuppressWarnings("unchecked")
	public String changepassword() {
		Map<String, Object> session = (Map<String, Object>) ActionContext.getContext().get("session");

		user = (User) session.get("USER");
		if (changePassValidate()) {
			return INPUT;
		}
		User us = userService.findByUsername(user.getUsername());
		if (us == null) {
			return INPUT;
		}

		us.setPassword(newPass);
		userService.saveOrUpdate(us);
		session.put("USER", us);
		return SUCCESS;
	}

	public String index() {
		users = userService.findAll();
		return SUCCESS;
	}

	public String detail() {
		user = userService.findById(id);
		return SUCCESS;
	}

	public String resetPassword() {
		return SUCCESS;
	}

	public String newUser() {
		return SUCCESS;
	}

	public boolean saveFile() {
		boolean flag = true;
		try {
			File fileToCreate = new File(path, fileUploadFileName);
			FileUtils.copyFile(fileUpload, fileToCreate);
			user.setAvatar(fileUploadFileName);
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}

	public String saveOrUpdateUser() {
		if (adduserValidate()) {
			return INPUT;
		}
		if (saveFile()) {
			userService.saveOrUpdate(user);
		}
		return SUCCESS;
	}

	public boolean adduserValidate() {
		if (StringUtils.isEmpty(user.getUsername()) || StringUtils.isEmpty(user.getPassword())
				|| StringUtils.isEmpty(user.getBirthday().toString()) || StringUtils.isEmpty(user.getFullname())
				|| StringUtils.isEmpty(user.getAvatar())) {
			addFieldError("user.username", getText("users.username.required"));
			addFieldError("user.password", getText("users.password.required"));
			addFieldError("user.birthday", getText("users.birthday.required"));
			addFieldError("user.fullname", getText("users.fullname.required"));
			addFieldError("user.avatar", getText("users.avatar.required"));
			return true;
		}
		return false;
	}

	boolean changePassValidate() {
		if (StringUtils.isEmpty(currentPass) || StringUtils.isEmpty(newPass) || StringUtils.isEmpty(reenterPass)
				|| currentPass != user.getPassword() || reenterPass != newPass) {
			addFieldError("currentPass", getText("users.password.equalCurrentPass"));
			addFieldError("currentPass", getText("users.password.currentPass.required"));
			addFieldError("newPass", getText("users.password.newPass.required"));
			addFieldError("reenterPass", getText("users.password.reEnterPass.required"));
			addFieldError("reenterPass", getText("users.password.equalNewpass"));
			return true;
		}
		return false;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public File getFileUpload() {
		return fileUpload;
	}

	public void setFileUpload(File fileUpload) {
		this.fileUpload = fileUpload;
	}

	public String getFileUploadContentType() {
		return fileUploadContentType;
	}

	public void setFileUploadContentType(String fileUploadContentType) {
		this.fileUploadContentType = fileUploadContentType;
	}

	public String getFileUploadFileName() {
		return fileUploadFileName;
	}

	public void setFileUploadFileName(String fileUploadFileName) {
		this.fileUploadFileName = fileUploadFileName;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getCurrentPass() {
		return currentPass;
	}

	public void setCurrentPass(String currentPass) {
		this.currentPass = currentPass;
	}

	public String getNewPass() {
		return newPass;
	}

	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}

	public String getReenterPass() {
		return reenterPass;
	}

	public void setReenterPass(String reenterPass) {
		this.reenterPass = reenterPass;
	}

	public Map<String, Object> getSessionAttributes() {
		return sessionAttributes;
	}

	public void setSessionAttributes(Map<String, Object> sessionAttributes) {
		this.sessionAttributes = sessionAttributes;
	}
}
