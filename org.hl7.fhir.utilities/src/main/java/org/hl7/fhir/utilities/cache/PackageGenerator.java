package org.hl7.fhir.utilities.cache;

/*-
 * #%L
 * org.hl7.fhir.utilities
 * %%
 * Copyright (C) 2014 - 2019 Health Level 7
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import org.hl7.fhir.utilities.TextFile;
import org.hl7.fhir.utilities.Utilities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;

public class PackageGenerator {

  public enum PackageType {
    CORE, IG, TOOL, TEMPLATE, SUBSET;

    public String getCode() {
      switch (this) {
      case CORE: return "fhir.core";
      case IG: return "fhir.ig";
      case TOOL: return "fhir.tool";
      case TEMPLATE: return "fhir.template";
      case SUBSET: return "fhir.subset";  
      }
      throw new Error("Unknown Type");
    }
  }
  private OutputStream stream;
  private JsonObject object;

  public PackageGenerator(OutputStream stream) {
    super();
    this.stream = stream;
    object = new JsonObject();
  }
  
  public PackageGenerator(OutputStream stream, InputStream template) throws JsonSyntaxException, IOException {
    super();
    this.stream = stream;
    JsonParser parser = new com.google.gson.JsonParser();
    object = parser.parse(TextFile.streamToString(template)).getAsJsonObject();

  }
  
  public void commit() throws IOException {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    String json = gson.toJson(object);
    OutputStreamWriter sw = new OutputStreamWriter(stream, "UTF-8");
    sw.write('\ufeff');  // Unicode BOM, translates to UTF-8 with the configured outputstreamwriter
    sw.write(json);
    sw.flush();
    sw.close();
  }
  
  public PackageGenerator name(String value) {
    object.addProperty("name", "@fhir/"+value);
    return this;
  }
   
  public PackageGenerator version(String value) {
    object.addProperty("version", value);
    return this;
  }
  
  public PackageGenerator toolsVersion(int value) {
    object.addProperty("tools-version", value);
    return this;
  }
  
  public PackageGenerator description(String value) {
    object.addProperty("description", value);
    return this;    
  }
  
  public PackageGenerator license(String value) {
    object.addProperty("license", value);
    return this;        
  }
  
  public PackageGenerator homepage(String value) {
    object.addProperty("homepage", value);
    return this;            
  }
  
  public PackageGenerator bugs(String value) {
    object.addProperty("bugs", value);
    return this;            
  }
  
  public PackageGenerator author(String name, String email, String url) {
    JsonObject person = new JsonObject();
    person.addProperty("name", name);
    if (!Utilities.noString(email))
      person.addProperty("email", email);
    if (!Utilities.noString(url))
      person.addProperty("url", url);
    object.add("author", person);
    return this;            
  }
  
  public PackageGenerator contributor(String name, String email, String url) {
    JsonObject person = new JsonObject();
    person.addProperty("name", name);
    if (!Utilities.noString(email))
      person.addProperty("email", email);
    if (!Utilities.noString(url))
      person.addProperty("url", url);
    JsonArray c = object.getAsJsonArray("contributors");
    if (c == null) {
      c = new JsonArray();
      object.add("contributors", c);
    }
    c.add(person);
    return this;
  }
  
  public PackageGenerator dependency(String name, String version) {
    JsonObject dep = object.getAsJsonObject("dependencies");
    if (dep == null) {
      dep = new JsonObject();
      object.add("dependencies", dep);
    }
    dep.addProperty(name, version);
    return this;
  }
  
  public PackageGenerator file(String name) {
    JsonArray files = object.getAsJsonArray("files");
    if (files == null) {
      files = new JsonArray();
      object.add("files", files);
    }
    files.add(new JsonPrimitive(name));
    return this;
  }

  public PackageGenerator kind(PackageType kind) {
    object.addProperty("type", kind.getCode());
    return this;     
  }
  
  
}
