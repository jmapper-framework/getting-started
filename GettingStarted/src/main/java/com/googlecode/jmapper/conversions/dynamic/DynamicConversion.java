package com.googlecode.jmapper.conversions.dynamic;


import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.RelationalJMapper;
import com.googlecode.jmapper.conversions.dynamic.bean.DynamicD;
import com.googlecode.jmapper.conversions.dynamic.bean.DynamicD2;
import com.googlecode.jmapper.conversions.dynamic.bean.DynamicS;
import com.googlecode.jmapper.conversions.dynamic.bean.DynamicS2;

public class DynamicConversion {

	public static void main(String[] args) throws IOException {
		
		// FIRST EXAMPLE
		Properties properties = new Properties();
		InputStream stream = DynamicConversion.class.getResourceAsStream("dynamicExample.properties");
		properties.load (stream);
		
		JMapper<DynamicD,DynamicS> mapper = new JMapper<DynamicD,DynamicS>(DynamicD.class, DynamicS.class);
		DynamicD destination = mapper.getDestination(new DynamicS(properties));
		System.out.println(destination);
		
		mapper = new JMapper<DynamicD,DynamicS>(DynamicD.class, DynamicS.class,"com/googlecode/jmapper/conversions/dynamic/dynamicConversion.xml");
		destination = mapper.getDestination(new DynamicS(properties));
		System.out.println("\n"+destination);
		
		// SECOND EXAMPLE
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", "JMapper Framework v.1.2.0");
		map.put("quantity", 10);
		map.put("purchase", new Date());

		RelationalJMapper<DynamicD2> mapper2 = new RelationalJMapper<DynamicD2>(DynamicD2.class,"com/googlecode/jmapper/conversions/dynamic/dynamicConversion.xml");
		
		DynamicS2 source = new DynamicS2(map);
		DynamicD2 manyToOne = mapper2.manyToOne(source);
		System.out.println("\n"+manyToOne);
		
		DynamicS2 empty = new DynamicS2(new HashMap<String, Object>());
		DynamicS2 oneToMany = mapper2.oneToMany(empty,manyToOne);
		System.out.println("\n"+oneToMany);		
	}
}
