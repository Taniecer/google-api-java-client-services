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

package com.google.api.services.apigee.v1.model;

/**
 * Model definition for GoogleCloudApigeeV1CheckAccessVerdict.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1CheckAccessVerdict extends com.google.api.client.json.GenericJson {

  /**
   * Access that was attempted
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String action;

  /**
   * Resource path.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourcePath;

  /**
   * Results of the check access request. "unknown" is returned if the resource path is not found
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String verdict;

  /**
   * Access that was attempted
   * @return value or {@code null} for none
   */
  public java.lang.String getAction() {
    return action;
  }

  /**
   * Access that was attempted
   * @param action action or {@code null} for none
   */
  public GoogleCloudApigeeV1CheckAccessVerdict setAction(java.lang.String action) {
    this.action = action;
    return this;
  }

  /**
   * Resource path.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourcePath() {
    return resourcePath;
  }

  /**
   * Resource path.
   * @param resourcePath resourcePath or {@code null} for none
   */
  public GoogleCloudApigeeV1CheckAccessVerdict setResourcePath(java.lang.String resourcePath) {
    this.resourcePath = resourcePath;
    return this;
  }

  /**
   * Results of the check access request. "unknown" is returned if the resource path is not found
   * @return value or {@code null} for none
   */
  public java.lang.String getVerdict() {
    return verdict;
  }

  /**
   * Results of the check access request. "unknown" is returned if the resource path is not found
   * @param verdict verdict or {@code null} for none
   */
  public GoogleCloudApigeeV1CheckAccessVerdict setVerdict(java.lang.String verdict) {
    this.verdict = verdict;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1CheckAccessVerdict set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1CheckAccessVerdict) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1CheckAccessVerdict clone() {
    return (GoogleCloudApigeeV1CheckAccessVerdict) super.clone();
  }

}
