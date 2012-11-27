/*
 * gwt-wrap three.js
 * 
 * Copyright (c) 2011 aki@akjava.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 
 
 based Three.js r45
 https://github.com/mrdoob/three.js
 The MIT License

Copyright (c) 2010-2011 three.js Authors. All rights reserved.

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
package com.akjava.gwt.three.client.core;

import com.akjava.gwt.three.client.gwt.animation.AnimationBone;
import com.akjava.gwt.three.client.gwt.animation.AnimationData;
import com.akjava.gwt.three.client.gwt.core.BoundingBox;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayNumber;

public class Geometry extends JavaScriptObject{
protected Geometry(){}

public final native JsArray<Face> faces()/*-{
return this.faces;
}-*/;

public final native JsArray<Vector3> vertices()/*-{
return this.vertices;
}-*/;

/**
 * should call computeBoundingBox
 * @return
 */
public final native BoundingBox getBoundingBox()/*-{	
return this.boundingBox;
}-*/;

public final native void computeBoundingSphere()/*-{
this.computeBoundingSphere();
}-*/;

public final native void computeFaceNormals()/*-{
 this.computeFaceNormals();
}-*/;
public final native void computeCentroids()/*-{
this.computeFaceNormals();
}-*/;

public final native void computeVertexNormals()/*-{
 this.computeVertexNormals();
}-*/;

public final native void computeBoundingBox()/*-{
 this.computeBoundingBox();
}-*/;

public final native boolean getDirtyVertices()/*-{
return this.__dirtyVertices;
}-*/;

public final native void setDirtyVertices(boolean bool)/*-{
this.__dirtyVertices=bool;
}-*/;

public final native boolean getDynamic()/*-{
return this.dynamic;
}-*/;

public final native void setDynamic(boolean bool)/*-{
this.dynamic=bool;
}-*/;


public final native void applyMatrix(Matrix4 matrix)/*-{
this.applyMatrix(matrix);
}-*/;

public final native void computeTangents()/*-{
this.computeTangents();
}-*/;

public final native JsArray<MorphTarget> getMorphTargets()/*-{
return this.morphTargets;
}-*/;


public final native AnimationData getAnimation()/*-{
return this.animation;
}-*/;
public final native JsArray<AnimationBone> getBones()/*-{
return this.bones;
}-*/;


public final native void setBones(JsArray<AnimationBone> bones)/*-{
this.bones=bones;
}-*/;

//dont't call after meshed geometry
/**
 @deprecated
 */
public final native JsArrayNumber getSkinIndicesAsRaw()/*-{
return this.skinIndices;
}-*/;


//dont't call after meshed geometry
/**
@deprecated
*/
public final native JsArrayNumber getSkinWeightAsRaw()/*-{
return this.skinWeights;
}-*/;

//dont't call after meshed geometry
public final native void setSkinIndices(JsArray<Vector4> skinIndices)/*-{
this.skinIndices=skinIndices;
}-*/;

public final native void setSkinWeight(JsArray<Vector4> skinWeights)/*-{
this.skinWeights=skinWeights;
}-*/;

//dont't call after meshed geometry
public final native JsArray<Vector4> getSkinIndices()/*-{
return this.skinIndices;
}-*/;

public final native JsArray<Vector4>  getSkinWeight()/*-{
return this.skinWeights;
}-*/;

public native final JsArray<JsArray<UV>> getFaceVertexUvs ()/*-{
return this["faceVertexUvs"][0];
}-*/;

public native final Geometry clone()/*-{
return this.clone();
}-*/;



}
