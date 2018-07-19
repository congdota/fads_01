package com.framgia.action;

import java.io.File;

import org.apache.commons.lang.StringUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.framgia.model.User;
import com.framgia.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

import common.UserCustomFile;

public class UserClientAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private UserService userService;
	private User user;
	private String reenterPass;
	private String confirmPassword;
	private File myFiles;
	private String myFilesFileName;
	private String myFilesContentType;
	private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	public boolean saveFiles() {
		try {
			UserCustomFile.saveFileLocal(myFiles, myFilesFileName);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public String addUser() {

		user.setAvatar(getMyFilesFileName());
		if (!saveFiles())
			return INPUT;
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userService.addUser(user);
		return SUCCESS;
	}

	private boolean checkExistUser() {
		if (userService.findByUsername(user.getUsername()) != null)
			return false;
		return true;
	}

	public void validate() {
		if (user == null || StringUtils.isEmpty(user.getUsername())) {
			addFieldError("user.username", getText("users.username.required"));
		}
		/*
		 * if (user == null || checkExistUser()) { addFieldError("user.username",
		 * getText("users.username.exist")); }
		 */
		if (user == null || StringUtils.isEmpty(user.getPassword())) {
			addFieldError("user.password", getText("users.password.required"));
		}
		if (user == null || !reenterPass.equals(user.getPassword())) {
			addFieldError("reenterPass", getText("users.password.equalNewpass"));
		}
		// if (user == null || user.getBirthday() == null ||
		// user.getBirthday().equals("")) {
		// addFieldError("user.birthday", getText("users.birthday.required"));
		// }
		if (user == null || StringUtils.isEmpty(user.getFullname())) {
			addFieldError("user.fullname", getText("users.fullname.required"));
		}
//		if (getMyFiles() == null) {
//			addFieldError("myFiles", getText("users.avatar.required"));
//		}
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getReenterPass() {
		return reenterPass;
	}

	public void setReenterPass(String reenterPass) {
		this.reenterPass = reenterPass;
	}

	public void setMyFiles(File myFiles) {
		this.myFiles = myFiles;
	}

	public void setMyFilesFileName(String myFilesFileName) {
		this.myFilesFileName = myFilesFileName;
	}

	public void setMyFilesContentType(String myFilesContentType) {
		this.myFilesContentType = myFilesContentType;
	}

	public BCryptPasswordEncoder getPasswordEncoder() {
		return passwordEncoder;
	}

	public void setPasswordEncoder(BCryptPasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}

	public File getMyFiles() {
		return myFiles;
	}

	public String getMyFilesFileName() {
		return myFilesFileName;
	}

	public String getMyFilesContentType() {
		return myFilesContentType;
	}
}
