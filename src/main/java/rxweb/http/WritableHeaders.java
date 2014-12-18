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

package rxweb.http;

import java.util.Date;

/**
 * @author Sebastien Deleuze
 */
public interface WritableHeaders {

	public void add(String name, String value);

	public void add(String name, Iterable<String> values);

	public void addDateHeader(String name, Date value);

	public void clear();

	public void remove(String name);

	public void removeTransferEncodingChunked();

	public void set(String name, String value);

	public void set(String name, Iterable<String> values);

	public void setContentLength(long length);

	public void setDate(Date value);

	public void setDateHeader(String name, Date value);

	public void setDateHeader(String name, Iterable<Date> values);

	public void setHost(String value);

	public void setKeepAlive(boolean keepAlive);

	public void setTransferEncodingChunked();

}
