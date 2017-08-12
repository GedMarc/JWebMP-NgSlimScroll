package za.co.mmagon.jwebswing.plugins.ngslimscroll;

import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 * All the options available for slim scroll
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
public class NgSlimScrollOptions extends JavaScriptPart
{

	private static final long serialVersionUID = 1L;

	@Override
	public String toString()
	{
		return super.toString().replaceAll("\\s*\\n\\s*", "");
	}

}
