package tz.prloader;

import java.lang.annotation.Annotation;

/**
 * 
 * @author terrazero
 * @created Mar 11, 2015
 * 
 * @file InfoWrapper.java
 * @project TZS
 * @identifier TZ.System.Annotations
 *
 */
public class AnnotationWrapper<type, annotation extends Annotation> {
	
	protected type object;
	protected annotation annotation;
	
	public AnnotationWrapper(type object, annotation info) {
		this.object = object;
		this.annotation = info;
	}

	public annotation annotation() {
		return this.annotation;
	}
	
	public type value() {
		return this.object;
	}

}
