
#ifndef _MyActivity_h_
#define _MyActivity_h_ 1

#include "architecture/IActivity.h"
			
class MyActivity : public IActivity {
			
public:
	
	int Execute ();
	
	void UserInit ();
	
	std::string GetName ();
	
};

#endif // _MyActivity_h_
	