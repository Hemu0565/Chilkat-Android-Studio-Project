/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkMessageSet {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CkMessageSet(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkMessageSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkMessageSet(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkMessageSet() {
    this(chilkatJNI.new_CkMessageSet(), true);
  }

  public int get_Count() {
    return chilkatJNI.CkMessageSet_get_Count(swigCPtr, this);
  }

  public boolean get_HasUids() {
    return chilkatJNI.CkMessageSet_get_HasUids(swigCPtr, this);
  }

  public void put_HasUids(boolean newVal) {
    chilkatJNI.CkMessageSet_put_HasUids(swigCPtr, this, newVal);
  }

  public boolean ContainsId(int id) {
    return chilkatJNI.CkMessageSet_ContainsId(swigCPtr, this, id);
  }

  public boolean FromCompactString(String str) {
    return chilkatJNI.CkMessageSet_FromCompactString(swigCPtr, this, str);
  }

  public int GetId(int index) {
    return chilkatJNI.CkMessageSet_GetId(swigCPtr, this, index);
  }

  public void InsertId(int id) {
    chilkatJNI.CkMessageSet_InsertId(swigCPtr, this, id);
  }

  public boolean LoadTaskResult(CkTask task) {
    return chilkatJNI.CkMessageSet_LoadTaskResult(swigCPtr, this, CkTask.getCPtr(task), task);
  }

  public void RemoveId(int id) {
    chilkatJNI.CkMessageSet_RemoveId(swigCPtr, this, id);
  }

  public boolean ToCommaSeparatedStr(CkString outStr) {
    return chilkatJNI.CkMessageSet_ToCommaSeparatedStr(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String toCommaSeparatedStr() {
    return chilkatJNI.CkMessageSet_toCommaSeparatedStr(swigCPtr, this);
  }

  public boolean ToCompactString(CkString outStr) {
    return chilkatJNI.CkMessageSet_ToCompactString(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String toCompactString() {
    return chilkatJNI.CkMessageSet_toCompactString(swigCPtr, this);
  }

}
