/*
 * Copyright 2018 Albert Tregnaghi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 */
package de.jcup.yamleditor.script;

import java.util.ArrayList;
import java.util.Collection;

public class YamlScriptModel {

	Collection<YamlError> errors = new ArrayList<>();
	
	private YamlNode rootNode;
	
	public YamlScriptModel() {
		rootNode = new YamlNode("root");
	}
	public YamlNode getRootNode() {
		return rootNode;
	}
	

	public boolean hasErrors() {
		return errors.size()>0;
	}
	
	public Collection<YamlError> getErrors() {
		return errors;
	}

}