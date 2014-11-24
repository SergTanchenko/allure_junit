package com.swissquote.tests;


import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Stories;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

import com.swissquote.lib.SqFeatures;
import com.swissquote.lib.SqStories;

public class TableTest {
	@Features(SqFeatures.SIMPLE_TABLE_OF_RESULTS)
	@Stories(SqStories.PST_96)
	@Test
	public void tableDisplaysColumnHeaders() throws Exception {
		Assert.assertTrue(true);
	}
}
