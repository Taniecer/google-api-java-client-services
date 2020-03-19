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
 * Model definition for GoogleCloudApigeeV1SendTestEmailPayload.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1SendTestEmailPayload extends com.google.api.client.json.GenericJson {

  /**
   * ID of the email template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String emailTemplateId;

  /**
   * Email address to which the test email is sent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String to;

  /**
   * ID of the email template.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmailTemplateId() {
    return emailTemplateId;
  }

  /**
   * ID of the email template.
   * @param emailTemplateId emailTemplateId or {@code null} for none
   */
  public GoogleCloudApigeeV1SendTestEmailPayload setEmailTemplateId(java.lang.String emailTemplateId) {
    this.emailTemplateId = emailTemplateId;
    return this;
  }

  /**
   * Email address to which the test email is sent.
   * @return value or {@code null} for none
   */
  public java.lang.String getTo() {
    return to;
  }

  /**
   * Email address to which the test email is sent.
   * @param to to or {@code null} for none
   */
  public GoogleCloudApigeeV1SendTestEmailPayload setTo(java.lang.String to) {
    this.to = to;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1SendTestEmailPayload set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1SendTestEmailPayload) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1SendTestEmailPayload clone() {
    return (GoogleCloudApigeeV1SendTestEmailPayload) super.clone();
  }

}
