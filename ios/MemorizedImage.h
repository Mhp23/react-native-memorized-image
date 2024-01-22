
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNMemorizedImageSpec.h"

@interface MemorizedImage : NSObject <NativeMemorizedImageSpec>
#else
#import <React/RCTBridgeModule.h>

@interface MemorizedImage : NSObject <RCTBridgeModule>
#endif

@end
