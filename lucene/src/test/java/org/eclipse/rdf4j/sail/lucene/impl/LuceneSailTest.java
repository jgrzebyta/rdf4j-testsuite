/**
 * Copyright (c) 2018 Eclipse RDF4J contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 */
package org.eclipse.rdf4j.sail.lucene.impl;

import java.io.File;
import java.io.IOException;
import org.eclipse.rdf4j.sail.lucene.AbstractLuceneSailTest;
import org.eclipse.rdf4j.sail.lucene.LuceneSail;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Jacek Grzebyta
 */
public class LuceneSailTest extends AbstractLuceneSailTest {

	public static final String LUCENE_LOCATION = ".sail-index";

	private Logger log = LoggerFactory.getLogger(getClass());

	@Override
	protected void configure(LuceneSail sail)
		throws IOException
	{
		sail.setParameter(LuceneSail.LUCENE_DIR_KEY, LUCENE_LOCATION);
		sail.setParameter(LuceneSail.INDEX_CLASS_KEY, LuceneSail.DEFAULT_INDEX_CLASS);
	}

	@Test
	public void testSailIndex()
		throws Exception
	{
		String lucenePath = repository.getDataDir().getAbsolutePath() + "/" + LUCENE_LOCATION;
                log.debug("Lucene path location: {}", lucenePath);
                Assert.assertTrue(new File(lucenePath).exists());
        }
}
