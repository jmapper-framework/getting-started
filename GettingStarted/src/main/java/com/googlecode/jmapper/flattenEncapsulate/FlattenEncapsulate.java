package com.googlecode.jmapper.flattenEncapsulate;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.flattenEncapsulate.bean.Encapsulate;
import com.googlecode.jmapper.flattenEncapsulate.bean.Encapsulate.User;
import com.googlecode.jmapper.flattenEncapsulate.bean.Flatten;

public class FlattenEncapsulate {

	public static void main(String[] args){
		
		//ANNOTATION
		JMapper<Encapsulate,Flatten> encapsulateMapper = new JMapper<Encapsulate, Flatten>(Encapsulate.class, Flatten.class);
	
		Encapsulate encapsulate = encapsulateMapper.getDestination(new Flatten("name", "surname", "address", "number"));
		
		System.out.println(encapsulate.getUser().getName());
		System.out.println(encapsulate.getUser().getSurname());
		System.out.println(encapsulate.getUser().getAddress());
		System.out.println(encapsulate.getUser().getNumber());
		
		JMapper<Flatten,Encapsulate> flattenMapper = new JMapper<Flatten,Encapsulate>(Flatten.class,Encapsulate.class);
		
		Flatten flatten = flattenMapper.getDestination(new Encapsulate(new User("name", "surname", "address", "number")));
		
		System.out.println(flatten.getName());
		System.out.println(flatten.getSurname());
		System.out.println(flatten.getAddress());
		System.out.println(flatten.getNumber());
		
		//XML
		encapsulateMapper = new JMapper<Encapsulate, Flatten>(Encapsulate.class, Flatten.class,"com/googlecode/jmapper/flattenEncapsulate/flattenEncapsulate.xml");
		
		encapsulate = encapsulateMapper.getDestination(new Flatten("name", "surname", "address", "number"));
		
		System.out.println(encapsulate.getUser().getName());
		System.out.println(encapsulate.getUser().getSurname());
		System.out.println(encapsulate.getUser().getAddress());
		System.out.println(encapsulate.getUser().getNumber());
		
		flattenMapper = new JMapper<Flatten,Encapsulate>(Flatten.class,Encapsulate.class,"com/googlecode/jmapper/flattenEncapsulate/flattenEncapsulate.xml");
		
		flatten = flattenMapper.getDestination(new Encapsulate(new User("name", "surname", "address", "number")));
		
		System.out.println(flatten.getName());
		System.out.println(flatten.getSurname());
		System.out.println(flatten.getAddress());
		System.out.println(flatten.getNumber());
	}
}
