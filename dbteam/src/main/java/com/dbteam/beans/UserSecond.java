package com.dbteam.beans;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class UserSecond {
	public int id;

	@NotBlank(message = "�û�������Ϊ��")
	public String userName;
	@NotBlank(message = "΢��������Ϊ��")
	public String userWeChat;
	@Pattern(regexp="[1][3|4|5|6|7|8][0-9]{9}",message="�ֻ������ʽ����ȷ")
	public String userPhone;

	public String workingPosition;

	public String remark;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserWeChat() {
		return userWeChat;
	}

	public void setUserWeChat(String userWeChat) {
		this.userWeChat = userWeChat;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getWorkingPosition() {
		return workingPosition;
	}

	public void setWorkingPosition(String workingPosition) {
		this.workingPosition = workingPosition;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
