package sap.sah2.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

//@Target({FIELD})
@Retention(RUNTIME)
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
public @interface Sap {
	public String var = "aggregation-role";
	
	boolean sortable() default false;
	boolean filterable() default false;
	boolean creatable() default false;
	boolean updatable() default false;
	String semantics() default "aggregate";
	String aggregation_role() default "dimension";
}