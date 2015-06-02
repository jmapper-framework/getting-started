package com.googlecode.jmapper.relations.explicit;

import com.googlecode.jmapper.RelationalJMapper;
import com.googlecode.jmapper.relations.explicit.bean.AnnotatedClass;
import com.googlecode.jmapper.relations.explicit.bean.Class1;
import com.googlecode.jmapper.relations.explicit.bean.Class2;
import com.googlecode.jmapper.relations.explicit.bean.Class3;


public class ExplicitOneToMany {

	public static void main(String[] args) {
		
		AnnotatedClass annotatedClass = new AnnotatedClass("field1", "field2", "field3");
		
		RelationalJMapper<AnnotatedClass> rm = new RelationalJMapper<AnnotatedClass>(AnnotatedClass.class);
		
		Class1 class1 = rm.oneToMany(Class1.class,annotatedClass);
		System.out.println(class1);
	
		Class2 class2 = rm.oneToMany(Class2.class,annotatedClass);
		System.out.println(class2);

		Class3 class3 = rm.oneToMany(Class3.class,annotatedClass);
		System.out.println(class3);
	}

}
