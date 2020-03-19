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
 * Model definition for GoogleCloudApigeeV1CustomFieldValue.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1CustomFieldValue extends com.google.api.client.json.GenericJson {

  /**
   * Name of the custom field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fieldName;

  /**
   * Value of the custom field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fieldValue;

  /**
   * Name of the custom field.
   * @return value or {@code null} for none
   */
  public java.lang.String getFieldName() {
    return fieldName;
  }

  /**
   * Name of the custom field.
   * @param fieldName fieldName or {@code null} for none
   */
  public GoogleCloudApigeeV1CustomFieldValue setFieldName(java.lang.String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Value of the custom field.
   * @return value or {@code null} for none
   */
  public java.lang.String getFieldValue() {
    return fieldValue;
  }

  /**
   * Value of the custom field.
   * @param fieldValue fieldValue or {@code null} for none
   */
  public GoogleCloudApigeeV1CustomFieldValue setFieldValue(java.lang.String fieldValue) {
    this.fieldValue = fieldValue;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1CustomFieldValue set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1CustomFieldValue) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1CustomFieldValue clone() {
    return (GoogleCloudApigeeV1CustomFieldValue) super.clone();
  }

}
