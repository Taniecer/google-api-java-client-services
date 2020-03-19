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
 * Email templates used by a zone.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1ZoneCustomEmailTemplates extends com.google.api.client.json.GenericJson {

  /**
   * Email template that is sent when a user registers an account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApigeeV1ZoneCustomEmailTemplatesCustomEmailTemplate accountNotify;

  /**
   * Email template that is sent when a user needs to verify their email address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApigeeV1ZoneCustomEmailTemplatesCustomEmailTemplate accountVerify;

  /**
   * Email template used for activating a user's account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApigeeV1ZoneCustomEmailTemplatesCustomEmailTemplate activate;

  /**
   * Email template used for resetting a user's password.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApigeeV1ZoneCustomEmailTemplatesCustomEmailTemplate resetPassword;

  /**
   * Email template that is sent when a user registers an account.
   * @return value or {@code null} for none
   */
  public GoogleCloudApigeeV1ZoneCustomEmailTemplatesCustomEmailTemplate getAccountNotify() {
    return accountNotify;
  }

  /**
   * Email template that is sent when a user registers an account.
   * @param accountNotify accountNotify or {@code null} for none
   */
  public GoogleCloudApigeeV1ZoneCustomEmailTemplates setAccountNotify(GoogleCloudApigeeV1ZoneCustomEmailTemplatesCustomEmailTemplate accountNotify) {
    this.accountNotify = accountNotify;
    return this;
  }

  /**
   * Email template that is sent when a user needs to verify their email address.
   * @return value or {@code null} for none
   */
  public GoogleCloudApigeeV1ZoneCustomEmailTemplatesCustomEmailTemplate getAccountVerify() {
    return accountVerify;
  }

  /**
   * Email template that is sent when a user needs to verify their email address.
   * @param accountVerify accountVerify or {@code null} for none
   */
  public GoogleCloudApigeeV1ZoneCustomEmailTemplates setAccountVerify(GoogleCloudApigeeV1ZoneCustomEmailTemplatesCustomEmailTemplate accountVerify) {
    this.accountVerify = accountVerify;
    return this;
  }

  /**
   * Email template used for activating a user's account.
   * @return value or {@code null} for none
   */
  public GoogleCloudApigeeV1ZoneCustomEmailTemplatesCustomEmailTemplate getActivate() {
    return activate;
  }

  /**
   * Email template used for activating a user's account.
   * @param activate activate or {@code null} for none
   */
  public GoogleCloudApigeeV1ZoneCustomEmailTemplates setActivate(GoogleCloudApigeeV1ZoneCustomEmailTemplatesCustomEmailTemplate activate) {
    this.activate = activate;
    return this;
  }

  /**
   * Email template used for resetting a user's password.
   * @return value or {@code null} for none
   */
  public GoogleCloudApigeeV1ZoneCustomEmailTemplatesCustomEmailTemplate getResetPassword() {
    return resetPassword;
  }

  /**
   * Email template used for resetting a user's password.
   * @param resetPassword resetPassword or {@code null} for none
   */
  public GoogleCloudApigeeV1ZoneCustomEmailTemplates setResetPassword(GoogleCloudApigeeV1ZoneCustomEmailTemplatesCustomEmailTemplate resetPassword) {
    this.resetPassword = resetPassword;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1ZoneCustomEmailTemplates set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1ZoneCustomEmailTemplates) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1ZoneCustomEmailTemplates clone() {
    return (GoogleCloudApigeeV1ZoneCustomEmailTemplates) super.clone();
  }

}
