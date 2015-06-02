package com.googlecode.jmapper.flattenEncapsulate.bean;

import com.googlecode.jmapper.annotations.JGlobalMap;
import com.googlecode.jmapper.annotations.JMapConversion;
import com.googlecode.jmapper.annotations.JMapConversion.Type;

@JGlobalMap("user")
public class Flatten {

        private String name;
        private String surname;
        private String address;
        private String number;

        public Flatten() {}
        
        public Flatten(String name, String surname, String address, String number) {
			super();
			this.name = name;
			this.surname = surname;
			this.address = address;
			this.number = number;
		}

		@JMapConversion(from={"name","surname","address","number"},type=Type.DYNAMIC,avoidSet=true)
        public static String fromFlatten(){
                return "${destination}.${source.set}(${source});";
        }
        
        @JMapConversion(from={"user"},type=Type.DYNAMIC)
        public static String fromEncapsulate(){
                return "return ${source}.${destination.get}();";
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
