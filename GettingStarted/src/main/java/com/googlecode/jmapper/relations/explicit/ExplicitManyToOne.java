package com.googlecode.jmapper.relations.explicit;

import com.googlecode.jmapper.RelationalJMapper;
import com.googlecode.jmapper.relations.explicit.bean.AnnotatedClass;
import com.googlecode.jmapper.relations.explicit.bean.Class1;
import com.googlecode.jmapper.relations.explicit.bean.Class2;
import com.googlecode.jmapper.relations.explicit.bean.Class3;
import com.googlecode.jmapper.xml.XmlHandler;


public class ExplicitManyToOne {

	public static void main(String[] args){
		
		AnnotatedClass manyToOne = null;
		Class3 class3 = new Class3("field1Class3", "field2Class3", "field3Class3");
		Class2 class2 = new Class2("field1Class2", "field2Class2", "field3Class2");
		Class1 class1 = new Class1("field1Class1", "field2Class1", "field3Class1");
		
		RelationalJMapper<AnnotatedClass> rm = new RelationalJMapper<AnnotatedClass>(AnnotatedClass.class);
		manyToOne = rm.manyToOne(class3);
		System.out.println(manyToOne);
		
		
		manyToOne = rm.manyToOne(class2);
		System.out.println(manyToOne);
		
		
		manyToOne = rm.manyToOne(class1);
		System.out.println(manyToOne);
		
		rm = new RelationalJMapper<AnnotatedClass>(AnnotatedClass.class,"com/googlecode/jmapper/relations/explicit/ExplicitManyToOne.xml");
		manyToOne = rm.manyToOne(class3);
		System.out.println(manyToOne);
		
		
		manyToOne = rm.manyToOne(class2);
		System.out.println(manyToOne);
		
		
		manyToOne = rm.manyToOne(class1);
		System.out.println(manyToOne);
		
		// if you run this code, an xml file will be generated on the application root
		// new XmlHandler().addAnnotatedClass(AnnotatedClass.class);
	}
}
