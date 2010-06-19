
message ( STATUS "" )
message ( STATUS " _..::: Configuring KouretesAllConcurrentStatechart :::.._ " )
message ( STATUS "" )

add_library ( KouretesAllConcurrentStatechart ${LibBuildType}
        KouretesAllConcurrentStatechart.cpp )        

target_link_libraries ( KouretesAllConcurrentStatechart statechartEngine narukom )

install ( TARGETS KouretesAllConcurrentStatechart
RUNTIME DESTINATION   bin
LIBRARY DESTINATION   lib
ARCHIVE DESTINATION   lib/static )

set ( StatechartLibraries ${StatechartLibraries} KouretesAllConcurrentStatechart PARENT_SCOPE )
	