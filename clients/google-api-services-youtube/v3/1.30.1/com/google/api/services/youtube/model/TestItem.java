/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.youtube.model;

/**
 * Model definition for TestItem.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TestItem extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TestItemTestItemSnippet snippet;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public TestItem setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public TestItemTestItemSnippet getSnippet() {
    return snippet;
  }

  /**
   * @param snippet snippet or {@code null} for none
   */
  public TestItem setSnippet(TestItemTestItemSnippet snippet) {
    this.snippet = snippet;
    return this;
  }

  @Override
  public TestItem set(String fieldName, Object value) {
    return (TestItem) super.set(fieldName, value);
  }

  @Override
  public TestItem clone() {
    return (TestItem) super.clone();
  }

}
