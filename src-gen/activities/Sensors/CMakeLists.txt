
#if ( NOT ( ${TargetPlatform} STREQUAL "robot" AND ${RobotPlatform} STREQUAL "nao" ) )
#    return()
#endif ( NOT ( ${TargetPlatform} STREQUAL "robot" AND ${RobotPlatform} STREQUAL "nao" ) )

#include( ../../hal/robot/nao-1.6.0/bootstrap.cmake )

set ( ActivityName Sensors )

set ( ActivitySrcs  Sensors.cpp )

include ( ../activTemplate.cmake )

#use_lib(${ActivityName} ALCOMMON ALVALUE ALMATH LIBCORE TOOLS)	
	