package com.jwebmp.plugins.ngslimscroll;

import com.jwebmp.base.angular.modules.AngularModuleBase;

/**
 * The module getting loaded into angular
 *
 * @author Marc Magon
 * @since 08 Jun 2017
 */
class NgSlimScrollModule
		extends AngularModuleBase
{

	private static final long serialVersionUID = 1L;

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
}
