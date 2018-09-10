package com.jwebmp.plugins.ngslimscroll;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.html.Div;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Marc Magon
 */
public class AngularSlimScrollPageConfiguratorTest

{

	public AngularSlimScrollPageConfiguratorTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		Page p = new Page();
		p.getOptions()
		 .setDynamicRender(false);
		String pageContent = p.toString(0);
		System.out.println(pageContent);
		assertTrue(pageContent.contains("'ngSlimScroll'"));

		NgSlimScrollPageConfigurator.applyToComponent(new Div());
	}

}
