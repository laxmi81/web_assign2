package com.user.info;

import java.util.List;

public class Root {
	  private String username;
	    private String password;
	    private List<Integer> sessionid;
	    @SuppressWarnings("unused")
		private String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public List<Integer> getSessionid() {
			return sessionid;
		}
		public void setSessionid(List<Integer> sessionid) {
			this.sessionid = sessionid;
		}
		public List<Student> getStudents() {
			return students;
		}
		public void setStudents(List<Student> students) {
			this.students = students;
		}
		public List<Student> students;
}
