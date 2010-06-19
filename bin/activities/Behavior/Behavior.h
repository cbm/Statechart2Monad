
#ifndef _Behavior_h_
#define _Behavior_h_ 1

#include "architecture/IActivity.h"
			
class Behavior : public IActivity {
			
public:
	
	int Execute ();
	
	void UserInit ();
	
	std::string GetName ();
	
};

#endif // _Behavior_h_
	