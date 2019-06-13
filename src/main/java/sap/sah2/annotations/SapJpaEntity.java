package sap.sah2.annotations;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({CONSTRUCTOR})
@Retention(RUNTIME)

public @interface SapJpaEntity {
	boolean sortable() default false;
	boolean filterable() default false;
	boolean creatable() default false;
	boolean updatable() default false;
	String semantics() default "aggregate";
	String aggregation() default "dimension";
}