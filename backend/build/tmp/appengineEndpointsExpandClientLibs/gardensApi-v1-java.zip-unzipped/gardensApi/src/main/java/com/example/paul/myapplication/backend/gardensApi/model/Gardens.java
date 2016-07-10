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
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-05-27 16:00:31 UTC)
 * on 2016-07-10 at 05:00:22 UTC 
 * Modify at your own risk.
 */

package com.example.paul.myapplication.backend.gardensApi.model;

/**
 * Model definition for Gardens.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the gardensApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Gardens extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creator;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String photo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String textBody;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String thumbnail;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCreator() {
    return creator;
  }

  /**
   * @param creator creator or {@code null} for none
   */
  public Gardens setCreator(java.lang.String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoto() {
    return photo;
  }

  /**
   * @param photo photo or {@code null} for none
   */
  public Gardens setPhoto(java.lang.String photo) {
    this.photo = photo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTextBody() {
    return textBody;
  }

  /**
   * @param textBody textBody or {@code null} for none
   */
  public Gardens setTextBody(java.lang.String textBody) {
    this.textBody = textBody;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getThumbnail() {
    return thumbnail;
  }

  /**
   * @param thumbnail thumbnail or {@code null} for none
   */
  public Gardens setThumbnail(java.lang.String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * @param title title or {@code null} for none
   */
  public Gardens setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public Gardens set(String fieldName, Object value) {
    return (Gardens) super.set(fieldName, value);
  }

  @Override
  public Gardens clone() {
    return (Gardens) super.clone();
  }

}
