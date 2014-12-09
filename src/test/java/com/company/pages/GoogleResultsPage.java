package com.company.pages;

import static com.codeborne.selenide.Selenide.$$;

import com.codeborne.selenide.ElementsCollection;

/**
 * (c) Swissquote 12/9/14
 *
 * @author sergiitanchenko
 */

public class GoogleResultsPage {
	public ElementsCollection results() {
		return $$("#ires li.g");
	}
}
