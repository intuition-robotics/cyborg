/*
 * The core of the core of all my projects!
 *
 * Copyright (C) 2018  Adam van der Kruk aka TacB0sS
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nu.art.core.exceptions.runtime;

public class MUST_NeverHappenException
	extends RuntimeException {

	private static final long serialVersionUID = 4984581328961158655L;

	public MUST_NeverHappenException(String reason) {
		super(reason);
	}

	public MUST_NeverHappenException(String reason, Throwable e) {
		super(reason, e);
	}
}
