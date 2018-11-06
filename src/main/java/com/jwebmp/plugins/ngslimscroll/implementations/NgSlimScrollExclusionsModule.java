package com.jwebmp.plugins.ngslimscroll.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class NgSlimScrollExclusionsModule
		implements IGuiceScanModuleExclusions<NgSlimScrollExclusionsModule>,
				           IGuiceScanJarExclusions<NgSlimScrollExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-ng-slim-scroll-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.ngslimscroll");
		return strings;
	}
}
