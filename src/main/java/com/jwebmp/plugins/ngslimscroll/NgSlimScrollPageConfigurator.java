/*
 * Copyright (C) 2017 Marc Magon
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
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

/**
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "NgSlimScroll",
		pluginDescription = "Slim scroll is a replacement of default scrollbar provided by browsers on Windows. This library lets you design the scroll-bar by using simple css properties. It is created using javascript and css.",
		pluginUniqueName = "jwebswing-ngslimscroll",
		pluginVersion = "1.3.8",
		pluginCategories = "scrolling, ui,web ui, framework",
		pluginSubtitle = "Slim scroll is a replacement of default scrollbar provided by browsers on Windows. This library lets you design the scroll-bar by using simple css properties. It is created using javascript and css.",
		pluginSourceUrl = "https://github.com/kamlekar/slim-scroll",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-NgSlimScroll/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-NgSlimScroll",
		pluginIconUrl = "bower_components/bootstrap/bootstrapicon.jpg",
		pluginIconImageUrl = "bower_components/bootstrap/bootstraplogo.jpg",
		pluginOriginalHomepage = "https://github.com/ytlabs/ng-slim-scroll",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/NgSlimScroll.jar/download")
public class NgSlimScrollPageConfigurator
		implements IPageConfigurator
{
	/*
	 * Constructs a new NgSlimScrollPageConfigurator
	 */
	public NgSlimScrollPageConfigurator()
	{
		//Nothing needed
	}

	@SuppressWarnings("unused")
	public static void applyToComponent(ComponentHierarchyBase component)
	{
		component.addAttribute("data-slim-scroll", null);
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);

			page.getBody()
			    .addJavaScriptReference(NgSlimScrollReferencePool.NgSlimScrollReference.getJavaScriptReference());
			page.getBody()
			    .addCssReference(NgSlimScrollReferencePool.NgSlimScrollReference.getCssReference());
		}
		return page;
	}
}
