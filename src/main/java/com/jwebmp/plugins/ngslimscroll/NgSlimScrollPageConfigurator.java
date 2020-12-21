/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.ngslimscroll;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "NgSlimScroll",
		pluginDescription = "Slim scroll is a replacement of default scrollbar provided by browsers on Windows. This library lets you design the scroll-bar by using simple css properties. It is created using javascript and css.",
		pluginUniqueName = "ngslimscroll",
		pluginVersion = "1.3.8",
		pluginCategories = "scrolling, ui,web ui, framework",
		pluginSubtitle = "Slim scroll is a replacement of default scrollbar provided by browsers on Windows. This library lets you design the scroll-bar by using simple css properties. It is created using javascript and css.",
		pluginSourceUrl = "https://github.com/kamlekar/slim-scroll",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-NgSlimScroll/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-NgSlimScroll",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://github.com/ytlabs/ng-slim-scroll",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.angular/jwebmp-ng-slim-scroll",
		pluginGroupId = "com.jwebmp.plugins.angular",
		pluginArtifactId = "jwebmp-ng-slim-scroll",
		pluginModuleName = "com.jwebmp.plugins.ngslimscroll",
		pluginStatus = PluginStatus.Released
)
public class NgSlimScrollPageConfigurator
		implements IPageConfigurator<NgSlimScrollPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/*
	 * Constructs a new NgSlimScrollPageConfigurator
	 */
	public NgSlimScrollPageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return NgSlimScrollPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		NgSlimScrollPageConfigurator.enabled = mustEnable;
	}

	@SuppressWarnings("unused")
	public static void applyToComponent(IComponentHierarchyBase<?,?> component)
	{
		component.asAttributeBase().addAttribute("data-slim-scroll", null);
	}

	/**
	 * Implements the slim scroll using angular on a given component
	 *
	 * @param component
	 * @param options
	 */
	public static void applySlimScroll(IComponentHierarchyBase<?,?> component, NgSlimScrollOptions<?> options)
	{
		component.asAttributeBase().addAttribute("data-slim-scroll", null);
		component.asAttributeBase().addAttribute("data-options", options.toString());
	}

	/**
	 * Removes slim scroll from a given component
	 *
	 * @param component
	 */
	public static void applySlimScroll(IComponentHierarchyBase<?,?> component)
	{
		component.asAttributeBase().addAttribute("data-slim-scroll", null);
	}

	@NotNull
	@Override
	 public Page<?> configure(Page<?> page)
	{
		JQueryPageConfigurator.setRequired(true);
		AngularPageConfigurator.setRequired(true);

		page.getBody()
		    .addJavaScriptReference(NgSlimScrollReferencePool.NgSlimScrollReference.getJavaScriptReference());
		page.getBody()
		    .addCssReference(NgSlimScrollReferencePool.NgSlimScrollReference.getCssReference());
		return page;
	}

	@Override
	public boolean enabled()
	{
		return NgSlimScrollPageConfigurator.enabled;
	}
}
