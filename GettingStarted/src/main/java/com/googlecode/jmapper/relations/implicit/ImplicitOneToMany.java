package com.googlecode.jmapper.relations.implicit;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.relations.implicit.bean.Destination;
import com.googlecode.jmapper.relations.implicit.bean.Destination2;
import com.googlecode.jmapper.relations.implicit.bean.Destination3;
import com.googlecode.jmapper.relations.implicit.bean.Source;


public class ImplicitOneToMany {

	public static void main(String[] args) {
		
		Source  source  = new Source ("id", "sourceField", "other");
		
		JMapper<Destination,Source> jmapper = new JMapper<Destination,Source>(Destination.class, Source.class);
		Destination destination = jmapper.getDestination(source);
		System.out.println(destination);
		
		JMapper<Destination2,Source> jmapper2 = new JMapper<Destination2,Source>(Destination2.class, Source.class);
		Destination2 destination2 = jmapper2.getDestination(source);
		System.out.println(destination2);
		
		JMapper<Destination3,Source> jmapper3 = new JMapper<Destination3,Source>(Destination3.class, Source.class);
		Destination3 destination3 = jmapper3.getDestination(source);
		System.out.println(destination3);

	}

}
