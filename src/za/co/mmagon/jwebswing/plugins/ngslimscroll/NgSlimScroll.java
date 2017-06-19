package za.co.mmagon.jwebswing.plugins.ngslimscroll;

import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * Adds and removes the slim scroll attribute from angular components
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
@ComponentInformation(name = "NgSlimScroll", description = "Slim scroll is a replacement of default scrollbar provided by browsers on Windows. This library lets you design the scroll-bar by using simple css properties. It is created using javascript and css.",
        url = "https://github.com/GedMarc/JWebSwing-NgSlimScroll")
public class NgSlimScroll
{

    /*
     * Constructs a new NgSlimScroll
     */
    private NgSlimScroll()
    {
        //Nothing needed
    }

    /**
     * Implements the slim scroll using angular on a given component
     *
     * @param component
     * @param options
     */
    public static void applySlimScroll(ComponentHierarchyBase component, NgSlimScrollOptions options)
    {
        component.addAttribute("data-slim-scroll", null);
        component.addAttribute("data-options", options.toString());
    }

    /**
     * Removes slim scroll from a given component
     *
     * @param component
     */
    public static void applySlimScroll(ComponentHierarchyBase component)
    {
        component.addAttribute("data-slim-scroll", null);
    }
}
