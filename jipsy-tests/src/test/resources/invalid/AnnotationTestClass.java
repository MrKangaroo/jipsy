import java.util.RandomAccess;

import org.kordamp.jipsy.ServiceProviderFor;

@ServiceProviderFor(RandomAccess.class)
public @interface AnnotationTestClass {
	String value();
}
