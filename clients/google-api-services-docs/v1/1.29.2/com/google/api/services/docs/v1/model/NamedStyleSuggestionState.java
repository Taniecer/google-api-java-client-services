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

package com.google.api.services.docs.v1.model;

/**
 * A suggestion state of a NamedStyle message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NamedStyleSuggestionState extends com.google.api.client.json.GenericJson {

  /**
   * The named style type that this suggestion state corresponds to.
   *
   * This field is provided as a convenience for matching the NamedStyleSuggestionState with its
   * corresponding NamedStyle.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String namedStyleType;

  /**
   * A mask that indicates which of the fields in paragraph style have been changed in this
   * suggestion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ParagraphStyleSuggestionState paragraphStyleSuggestionState;

  /**
   * A mask that indicates which of the fields in text style have been changed in this suggestion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextStyleSuggestionState textStyleSuggestionState;

  /**
   * The named style type that this suggestion state corresponds to.
   *
   * This field is provided as a convenience for matching the NamedStyleSuggestionState with its
   * corresponding NamedStyle.
   * @return value or {@code null} for none
   */
  public java.lang.String getNamedStyleType() {
    return namedStyleType;
  }

  /**
   * The named style type that this suggestion state corresponds to.
   *
   * This field is provided as a convenience for matching the NamedStyleSuggestionState with its
   * corresponding NamedStyle.
   * @param namedStyleType namedStyleType or {@code null} for none
   */
  public NamedStyleSuggestionState setNamedStyleType(java.lang.String namedStyleType) {
    this.namedStyleType = namedStyleType;
    return this;
  }

  /**
   * A mask that indicates which of the fields in paragraph style have been changed in this
   * suggestion.
   * @return value or {@code null} for none
   */
  public ParagraphStyleSuggestionState getParagraphStyleSuggestionState() {
    return paragraphStyleSuggestionState;
  }

  /**
   * A mask that indicates which of the fields in paragraph style have been changed in this
   * suggestion.
   * @param paragraphStyleSuggestionState paragraphStyleSuggestionState or {@code null} for none
   */
  public NamedStyleSuggestionState setParagraphStyleSuggestionState(ParagraphStyleSuggestionState paragraphStyleSuggestionState) {
    this.paragraphStyleSuggestionState = paragraphStyleSuggestionState;
    return this;
  }

  /**
   * A mask that indicates which of the fields in text style have been changed in this suggestion.
   * @return value or {@code null} for none
   */
  public TextStyleSuggestionState getTextStyleSuggestionState() {
    return textStyleSuggestionState;
  }

  /**
   * A mask that indicates which of the fields in text style have been changed in this suggestion.
   * @param textStyleSuggestionState textStyleSuggestionState or {@code null} for none
   */
  public NamedStyleSuggestionState setTextStyleSuggestionState(TextStyleSuggestionState textStyleSuggestionState) {
    this.textStyleSuggestionState = textStyleSuggestionState;
    return this;
  }

  @Override
  public NamedStyleSuggestionState set(String fieldName, Object value) {
    return (NamedStyleSuggestionState) super.set(fieldName, value);
  }

  @Override
  public NamedStyleSuggestionState clone() {
    return (NamedStyleSuggestionState) super.clone();
  }

}
