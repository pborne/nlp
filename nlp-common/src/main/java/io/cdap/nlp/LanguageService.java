/*
 * Copyright © 2019 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package io.cdap.nlp;

import javax.annotation.Nullable;

/**
 * This class <code>LanguageService</code> defines a Language service abstraction.
 * @param <I> Input type.
 * @param <O> Output type.
 */
public interface LanguageService<I, O> {
  @Nullable
  I getResult(O data) throws Exception;
}