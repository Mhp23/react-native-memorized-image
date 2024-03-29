package com.memorizedimage

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise

class MemorizedImageModule internal constructor(context: ReactApplicationContext) :
  MemorizedImageSpec(context) {

  override fun getName(): String {
    return NAME
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android

  companion object {
    const val NAME = "MemorizedImage"
  }
}
