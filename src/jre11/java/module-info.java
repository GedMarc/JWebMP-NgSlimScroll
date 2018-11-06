import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.ngslimscroll.NgSlimScrollModule;
import com.jwebmp.plugins.ngslimscroll.NgSlimScrollPageConfigurator;
import com.jwebmp.plugins.ngslimscroll.implementations.NgSlimScrollExclusionsModule;

module com.jwebmp.plugins.ngslimscroll {

	exports com.jwebmp.plugins.ngslimscroll;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with NgSlimScrollPageConfigurator;
	provides IAngularModule with NgSlimScrollModule;
	provides IGuiceScanModuleExclusions with NgSlimScrollExclusionsModule;
	provides IGuiceScanJarExclusions with NgSlimScrollExclusionsModule;

	opens com.jwebmp.plugins.ngslimscroll to com.fasterxml.jackson.databind, com.jwebmp.core;
}
