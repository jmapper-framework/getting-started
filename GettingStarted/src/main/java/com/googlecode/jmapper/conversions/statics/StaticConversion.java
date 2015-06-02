package com.googlecode.jmapper.conversions.statics;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.conversions.statics.bean.StaticD;
import com.googlecode.jmapper.conversions.statics.bean.StaticS;


public class StaticConversion {

	public static void main(String[] args) {
		
		// ANNOTATION
		JMapper<StaticD, StaticS> mapper = new JMapper<StaticD, StaticS>(StaticD.class, StaticS.class);
		StaticD destination = mapper.getDestination(new StaticS("10/01/2012", "10/01/2015"));
		System.out.println(destination);
		
		// XML
		mapper = new JMapper<StaticD, StaticS>(StaticD.class, StaticS.class,"com/googlecode/jmapper/conversions/statics/staticConversion.xml");
		destination = mapper.getDestination(new StaticS("10/01/2013", "10/01/2014"));
		System.out.println(destination);
	}
}
