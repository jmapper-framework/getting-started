package com.googlecode.jmapper.JMapAccessor;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.JMapAccessor.bean.JMapAccessorDest;
import com.googlecode.jmapper.JMapAccessor.bean.JMapAccessorSrc;

public class JMapAccessor {

	public static void main(String[] args) {
		
		JMapper<JMapAccessorDest,JMapAccessorSrc> mapper = new JMapper<JMapAccessorDest, JMapAccessorSrc>(JMapAccessorDest.class, JMapAccessorSrc.class);
		
		JMapAccessorDest destination = mapper.getDestination(new JMapAccessorSrc("id", "sourceField", "other"));
		
		System.out.println(destination);
		
	}

}
