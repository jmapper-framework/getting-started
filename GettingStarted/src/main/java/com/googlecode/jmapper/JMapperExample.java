package com.googlecode.jmapper;

import com.googlecode.jmapper.api.enums.MappingType;
import com.googlecode.jmapper.api.enums.NullPointerControl;
import com.googlecode.jmapper.enums.ChooseConfig;
import com.googlecode.jmapper.relations.implicit.bean.Destination;
import com.googlecode.jmapper.relations.implicit.bean.Source;


public class JMapperExample {

	public static void main(String[] args){
		
		Source      source      = new Source("id", "sourceField", "sourceInfo");
		Destination destination = new Destination("2", "destinationField", "destinationInfo");
		Destination result;
		
		NullPointerControl nullPointerControl = NullPointerControl.ALL;
		MappingType mtSource      = MappingType.ONLY_VALUED_FIELDS;
		MappingType mtDestination = MappingType.ONLY_VALUED_FIELDS;
		
		
		JMapper<Destination,Source> jmapper = new JMapper<Destination,Source>(Destination.class, Source.class,ChooseConfig.DESTINATION,"com/googlecode/jmapper/jmapper.xml");
		
		// demonstrations of getDestination signature
		result = jmapper.getDestination(source);
		System.out.println(result);
		
		jmapper.getDestinationWithoutControl(source);
		System.out.println(result);
		
		result = jmapper.getDestination(source, mtSource);
		System.out.println(result);
		
		result = jmapper.getDestination(source, nullPointerControl, mtSource);
		System.out.println(result);
		
		result = jmapper.getDestination(destination, source);
		System.out.println(result);
		
		result = jmapper.getDestinationWithoutControl(destination, source);
		System.out.println(result);
		
		result = jmapper.getDestination(destination, source, mtDestination, mtSource);
		System.out.println(result);
		
		result = jmapper.getDestination(destination, source, nullPointerControl, mtDestination, mtSource);
		System.out.println(result);
	}
}
