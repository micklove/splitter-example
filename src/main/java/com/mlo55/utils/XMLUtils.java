/*
 * Copyright 2002-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mlo55.utils;

import java.io.StringWriter;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;

import static javax.xml.transform.OutputKeys.ENCODING;
import static javax.xml.transform.OutputKeys.INDENT;
import static javax.xml.transform.OutputKeys.OMIT_XML_DECLARATION;

import org.springframework.xml.transform.StringSource;

/**
 *
 */
public final class XMLUtils {

	/**
	 * Prevent instantiation.
	 */
	private XMLUtils() {
	}

	/**
	 * Prettifies XML data, e.g. add indentation.
	 * @throws Exception
	 */
	public static String formatXml(String result) throws Exception{
        Source source = new StringSource(result);
		Transformer transformer = getTransformer();
		StreamResult streamResult = new StreamResult(new StringWriter());
		transformer.transform(source, streamResult);
		final String xmlOut = streamResult.getWriter().toString();
		return xmlOut;
	}

    public static Transformer getTransformer() throws Exception {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OMIT_XML_DECLARATION, "yes");
        transformer.setOutputProperty(ENCODING, "UTF-8");
        transformer.setOutputProperty(INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", String.valueOf(2));
        return transformer;
    }

}
