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
 * Model definition for GoogleCloudApigeeV1EdgeTeam.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1EdgeTeam extends com.google.api.client.json.GenericJson {

  /**
   * Not used by Apigee hybrid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String createdBy;

  /**
   * Time the team was created in milliseconds since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("created_at") @com.google.api.client.json.JsonString
  private java.lang.Long createdAt;

  /**
   * User-friendly display name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * ID of the team.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Name of the team.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Name of the Apigee organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String organization;

  /**
   * Not used by Apigee hybrid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String updatedBy;

  /**
   * Time the team was last modified in milliseconds since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("updated_at") @com.google.api.client.json.JsonString
  private java.lang.Long updatedAt;

  /**
   * Not used by Apigee hybrid.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreatedBy() {
    return createdBy;
  }

  /**
   * Not used by Apigee hybrid.
   * @param createdBy createdBy or {@code null} for none
   */
  public GoogleCloudApigeeV1EdgeTeam setCreatedBy(java.lang.String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Time the team was created in milliseconds since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCreatedAt() {
    return createdAt;
  }

  /**
   * Time the team was created in milliseconds since epoch.
   * @param createdAt createdAt or {@code null} for none
   */
  public GoogleCloudApigeeV1EdgeTeam setCreatedAt(java.lang.Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * User-friendly display name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * User-friendly display name.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudApigeeV1EdgeTeam setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * ID of the team.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * ID of the team.
   * @param id id or {@code null} for none
   */
  public GoogleCloudApigeeV1EdgeTeam setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Name of the team.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the team.
   * @param name name or {@code null} for none
   */
  public GoogleCloudApigeeV1EdgeTeam setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the Apigee organization.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrganization() {
    return organization;
  }

  /**
   * Name of the Apigee organization.
   * @param organization organization or {@code null} for none
   */
  public GoogleCloudApigeeV1EdgeTeam setOrganization(java.lang.String organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Not used by Apigee hybrid.
   * @return value or {@code null} for none
   */
  public java.lang.String getUpdatedBy() {
    return updatedBy;
  }

  /**
   * Not used by Apigee hybrid.
   * @param updatedBy updatedBy or {@code null} for none
   */
  public GoogleCloudApigeeV1EdgeTeam setUpdatedBy(java.lang.String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * Time the team was last modified in milliseconds since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Time the team was last modified in milliseconds since epoch.
   * @param updatedAt updatedAt or {@code null} for none
   */
  public GoogleCloudApigeeV1EdgeTeam setUpdatedAt(java.lang.Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1EdgeTeam set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1EdgeTeam) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1EdgeTeam clone() {
    return (GoogleCloudApigeeV1EdgeTeam) super.clone();
  }

}
