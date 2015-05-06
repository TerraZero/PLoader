package tz.prloader;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

import tz.preflects.Reflect;
import tz.preflects.loader.ReflectFile;
import tz.preflects.loader.ReflectLoader;

/**
 * 
 * @author terrazero
 * @created May 5, 2015
 * 
 * @file RLoader.java
 * @project PModule
 * @identifier tz.pmodule
 *
 */
public class RLoader {

	public static<annotation extends Annotation> List<AnnotationWrapper<Reflect, annotation>> get(Class<annotation> annotation) {
		List<AnnotationWrapper<Reflect, annotation>> loads = new ArrayList<AnnotationWrapper<Reflect, annotation>>();
		
		for (ReflectFile file : ReflectLoader.sysloader().load()) {
			annotation annot = file.reflect().annotation(annotation);
			if (annot != null) {
				loads.add(new AnnotationWrapper<Reflect, annotation>(file.reflect(), annot));
			}
		}
		
		return loads;
	}
	
}
