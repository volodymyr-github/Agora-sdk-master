/*******************************************************************************
 * Copyright 2013 See AUTHORS File
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.mobidevelop.maps.editor.events;

import com.mobidevelop.maps.MapObject;
import com.mobidevelop.maps.MapObjects;

public class MapObjectsChangeEvent extends ChangeEvent<MapObjects> {

	private MapObject object;
	
	public MapObject getObject() {
		return object;
	}

	public void setObject(MapObject object) {
		this.object = object;
	}

	public MapObjectsChangeEvent() {
		super();
	}
	
	public MapObjectsChangeEvent(MapObjects objects) {
		super(objects);
	}

	public MapObjectsChangeEvent(MapObjects objects, MapObject object) {
		super(objects);
		this.setObject(object);
	}
	
	
	
}
