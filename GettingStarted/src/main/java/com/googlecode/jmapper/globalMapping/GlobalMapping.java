package com.googlecode.jmapper.globalMapping;


import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.globalMapping.bean.GlobalD;
import com.googlecode.jmapper.globalMapping.bean.GlobalD2;
import com.googlecode.jmapper.globalMapping.bean.GlobalS;
import com.googlecode.jmapper.globalMapping.bean.GlobalS2;

public class GlobalMapping {

	public static void main(String[] args){
		
		// FIRST EXAMPLE
		List<String> authors = new ArrayList<String>();
		authors.add("Alessandro Vurro");
		authors.add("Federico De Felici");
		
		JMapper<GlobalD,GlobalS> mapper = new JMapper<GlobalD,GlobalS>(GlobalD.class, GlobalS.class);
		GlobalD destination = mapper.getDestination(new GlobalS(authors,new GregorianCalendar(2013, 1, 16).getTime(), "1.2.0","other"));
		System.out.println(destination);
				
		mapper = new JMapper<GlobalD,GlobalS>(GlobalD.class, GlobalS.class,"com/googlecode/jmapper/globalMapping/globalMapping.xml");
		destination = mapper.getDestination(new GlobalS(authors,new GregorianCalendar(2013, 1, 16).getTime(), "1.2.0","other"));
		System.out.println(destination);
		
		// SECOND EXAMPLE
		JMapper<GlobalD2,GlobalS2> mapper2 = new JMapper<GlobalD2,GlobalS2>(GlobalD2.class, GlobalS2.class);
		GlobalD2 destination2 = mapper2.getDestination(new GlobalS2(154080.80D,24000D,12570.20D));
		System.out.println(destination2);
		
		mapper2 = new JMapper<GlobalD2,GlobalS2>(GlobalD2.class, GlobalS2.class,"com/googlecode/jmapper/globalMapping/globalMapping.xml");
		destination2 = mapper2.getDestination(new GlobalS2(154080.80D,24000D,12570.20D));
		System.out.println(destination2);
	}

}
