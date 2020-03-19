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
 * Model definition for GoogleCloudApigeeV1ConsumersTeam.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1ConsumersTeam extends com.google.api.client.json.GenericJson {

  /**
   * List of apps associated with the team.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1PortalApp> apps;

  /**
   * List of audiences to which the team is assigned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1ConsumerAudience> audiences;

  static {
    // hack to force ProGuard to consider GoogleCloudApigeeV1ConsumerAudience used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudApigeeV1ConsumerAudience.class);
  }

  /**
   * Time the team was created in milliseconds since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long created;

  /**
   * Description of the team.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * ID of the team.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer memberCount;

  /**
   * List of members and roles.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1ConsumerTeamMembership> memberships;

  static {
    // hack to force ProGuard to consider GoogleCloudApigeeV1ConsumerTeamMembership used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudApigeeV1ConsumerTeamMembership.class);
  }

  /**
   * Name of the team.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Point of contact for the team.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pointOfContact;

  /**
   * List of users assigned to the team.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1ConsumerUser> users;

  static {
    // hack to force ProGuard to consider GoogleCloudApigeeV1ConsumerUser used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudApigeeV1ConsumerUser.class);
  }

  /**
   * List of apps associated with the team.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1PortalApp> getApps() {
    return apps;
  }

  /**
   * List of apps associated with the team.
   * @param apps apps or {@code null} for none
   */
  public GoogleCloudApigeeV1ConsumersTeam setApps(java.util.List<GoogleCloudApigeeV1PortalApp> apps) {
    this.apps = apps;
    return this;
  }

  /**
   * List of audiences to which the team is assigned.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1ConsumerAudience> getAudiences() {
    return audiences;
  }

  /**
   * List of audiences to which the team is assigned.
   * @param audiences audiences or {@code null} for none
   */
  public GoogleCloudApigeeV1ConsumersTeam setAudiences(java.util.List<GoogleCloudApigeeV1ConsumerAudience> audiences) {
    this.audiences = audiences;
    return this;
  }

  /**
   * Time the team was created in milliseconds since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCreated() {
    return created;
  }

  /**
   * Time the team was created in milliseconds since epoch.
   * @param created created or {@code null} for none
   */
  public GoogleCloudApigeeV1ConsumersTeam setCreated(java.lang.Long created) {
    this.created = created;
    return this;
  }

  /**
   * Description of the team.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of the team.
   * @param description description or {@code null} for none
   */
  public GoogleCloudApigeeV1ConsumersTeam setDescription(java.lang.String description) {
    this.description = description;
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
  public GoogleCloudApigeeV1ConsumersTeam setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMemberCount() {
    return memberCount;
  }

  /**
   * @param memberCount memberCount or {@code null} for none
   */
  public GoogleCloudApigeeV1ConsumersTeam setMemberCount(java.lang.Integer memberCount) {
    this.memberCount = memberCount;
    return this;
  }

  /**
   * List of members and roles.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1ConsumerTeamMembership> getMemberships() {
    return memberships;
  }

  /**
   * List of members and roles.
   * @param memberships memberships or {@code null} for none
   */
  public GoogleCloudApigeeV1ConsumersTeam setMemberships(java.util.List<GoogleCloudApigeeV1ConsumerTeamMembership> memberships) {
    this.memberships = memberships;
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
  public GoogleCloudApigeeV1ConsumersTeam setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Point of contact for the team.
   * @return value or {@code null} for none
   */
  public java.lang.String getPointOfContact() {
    return pointOfContact;
  }

  /**
   * Point of contact for the team.
   * @param pointOfContact pointOfContact or {@code null} for none
   */
  public GoogleCloudApigeeV1ConsumersTeam setPointOfContact(java.lang.String pointOfContact) {
    this.pointOfContact = pointOfContact;
    return this;
  }

  /**
   * List of users assigned to the team.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1ConsumerUser> getUsers() {
    return users;
  }

  /**
   * List of users assigned to the team.
   * @param users users or {@code null} for none
   */
  public GoogleCloudApigeeV1ConsumersTeam setUsers(java.util.List<GoogleCloudApigeeV1ConsumerUser> users) {
    this.users = users;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1ConsumersTeam set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1ConsumersTeam) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1ConsumersTeam clone() {
    return (GoogleCloudApigeeV1ConsumersTeam) super.clone();
  }

}
