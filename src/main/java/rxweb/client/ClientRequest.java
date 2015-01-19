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

package rxweb.client;

import org.reactivestreams.Publisher;
import reactor.io.buffer.Buffer;
import rxweb.http.Protocol;
import rxweb.http.Request;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Sebastien Deleuze
 */
public interface ClientRequest extends Request {

	HttpHeaders getHeaders();

	ClientRequest uri(String uri);

	ClientRequest protocol(Protocol protocol);

	ClientRequest method(RequestMethod method);

	ClientRequest header(String name, String value);

	ClientRequest addHeader(String name, String value);

	ClientRequest accept(String value);

	/** For the moment, {@link Buffer} and {@link String} are supported **/
	ClientRequest source(Publisher<Object> source);

	/** For the moment, {@link Buffer} and {@link String} are supported **/
	ClientRequest content(Object content);

}
