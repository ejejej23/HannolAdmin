package com.sp.staff;

// 세션에 저장할 정보(아이디, 이름, 권한등)
public class SessionInfo {
	private long staffIdx;
	private String staffId;
	private String staffName;
	private int staffLevel;

	public long getStaffIdx() {
		return staffIdx;
	}

	public void setStaffIdx(long staffIdx) {
		this.staffIdx = staffIdx;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public int getStaffLevel() {
		return staffLevel;
	}

	public void setStaffLevel(int staffLevel) {
		this.staffLevel = staffLevel;
	}

}
