package com.lec.java.collection04;

public class MemberModel {
	private String id;
	private String passwd;

	private int age;
	
	public MemberModel() {}
	public MemberModel(String id, String pw, int age) {
		this.id = id;
		this.passwd = pw;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void displayInfo() {
		System.out.println("아이디: " + id);
		System.out.println("비밀번호: " + passwd);
		System.out.println("나이: " + age);
	}
	
	@Override
	public String toString() {
		return String.format(	// static 메소드네... 이제 보이네...
				"[id:%s, pw:%s, age:%d]", id, passwd, age);
	}
	
} // end class MemberModel




