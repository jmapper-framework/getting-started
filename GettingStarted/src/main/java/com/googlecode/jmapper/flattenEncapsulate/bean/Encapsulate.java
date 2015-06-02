package com.googlecode.jmapper.flattenEncapsulate.bean;

public class Encapsulate {
	
	private User user;
    
	public Encapsulate() {
		user = new User();
	}
	
	
    public Encapsulate(User user) {
		super();
		this.user = user;
	}


	public static class User {
            
            private String name;
            private String surname;
            private String address;
            private String number;
            
            public User() {}
            
			public User(String name, String surname, String address,
					String number) {
				super();
				this.name = name;
				this.surname = surname;
				this.address = address;
				this.number = number;
			}

			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getSurname() {
				return surname;
			}
			public void setSurname(String surname) {
				this.surname = surname;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public String getNumber() {
				return number;
			}
			public void setNumber(String number) {
				this.number = number;
			}
            
    }

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
    
    
}
