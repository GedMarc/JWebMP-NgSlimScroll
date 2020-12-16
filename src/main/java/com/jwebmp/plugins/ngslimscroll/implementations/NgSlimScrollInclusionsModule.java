package com.jwebmp.plugins.ngslimscroll.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class NgSlimScrollInclusionsModule implements IGuiceScanModuleInclusions<NgSlimScrollInclusionsModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.ngslimscroll");
		return set;
	}
}
