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
 * Model definition for GoogleCloudApigeeV1SystemStateData.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1SystemStateData extends com.google.api.client.json.GenericJson {

  /**
   * List of portal features.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> features;

  /**
   * System access level message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String systemAccessLevelMessage;

  /**
   * System access time-to-live (TTL).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer systemAccessTtl;

  /**
   * System access level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String systemStateAccessLevel;

  /**
   * List of portal features.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFeatures() {
    return features;
  }

  /**
   * List of portal features.
   * @param features features or {@code null} for none
   */
  public GoogleCloudApigeeV1SystemStateData setFeatures(java.util.List<java.lang.String> features) {
    this.features = features;
    return this;
  }

  /**
   * System access level message.
   * @return value or {@code null} for none
   */
  public java.lang.String getSystemAccessLevelMessage() {
    return systemAccessLevelMessage;
  }

  /**
   * System access level message.
   * @param systemAccessLevelMessage systemAccessLevelMessage or {@code null} for none
   */
  public GoogleCloudApigeeV1SystemStateData setSystemAccessLevelMessage(java.lang.String systemAccessLevelMessage) {
    this.systemAccessLevelMessage = systemAccessLevelMessage;
    return this;
  }

  /**
   * System access time-to-live (TTL).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSystemAccessTtl() {
    return systemAccessTtl;
  }

  /**
   * System access time-to-live (TTL).
   * @param systemAccessTtl systemAccessTtl or {@code null} for none
   */
  public GoogleCloudApigeeV1SystemStateData setSystemAccessTtl(java.lang.Integer systemAccessTtl) {
    this.systemAccessTtl = systemAccessTtl;
    return this;
  }

  /**
   * System access level.
   * @return value or {@code null} for none
   */
  public java.lang.String getSystemStateAccessLevel() {
    return systemStateAccessLevel;
  }

  /**
   * System access level.
   * @param systemStateAccessLevel systemStateAccessLevel or {@code null} for none
   */
  public GoogleCloudApigeeV1SystemStateData setSystemStateAccessLevel(java.lang.String systemStateAccessLevel) {
    this.systemStateAccessLevel = systemStateAccessLevel;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1SystemStateData set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1SystemStateData) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1SystemStateData clone() {
    return (GoogleCloudApigeeV1SystemStateData) super.clone();
  }

}
