import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.ngslimscroll.NgSlimScrollPageConfigurator;

module com.jwebmp.plugins.ngslimscroll {

	exports com.jwebmp.plugins.ngslimscroll;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	provides IPageConfigurator with NgSlimScrollPageConfigurator;

}
