/**
 * Copyright (c) 2018 Eclipse RDF4J contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 */
package org.eclipse.rdf4j.sail.lucene.helper;

import java.io.File;
import java.io.IOException;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Provides {@link File} with content located in temporary folder.
 * 
 * @author Jacek Grzebyta
 * @see TemporaryFolder
 */
public class ProvidesTempFolder {

	private Logger log = LoggerFactory.getLogger(getClass());

	@Rule
	public TemporaryFolder tmpFolder = new TemporaryFolder();

	/**
	 * Gives temporary folder.
	 * 
	 * @return
	 * @throws IOException
	 */
	public File getFolder()
		throws IOException
	{
		File fld = tmpFolder.newFolder();
		log.debug("folder: {}", fld.getAbsolutePath());
		return fld;
	}
}
