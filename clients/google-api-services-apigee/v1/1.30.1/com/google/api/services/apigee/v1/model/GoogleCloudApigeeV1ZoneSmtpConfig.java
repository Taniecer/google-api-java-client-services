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
 * SMTP configuration for a zone.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1ZoneSmtpConfig extends com.google.api.client.json.GenericJson {

  /**
   * Authorization type. Valid values include: SSL or TLS. Leave this field blank for no
   * authorization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String secureAuthType;

  /**
   * Email address used as the sender.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sender;

  /**
   * Hostname of the SMTP server, such as `smtp.gmail.com`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serverHost;

  /**
   * Password of the SMTP account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serverPassword;

  /**
   * Port to be used, such as 465 if you are using TLS/SSL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serverPort;

  /**
   * Username of the SMTP account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serverUsername;

  /**
   * Authorization type. Valid values include: SSL or TLS. Leave this field blank for no
   * authorization.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecureAuthType() {
    return secureAuthType;
  }

  /**
   * Authorization type. Valid values include: SSL or TLS. Leave this field blank for no
   * authorization.
   * @param secureAuthType secureAuthType or {@code null} for none
   */
  public GoogleCloudApigeeV1ZoneSmtpConfig setSecureAuthType(java.lang.String secureAuthType) {
    this.secureAuthType = secureAuthType;
    return this;
  }

  /**
   * Email address used as the sender.
   * @return value or {@code null} for none
   */
  public java.lang.String getSender() {
    return sender;
  }

  /**
   * Email address used as the sender.
   * @param sender sender or {@code null} for none
   */
  public GoogleCloudApigeeV1ZoneSmtpConfig setSender(java.lang.String sender) {
    this.sender = sender;
    return this;
  }

  /**
   * Hostname of the SMTP server, such as `smtp.gmail.com`.
   * @return value or {@code null} for none
   */
  public java.lang.String getServerHost() {
    return serverHost;
  }

  /**
   * Hostname of the SMTP server, such as `smtp.gmail.com`.
   * @param serverHost serverHost or {@code null} for none
   */
  public GoogleCloudApigeeV1ZoneSmtpConfig setServerHost(java.lang.String serverHost) {
    this.serverHost = serverHost;
    return this;
  }

  /**
   * Password of the SMTP account.
   * @return value or {@code null} for none
   */
  public java.lang.String getServerPassword() {
    return serverPassword;
  }

  /**
   * Password of the SMTP account.
   * @param serverPassword serverPassword or {@code null} for none
   */
  public GoogleCloudApigeeV1ZoneSmtpConfig setServerPassword(java.lang.String serverPassword) {
    this.serverPassword = serverPassword;
    return this;
  }

  /**
   * Port to be used, such as 465 if you are using TLS/SSL.
   * @return value or {@code null} for none
   */
  public java.lang.String getServerPort() {
    return serverPort;
  }

  /**
   * Port to be used, such as 465 if you are using TLS/SSL.
   * @param serverPort serverPort or {@code null} for none
   */
  public GoogleCloudApigeeV1ZoneSmtpConfig setServerPort(java.lang.String serverPort) {
    this.serverPort = serverPort;
    return this;
  }

  /**
   * Username of the SMTP account.
   * @return value or {@code null} for none
   */
  public java.lang.String getServerUsername() {
    return serverUsername;
  }

  /**
   * Username of the SMTP account.
   * @param serverUsername serverUsername or {@code null} for none
   */
  public GoogleCloudApigeeV1ZoneSmtpConfig setServerUsername(java.lang.String serverUsername) {
    this.serverUsername = serverUsername;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1ZoneSmtpConfig set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1ZoneSmtpConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1ZoneSmtpConfig clone() {
    return (GoogleCloudApigeeV1ZoneSmtpConfig) super.clone();
  }

}
