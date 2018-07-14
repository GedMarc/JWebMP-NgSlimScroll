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

import com.jwebmp.base.ComponentHierarchyBase;
import com.jwebmp.plugins.ComponentInformation;

/**
 * Adds and removes the slim scroll attribute from angular components
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
@ComponentInformation(name = "NgSlimScroll",
		description = "Slim scroll is a replacement of default scrollbar provided by browsers on Windows. This library lets you design the scroll-bar by using simple css properties. It is created using javascript and css.",
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
