/*
 * gwt-wrap three.js
 * 
 * Copyright (c) 2013 akimisaki3@gmail.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 
 
 based Three.js r63
 https://github.com/mrdoob/three.js
 The MIT License

Copyright (c) 2010-2013 three.js Authors. All rights reserved.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
  
 */
package com.akjava.gwt.three.client.js.loaders;

import com.akjava.gwt.three.client.js.core.Object3D;
import com.akjava.gwt.three.client.js.loaders.ObjectLoader.ObjectLoadHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.NativeEvent;


public class SceneLoader extends Object3D{
	protected SceneLoader() {
	}

	public final native LoadingManager getManager()/*-{
	return this.manager;
	}-*/;

	public final native void setManager(LoadingManager manager)/*-{
	this.manager = manager;
	}-*/;
	
	public final native void setCrossOrigin(String value)/*-{
	this.setCrossOrigin(value);
	}-*/;
	
	public static interface SceneLoadHandler {
		public void onLoad(JavaScriptObject result);
		public void onProgress(NativeEvent progress);
		public void onError(NativeEvent error);
	}
	
	public final native void load(String url,ObjectLoadHandler handler)/*-{
	this.load(url,function ( object ) {
		handler.@com.akjava.gwt.three.client.js.loaders.ObjectLoader$ObjectLoadHandler::onLoad(Lcom/akjava/gwt/three/client/js/core/Object3D;)(object);
		}
		,function ( onProgress ) {
		handler.@com.akjava.gwt.three.client.js.loaders.ObjectLoader$ObjectLoadHandler::onProgress(Lcom/google/gwt/dom/client/NativeEvent;)(onProgress);
		},function ( onError ) {
		handler.@com.akjava.gwt.three.client.js.loaders.ObjectLoader$ObjectLoadHandler::onError(Lcom/google/gwt/dom/client/NativeEvent;)(onError);
		});
}-*/;

}
