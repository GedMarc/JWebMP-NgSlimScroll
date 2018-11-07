package com.jwebmp.plugins.ngslimscroll;

import com.jwebmp.core.base.angular.modules.AngularModuleBase;
import com.jwebmp.core.base.angular.services.IAngularModule;

/**
 * The module getting loaded into angular
 *
 * @author Marc Magon
 * @since 08 Jun 2017
 */
public class NgSlimScrollModule
		extends AngularModuleBase
		implements IAngularModule<NgSlimScrollModule>
{

	/**
	 * Field serialVersionUID
	 */


	/*
	 * Constructs a new NgSlimScrollModule
	 */
	public NgSlimScrollModule()
	{
		super("ngSlimScroll");
	}

	@Override
	public String renderFunction()
	{
		return null;
	}


	/**
	 * If this page configurator is enabled
	 *
	 * @return if the configuration must run
	 */
	@Override
	public boolean enabled()
	{
		return NgSlimScrollPageConfigurator.isEnabled();
	}
}
