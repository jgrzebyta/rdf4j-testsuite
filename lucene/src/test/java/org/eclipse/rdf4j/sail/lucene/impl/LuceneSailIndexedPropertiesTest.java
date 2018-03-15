/**
 * Copyright (c) 2018 Eclipse RDF4J contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 */
package org.eclipse.rdf4j.sail.lucene.impl;

import org.eclipse.rdf4j.sail.lucene.AbstractLuceneSailIndexedPropertiesTest;
import org.eclipse.rdf4j.sail.lucene.LuceneSail;

/**
 * @author Jacek Grzebyta
 */
public class LuceneSailIndexedPropertiesTest extends AbstractLuceneSailIndexedPropertiesTest {

	@Override
	protected void configure(LuceneSail sail) {
		sail.setParameter(LuceneSail.LUCENE_DIR_KEY, ".sail-index");
		sail.setParameter(LuceneSail.INDEX_CLASS_KEY, LuceneSail.DEFAULT_INDEX_CLASS);
	}
}
