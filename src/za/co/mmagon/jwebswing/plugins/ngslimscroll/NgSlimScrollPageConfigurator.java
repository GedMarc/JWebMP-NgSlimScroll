package za.co.mmagon.jwebswing.plugins.ngslimscroll;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

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
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/NgSlimScroll.jar/download"
) class NgSlimScrollPageConfigurator extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new NgSlimScrollPageConfigurator
	 */
	public NgSlimScrollPageConfigurator()
	{
		//Nothing needed
	}

	public static void applyToComponent(ComponentHierarchyBase component)
	{
		getComponent().addAttribute("data-slim-scroll", null);
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(page.getBody(), true);
			AngularPageConfigurator.setRequired(page.getBody(), true);

			page.getBody().addJavaScriptReference(NgSlimScrollReferencePool.NgSlimScrollReference.getJavaScriptReference());
			page.getBody().addCssReference(NgSlimScrollReferencePool.NgSlimScrollReference.getCssReference());

			page.getAngular().getAngularModules().add(new NgSlimScrollModule());
		}

		return page;
	}
}
