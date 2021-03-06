/*
 * Copyright 2002-2014 the original author or authors.
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

package rxweb.server;

import java.text.ParseException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import rxweb.support.LinkedCaseInsensitiveMap;

/**
 * @author Sebastien Deleuze
 */
public class DefaultServerResponseHeaders implements ServerResponseHeaders {

	private final Map<String, List<String>>
			headers = new LinkedCaseInsensitiveMap<List<String>>(8, Locale.ENGLISH);

	@Override
	public ServerResponseHeaders add(String name, String value) {
		List<String> values = headers.get(name);
		if (values == null) {
			values = new LinkedList<String>();
			this.headers.put(name, values);
		}
		values.add(value);
		return this;
	}

	@Override
	public ServerResponseHeaders add(String name, Iterable<String> values) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public ServerResponseHeaders addDateHeader(String name, Date value) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public ServerResponseHeaders clear() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public boolean contains(String name) {
		return this.headers.containsKey(name);
	}

	@Override
	public boolean contains(String name, String value, boolean ignoreCaseValue) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public List<Map.Entry<String, String>> entries() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public String get(String name) {
		List<String> values = headers.get(name);
		return values != null ? values.get(0) : null;
	}

	@Override
	public List<String> getAll(String name) {
		return this.headers.get(name);
	}

	@Override
	public long getContentLength() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public Date getDate() throws ParseException {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public Date getDateHeader(String name) throws ParseException {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public String getHost() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public boolean isEmpty() {
		return this.headers.isEmpty();
	}

	@Override
	public Set<String> names() {
		return this.headers.keySet();
	}

	@Override
	public ServerResponseHeaders remove(String name) {
		this.headers.remove(name);
		return this;
	}

	@Override
	public ServerResponseHeaders removeTransferEncodingChunked() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public ServerResponseHeaders set(String name, String value) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public ServerResponseHeaders set(String name, Iterable<String> values) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public ServerResponseHeaders contentLength(long length) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public ServerResponseHeaders date(Date value) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public ServerResponseHeaders dateHeader(String name, Date value) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public ServerResponseHeaders dateHeader(String name, Iterable<Date> values) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public ServerResponseHeaders host(String value) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public ServerResponseHeaders keepAlive(boolean keepAlive) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public ServerResponseHeaders transferEncodingChunked() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

}
