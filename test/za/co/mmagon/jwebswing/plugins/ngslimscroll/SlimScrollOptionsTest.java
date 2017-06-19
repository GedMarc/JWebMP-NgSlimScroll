package za.co.mmagon.jwebswing.plugins.ngslimscroll;

import org.junit.Test;
import za.co.mmagon.jwebswing.htmlbuilder.css.colours.ColourCSSImpl;

/**
 *
 * @author Marc Magon
 */
public class SlimScrollOptionsTest
{

    public SlimScrollOptionsTest()
    {
    }

    @Test
    public void testSomeMethod()
    {
        NgSlimScrollOptions sso = new NgSlimScrollOptions();
        sso.setAlwaysVisible(true);
        sso.setColor(new ColourCSSImpl("#ffffff"));
        System.out.println(sso);
    }
}
